ddpackage com.madslun;

import java.util.Random;





    public static void main(String[] args) {

        int runde = 0;
        int helTallOvre = 20;
        int helTallNedre = 0;
        double desimalTallOvre = 0.5;
        double desimalTallNedre = 0;

        while (runde < 10) { //Kjører x antall ganger
            int helTall = MinRandom.nesteHeltall(helTallNedre, helTallOvre);
            double desimalTall = MinRandom.nesteDesimaltall(desimalTallNedre, desimalTallOvre);

            System.out.println("Heltall: " + helTall + "    Desimaltall: " + desimalTall); //Skriver ut heltall og desimaltall

            if (helTall > helTallOvre || helTall < helTallNedre){ //Sjekker om det er større eller mindre enn grense
                System.out.println("Feil");
                break; //Bryter ut av loop og avslutter program
            }
            else if (desimalTall > desimalTallOvre || desimalTall < helTallNedre) { //Sjekker om det er større eller mindre enn grense
                System.out.println("Feil");
                break; //Bryter ut av loop og avslutter program
            }

            runde++; //Legger til en på rundeteller
        }
    }
}
