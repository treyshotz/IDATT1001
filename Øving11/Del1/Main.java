import java.util.*;

public class Main {


/*
Registrere/legge inn eiendomSkrive ut alle eiendommer som er registrert
Søke etter eiendom basert på kommunenr, gnr og bnr (alle 3 samtidig)
Regne ut og vise gjennomsnitts areal av alle eiendommene i registeret
*/

    public Scanner s = new Scanner(System.in);


    public static RealEstate nr1 = new RealEstate(1445, "Gloppen", 77, 631, "", 1017.6, "Jens Olsen");
    public static RealEstate nr2 = new RealEstate(1445, "Gloppen", 77, 131, "Syningom", 661.3, "Nicolay Madsen");
    public static RealEstate nr3 = new RealEstate(1446, "Gloppen", 75, 19, "Fugletun", 650.6, "Evilyn Jensen");
    public static RealEstate nr4 = new RealEstate(1446, "Gloppen", 74, 188, "", 1457.2, "Karl Ove Bråten");
    public static RealEstate nr5 = new RealEstate(1446, "Gloppen", 69, 47, "Høiberg", 1339.4, "Elsa Indregård");
    public static ArrayList<RealEstate> estates = new ArrayList<>(Arrays.asList(nr1, nr2, nr3, nr4, nr5));

    public static void main(String [] args) {
        RealEstateReg realEstates = new RealEstateReg(estates);




    }
}