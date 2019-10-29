import java.util.*;

public class Main {


/*
Klassen MenyRegister skal tilby følgende operasjoner:
Å registrere en ny rett.
Å finne en rett, gitt navnet.
Å finne alle retter av en gitt type.
Å registrere en ny meny som består av ett sett med retter.
Å finne alle menyer med totalpris innenfor et gitt intervall.
*/


    
    public static Scanner s = new Scanner(System.in);

    private static Dish garlicBread = new Dish("Garlic bread", "Appetizer", 75, "Cut up a baguette, apply garlic and butter");
    private static Dish carbonara = new Dish("Carbonara", "Main", 150, "Cook pasta, cook guanciale, make sauce");
    private static Dish gelato = new Dish("Ice Cream", "Dessert", 110, "Make ice");
    //Menu containing the dishes above
    private static Menu italian = new Menu(new ArrayList<>(Arrays.asList(garlicBread, carbonara, gelato)));
    
    private static Dish bufallowings = new Dish("Buffalo Wings", "Appetizer", 60, "Marinate chicken wings in hot sauce");
    private static Dish steak = new Dish("T-bone steak", "Main", 250, "Marinate and use salt, grill good");
    private static Dish pancakes = new Dish("Pancakes", "Dessert", 120, "Flour, milk and eggs");
    //Menu containing the dishes above
    private static Menu american = new Menu(new ArrayList<>(Arrays.asList(bufallowings, steak, pancakes)));


    //Menu containing different dishes from the previous menues
    private static Menu mixed = new Menu(new ArrayList<>(Arrays.asList(garlicBread, steak, gelato)));

    //Registing alle the menues
    private static MenuRegister m1 = new MenuRegister(new ArrayList<>(Arrays.asList(italian,american/*, mixed*/)));


    private static String name;
    private static String type;
    private static double price;
    private static String recipe;

    public static void main(String [] args) {

        menu();

        
    }

    public static void menu() {
        MenuRegister menuReg = m1;

        while(true) {
            System.out.println( "0. Avslutt\n" +
                                "1. Antall menyer\n" +
                                "2. Registrer en ny rett\n" +
                                "3. Finn alle retter av en type\n" +
                                "4. Registrere en ny meny\n" +
                                "5. Finne alle menyer med innenfor gitt pris\n" + 
                                "6. Antall retter registrert totalt");           
            int choice = s.nextInt();
            switch(choice) {
                case 0:
                    System.out.println("Avslutter systemet");
                    System.exit(0);
                case 1:
                    System.out.println("\nAntall menyer: " + menuReg.numMenu());
                    break;
                case 2:
                    System.out.println("Navn på den nye retten: \n");
                    s.nextLine();
                    name = s.nextLine();
                    System.out.println("Hvordan type er retten? (Appetizer, Main, Dessert)");
                    type = s.nextLine();
                    System.out.println("Hva er oppskriften?");
                    recipe = s.nextLine();
                    System.out.println("Hva er prisen?");
                    price = s.nextDouble();
                    System.out.println("Registrert " + menuReg.regDish(name, type, price, recipe));
                    break;
                case 3:
                    System.out.println("Finne alle retter av en type");
                    break;
                case 4: 
                    System.out.println("Registrere en ny meny");
                    //Find dishes and 
                    break;
                case 5: 
                    System.out.println("Finne alle menyer innenfor en gitt pris");
                    break;
                case 6: 
                    System.out.println("Finne antall registrerte retter");
                    System.out.println("Antall retter er: " + menuReg.numDish());
                    break;
                default:
                    System.out.println("Du skrev noe feil...");
                    continue;
            }
        }
    }
}