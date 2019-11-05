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


//Må også opprette flere sort så jeg kan sortere på navn osv



    public static Scanner s = new Scanner(System.in);

    private static Arrangement Palmesus = new Arrangement("Palmesus", 1, "Kristiansand", "Konsert", 180003072018L); 
    private static Arrangement Kaperdagene = new Arrangement("Kaperdagene", 2, "Farsund", "Forestilling", 210014072018L);
    private static Arrangement Sushi = new Arrangement("Sushi", 3, "Kristiansand", "Mat", 123456789101L);
    private static ArrayList<Arrangement> Arrangementer = new ArrayList<>();
    static String name;
    static long date1;
    static long date2;


    public static void main(String [] args) {
        Arrangementer.add(Palmesus);
        Arrangementer.add(Kaperdagene);
        Arrangementer.add(Sushi);
        System.out.println("Velkommen til dette jævla shit programmet");
        menu();

       
        
    }


    public static void menu() {
        ArrangementRegister arrReg = new ArrangementRegister(Arrangementer);
        while(true) {
            System.out.println("\nDu kan nå velge mellom: \n" +
                                "0. Avslutt \n" +
                                "1. Registrere et nytt arrangement \n" +
                                "2. Å finne alle arrangementer på et gitt sted \n" +
                                "3. Å finne alle arrangementer på en gitt dato \n" +
                                "4. Å finne alle arrangement mellom to datoer \n" +
                                "5. Å lage list over alle arrangementer, sortert\n" +
                                "6. Å finne antall arrangementer registrert \n" +
                                "7. Å finne arrangement med navn");

            int choice = s.nextInt();
            switch(choice) {
                case(0):
                    System.out.println("Avslutter....");
                    System.exit(0);
                case(1):
                    System.out.println("\nNavn på det nye arrangementet:");
                    s.nextLine();
                    name = s.nextLine();
                    int ant = arrReg.antRegArr();
                    int id = ant +1;
                    System.out.println("Plassering på arrangementet:");
                    String place = s.nextLine();
                    System.out.println("Type arrangement: ");
                    String type = s.nextLine();
                    System.out.println("Dato på arrangementet, i format HHMMDDMMYYYY");
                    long date = s.nextLong();
                    Arrangement newArr = new Arrangement(name, id, place, type, date);
                    System.out.println("Registrert" + arrReg.regNewArr(newArr));
                    break;
                case(2):
                    System.out.println("Skriv inn navnet på plassen");
                    s.nextLine();
                    name = s.nextLine();
                    System.out.println(arrReg.findArrPlace(name));
                    break;           
                case(3):
                    System.out.println("Skriv inn dato i format HHMMDDMMYYYY: ");
                    date1 = s.nextLong();
                    System.out.println(arrReg.findArrOneDate(date1).toString());
                    break;
                case(4):
                    System.out.println("Skriv inn første dato i formatet HHMMDDMMYYYY");
                    date1 = s.nextLong();
                    System.out.println("Skriv inn nesste dato i formate HHMMDDMMYYYY");
                    date2 = s.nextLong();
                    //Legg til sort by date
                    System.out.println(arrReg.findArrTwoDate(date1, date2).toString());
                    break;
                case(5):
                    //arrReg.listByDate();
                    System.out.println("Hva vil du sortere mellom? \n" +
                    "1. Dato \n" +
                    "2. Navn \n" +
                    "3. Type \n" +
                    "4. Plass");
                    choice = s.nextInt();
                    switch(choice) {
                        case(1):
                            Collections.sort(Arrangementer, new sortByDate());
                            System.out.println(Arrangementer.toString());
                            break;
                        case(2):
                            Collections.sort(Arrangementer, new sortByName());
                            System.out.println(Arrangementer.toString());
                            break;
                        case(3):
                            Collections.sort(Arrangementer, new sortByType());
                            System.out.println(Arrangementer.toString());
                            break;
                        case(4):
                            Collections.sort(Arrangementer, new sortByPlace());
                            System.out.println(Arrangementer.toString());
                            break;
                        default:
                            System.out.println("Du skrev noe feil...");
                            continue;
                    }

                    break;
                case(6):
                    System.out.println("Antall arrangement registrert er: " + arrReg.antRegArr());
                    break;
                case(7):
                    System.out.println("Skriv inn navnet på arrangementet");
                    s.nextLine();
                    name = s.nextLine();
                    arrReg.findArrName(name);
                    //System.out.println(arrReg.findArrName(name));
                    break;
                default:
                    System.out.println("Du skrev noe feil. Prøv på nytt");

            }
        }
    }
}