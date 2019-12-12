import java.util.*;

public class Main {

    private static Scanner s = new Scanner(System.in);
    private static UtleieFirma Oves = new UtleieFirma("Oves", 10);

    public static void main(String[] args) {

        while (true) {

            System.out.println("1. Ny bil");
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("ny bil");
                    Oves.regNyBil(12341, "Michelin", 1234, "Vinter", 4321, true, "Diesel");
                    System.out.println(Oves.toString());
                    System.out.println("--------------------");
                    Oves.regNyBil(4321, "Pilot", 123, "Vinter", 54321, true, "Elektrisk");
                    System.out.println(Oves.toString());
                    System.out.println("--------------------");

                    System.out.println(Oves.sorter());


            }
        }
    }
}
