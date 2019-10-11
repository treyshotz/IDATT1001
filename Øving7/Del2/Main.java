//import java.nio.charset.Charset;
import java.util.Scanner;

class Main {

    private static Scanner s = new Scanner(System.in);
    private static final Tekstbehandling tekst  = new Tekstbehandling("Hei på deg Knut. Hvordan har du det");

    public static void main(String [] args) {
        System.out.println("Antall ord i teksten: " + tekst.ordLengde());
        System.out.println("Teksten: \n" + tekst.getTeksten());
        System.out.println(tekst.getTekstStore());
        System.out.println(tekst.gjennomsnitt());
        System.out.println(tekst.ordPerSetning());
        System.out.println("Velg et ord du vil erstatte");
        String gammeltOrd = s.nextLine();
        System.out.println("Velg et nytt ord: ");
        String nyttOrd = s.nextLine();
        System.out.println(tekst.erstattOrd(gammeltOrd, nyttOrd));

        
        //System.out.printl(tekst.erstattOrd(ord));
    }
}