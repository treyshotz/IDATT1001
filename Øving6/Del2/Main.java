
import java.util.*;
import java.util.Scanner;

class Main {

    private static Scanner in = new Scanner(System.in);
    
    public static void main(String [] args) {

        do {
            System.out.println("\nSkriv inn en tekst");
            String teksten = in.nextLine();
            Analyse tekst = new Analyse(teksten);
            System.out.println("Lengden på teksen er " + tekst.length() +" tegn.");
            System.out.println("Det er " + tekst.antallUlikebokstaver() + " ulike bokstaver i teksten.");
          

        }
        while (true);
    }
}