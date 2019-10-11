import java.util.*;
import java.util.Scanner;   


class Main {

    private static Scanner s = new Scanner(System.in, System.getProperty("file.encoding"));

    public static void main(String [] args) {
        String tekstfrabruker;
        Analyse tekstfrabrukeren;
        String bokstav;


       
        do {
            System.out.println("Skriv inn en tekst");
            tekstfrabruker = s.nextLine();
            tekstfrabrukeren = new Analyse(tekstfrabruker);
            System.out.println("Teksten har en lengde paa " + tekstfrabrukeren.lengde() + " symboler");
            System.out.println("Det er " + tekstfrabrukeren.ulike() + " ulike bokstaver"); //Skriver ikke ut antall ulike bokstaver 
            System.out.println("Det er " + tekstfrabrukeren.bokstaver() + " antall bokstaver");
            System.out.println("Det er " + tekstfrabrukeren.symboler() + "%  symboler"); //Blir feil fordi antall ulike er feil
            System.out.println("Velg en bokstav");
            bokstav = s.nextLine();
            System.out.println("Det er " + tekstfrabrukeren.antallGanger(bokstav) + " av bokstaven '" + bokstav + "'"); //Skriver ut feil, skriver ut 0
            //System.out.println("Det er" + tekstfrabrukeren.flestGanger());
            tekstfrabrukeren.flestGanger();
        }
        while(tekstfrabruker !=null);

    }
}