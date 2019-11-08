import java.util.*;

public class Main {


/*
Registrere/legge inn eiendom
Skrive ut alle eiendommer som er registrert
Søke etter eiendom basert på kommunenr, gnr og bnr (alle 3 samtidig)
Regne ut og vise gjennomsnitts areal av alle eiendommene i registeret
*/

    public static Scanner s = new Scanner(System.in);


    public static RealEstate nr1 = new RealEstate(1445, "Gloppen", 77, 631, "", 1017.6, "Jens Olsen");
    public static RealEstate nr2 = new RealEstate(1445, "Gloppen", 77, 131, "Syningom", 661.3, "Nicolay Madsen");
    public static RealEstate nr3 = new RealEstate(1446, "Gloppen", 75, 19, "Fugletun", 650.6, "Evilyn Jensen");
    public static RealEstate nr4 = new RealEstate(1446, "Gloppen", 74, 188, "", 1457.2, "Karl Ove Bråten");
    public static RealEstate nr5 = new RealEstate(1446, "Gloppen", 69, 47, "Høiberg", 1339.4, "Elsa Indregård");
    public static ArrayList<RealEstate> estates = new ArrayList<>(Arrays.asList(nr1, nr2, nr3, nr4, nr5));

    public static void main(String [] args) {

    menu();


    }

    public static void menu() {
        RealEstateReg realEstates = new RealEstateReg(estates);

        while(true) {
            System.out.println("Velkommen til dette dritt programmet. Du kan nå velge mellom:\n" +
            "0. Avslutt\n" +
            "1. Registrere en ny eiendom\n" +
            "2. Skrive ut alle eiendommer som er registrert\n" + 
            "3. Søke etter eiendom basert på kommunoenr, gnr og bnr\n" +
            "4. Regne ut og vise gjennomsnitts areal av alle eiendommene i registeret\n" + 
            "5. Fjerne en eiendom\n" + 
            "6. Skrive ut antall eiendommer"
            );
            
            int choice = s.nextInt();

            switch(choice) {
                case 0:
                    System.out.println("Avslutter...");
                    System.exit(0);
                    case 1:
                    System.out.println("Registrere en ny eiendom");
                    System.out.println("Kommune nr?");
                    int munNum = s.nextInt();
                    System.out.println("Kommune navn?");
                    s.nextLine();
                    String munName = s.nextLine();
                    System.out.println("lotNum?");
                    int lotNum = s.nextInt();
                    System.out.println("Secnum?");
                    int secNum = s.nextInt();
                    s.nextLine();
                    System.out.println("Name?");
                    String name = "";
                    name = s.nextLine();
                    System.out.println("Area?");
                    double area = s.nextDouble();
                    System.out.println("ownName");
                    s.nextLine();
                    String ownName = s.nextLine();
                    System.out.println("Registrerte en " + realEstates.newRealEstate(munNum, munName, lotNum, secNum, name, area, ownName));
                    break;
                case 2:
                    System.out.println("Skrive ut alle eiendommer som er registrert");
                    System.out.println(realEstates.listAll().toString());
                    break;
                case 3:
                    System.out.println("Søke etter eiendom basert på kommunoenr, gnr og bnr");
                    System.out.println("Kommune nr?");
                    munNum = s.nextInt();
                    System.out.println("Gnr?");
                    lotNum = s.nextInt();
                    System.out.println("Bnr?");
                    secNum = s.nextInt();
                    System.out.println(realEstates.listWNum(munNum, lotNum, secNum).toString());
                    break;
                case 4:
                    System.out.println("Regne ut og vise gjennomsnitts areal av alle eiendommene i registeret");
                    System.out.println("Arealet er " + realEstates.avgArea());
                    break;
                case 5:
                    System.out.println("Fjerne en eiendom");
                    System.out.println("Skriv inn Kommune nr?");
                    munNum = s.nextInt();
                    System.out.println("Gnr?");
                    lotNum = s.nextInt();
                    System.out.println("Bnr?");
                    secNum = s.nextInt();
                    System.out.println(realEstates.delRealEstate(munNum, lotNum, secNum));
                    break;
                case 6:
                    System.out.println("\nAntall eiendommer er: " + realEstates.numReal() + "\n");
                    break;
                default: 
                    System.out.println("Du skrev inn noe feil...");
                    continue;
            }
        }
    }
}