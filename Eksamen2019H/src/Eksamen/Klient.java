package Eksamen;

import java.util.*;

public class Klient {
    /*
    a. Lag kode for å registrere et nytt hjelpemiddel

    b. Lag kode for å skrive ut informasjon om alle registrerte hjelpemidler med utleiestatus Eksempel på utskrift:
    */

    // Constants representing the different menu choices
    private final static int ADD_HEARING_AID = 1;
    private final static int LIST_ALL_HEARING_AIDS = 2;
    private final static int REGISTRER_NYTT_FORHOLD = 3;
    private final static int AVSLUTT_FORHOLD = 4;
    // ---- add more constants as needed ---
    private final static int EXIT = 9;
    private static Scanner s = new Scanner(System.in);

    //Oppretter flere objekter av typen hjelpemiddel for testing
    static Hjelpemiddel h1 = new Hjelpemiddel("Høreapparat", true, "Kim Andre");
    static Hjelpemiddel h2 = new Hjelpemiddel("Høreapparat", false, "");
    static Hjelpemiddel s1 = new Hjelpemiddel("Samtaleforsterker", true, "Alv");
    static Hjelpemiddel s2 = new Hjelpemiddel("Samtaleforsterker", false, "");
    static Hjelpemiddel v1 = new Hjelpemiddel("Varslingsutstyr", true, "Yngvar");
    static Hjelpemiddel v2 = new Hjelpemiddel("Varslingsutstyr", false, "");

    //Legger det til i en ArrayListe
    static ArrayList<Hjelpemiddel> utstyr = new ArrayList<>(Arrays.asList(h1,h2,s1,s2,v1,v2));


    public static void main(String[] args) {
        start();
    }


    /**
     * Presents the menu for the user, and awaits input from the user. The menu
     * choice selected by the user is being returned.
     *
     * @return the menu choice by the user as a positive number starting from 1.
     *                 If 0 is returned, the user has entered a wrong value
     */
    private static int showMenu()

    {
        int menuChoice = 0;

        System.out.println("\n***** Hearing Aid Central v0.1 *****\n");
        System.out.println("1. Add hearing aid");
        System.out.println("2. List all hearing aids");
        System.out.println("3. Registrer nytt forhold");
        System.out.println("4. Avslutt forhold");

        //TODO: Add more menus


        System.out.println("9. Quit"); // Or another number than 9
        System.out.println("\nPlease select from the menu.\n");

        if (s.hasNextInt())
        {
            menuChoice = s.nextInt();
        } else
        {
            System.out.println("You must enter a number, not text");
        }
        return menuChoice;
    }


    /**
     * Starts the application. This is the main loop of the application,
     * presenting the menu, retrieving the selected menu choice from the user,
     * and executing the selected functionality.
     */
    public static void start() {
        Hjelpemiddelsentralen Farsund = new Hjelpemiddelsentralen(utstyr, "Farsund");
        boolean finished = false;

        // The while-loop will run as long as the user has not selected
        // to quit the application
        while (!finished) {
            int menuChoice = showMenu();
            switch (menuChoice)
            {
                case ADD_HEARING_AID:
                    System.out.println("Skriv inn typen hjelpemiddel:");
                    s.nextLine();
                    String type = s.nextLine();
                    System.out.println("Er det utleid? Ja/Nei");
                    String valg = s.nextLine();
                    boolean utleid = (valg.equalsIgnoreCase("ja")) ? true : false;
                    String leietaker = "";
                    if(utleid) {
                        System.out.println("Navnet på leietaker");
                        leietaker = s.nextLine();
                    }
                    Farsund.regHjelpemiddel(type, utleid, leietaker);
                    break;

                case LIST_ALL_HEARING_AIDS:
                    System.out.println(Farsund.listAlle());
                    break;

                case REGISTRER_NYTT_FORHOLD:
                    System.out.println("Skriv inn id på hjelpemiddelet");
                    int id = s.nextInt();
                    s.nextLine();
                    System.out.println("Skriv inn typen");
                    type = s.nextLine();
                    System.out.println("Skriv inn navn på leietaker");
                    String navn = s.nextLine();

                    Farsund.regUteleier(type, id, navn);
                    break;

                case AVSLUTT_FORHOLD:
                    System.out.println("Skriv in typen");
                    s.nextLine();
                    type = s.nextLine();
                    System.out.println("Skriv inn navn på leietaker");
                    leietaker = s.nextLine();
                    Farsund.avsluttLeie(type, leietaker);
                    break;

                // ---- Add more cases here if needed ----

                case EXIT:
                    System.out.println("Thank you for using the Properties app!\n");
                    finished = true;
                    break;

                default:
                    System.out.println("Unrecognized menu selected..");
                    break;
            }
        }
    }
}
