import java.util.*;


public class Kleint {

    private static boolean giftig;


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Soppart> th = new ArrayList<>();
        Soppregister sR = new Soppregister(th);
        sR.regSoppart("Kantarell", "Sopp?", false);
        sR.regSoppart("Steinsopp", "Ser ut som en stein", false);
        sR.regSoppart("Fluesopp", "Rød med hvite prikker", true);

        final int AVSLUTT = 0;
        final int LIST_ALLE = 1;
        final int LIST_MATSOPP = 2;
        final int SOK = 3;
        final int LEGG_TIL = 4;


        while(true) {
            System.out.println("Hva vil du gjøre? \n" +
                    "0. Avslutt \n" +
                    "1. List alle sopparter \n" +
                    "2. List alle matsopper\n" +
                    "3. Sok\n" +
                    "4. Legg til ny soppart");
            int choice = s.nextInt();
            s.nextLine();

            switch(choice) {
                case AVSLUTT:
                    System.exit(0);

                case LIST_ALLE:
                    System.out.println(sR.info());
                    break;

                case LIST_MATSOPP:
                    System.out.println(sR.finnMatSopp());
                    break;

                case SOK:
                    System.out.println("Skriv inn hva du vil søke etter: ");
                    String beskrivelse = s.nextLine();
                    System.out.println(sR.finnBeskrivelse(beskrivelse));
                    break;

                case LEGG_TIL:
                    System.out.println("Navn på soppen");
                    String navn = s.nextLine();
                    System.out.println("Beskrivelse av soppen");
                    beskrivelse = s.nextLine();
                    System.out.println("Skriv 1 hvis soppen er giftig eller 0 hvis den er spiselig");
                    giftig = s.nextInt() == 1;
                    System.out.println(sR.regSoppart(navn, beskrivelse, giftig));

            }
        }
    }
}
