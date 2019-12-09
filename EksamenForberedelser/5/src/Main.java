import java.util.*;

public class Main {

    private static Brok brok1 = new Brok(1, 2);
    private static Brok brok2 = new Brok(2, 4);

    public static void main(String[] args) {
        brok1.multiplikasjon(400,784);
        System.out.println("Multiplikasjon:\n" + "Teller: " + brok1.getTeller() + "\nNevner: " + brok1.getNevner());

        brok1.divisjon(1,4);
        System.out.println("Divisjon:\n" + "Teller: " + brok1.getTeller() + "\nNevner: " + brok1.getNevner());

        brok1.addisjon(1,4);
        System.out.println("Addisjon:\n" + "Teller: " + brok1.getTeller() + "\nNevner" + brok1.getNevner());
    }
}
