import java.util.*;

public class Main {

/* 
    Å registrere et nytt arrangement
    Å finne alle arrangementer på et gitt sted
    Å finne alle arrangementer på en gitt dato
    Å finne alle arrangementer innenfor et tidsintervall gitt ved to datoer. Listen skal
    være sortert på tid.
    Å lage lister over alle arrangementer, sortert etter henholdsvis sted, type og
    tidspunkt. 
*/



    public static Scanner s = new Scanner(System.in);

    private static Arrangement Palmesus = new Arrangement("Palmesus", 1, "Kristiansand", "Konsert", 180003072018L); 
    private static Arrangement Kaperdagene = new Arrangement("Kaperdage", 2, "Farsund", "Forestilling", 210014072018L);
    private static ArrayList<Arrangement> Arrangementer = new ArrayList<>();


    public static void main(String [] args) {
        Arrangementer.add(Palmesus);
        Arrangementer.add(Kaperdagene);


        
    }


    public static void menu() {
        ArrangementRegister arrReg = new ArrangementRegister(Arrangementer);
        while(true) {
            System.out.println("Du kan nå velge mellom: \n" +
                                "0. Avslutt \n" +
                                "1. Registrere et nytt arrangement \n" +
                                "2. Å finne alle arrangementer på et gitt sted \n" +
                                "3. Å finne alle arrangementer på en gitt dato \n" +
                                "4. Å finne alle arrangement mellom to datoer \n" +
                                "5. Å lage list over alle arrangementer, sortert");

            int choice = s.nextInt();
            switch(choice) {
                case(0):
                    System.out.println("Avslutter....");
                    System.exit(0);
                case(1):
                    System.out.println("\nNavn på det nye arrangementet:");
                    s.nextLine();
                    String name = s.nextLine();
                    int id = 3; //get Arrangementer.size(); id = x+1
                    System.out.println("Plassering på arrangementet:");
                    String place = s.nextLine();
                    System.out.println("Type arrangement: ");
                    String type = s.nextLine();
                    System.out.println("Dato på arrangementet, i format HHMMDDMMYYYY");
                    long date = s.nextLong();
                    Arrangement newArr = new Arrangement(name, id, place, type, date);
                    System.out.println("Registrert");
                    break;

            }
        }
    }
}