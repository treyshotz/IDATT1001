package Oving2013;

import java.util.*;

public class SkalViDanse {

    private ArrayList<DansePar> parene;
    private static int antall = 0;


    public SkalViDanse(ArrayList<DansePar> parene) {
        this.parene = parene;
        this.antall = parene.size();
    }

    /**
     * Registrerer et nytt dansepar
     * @param navn1
     * @param navn2
     * @param dans
     * @return true/false
     */
    public boolean regDansePar(String navn1, String navn2, ArrayList<Dans> dans) {
        //Sjekker om noen av inputtene er blanke
        if(navn1.isBlank() || navn2.isBlank() || dans.size() <= 0) return false;

        //Bruker equals metoden for å sjekke om objektet finnes
        //Argumenter hvorfor du ikke lager en ny metode for dette istedet
        DansePar nyDP = new DansePar(navn1, navn2, dans);
        for(DansePar dP : parene) {
            if(dP.equals(nyDP)) return false;
        }

        //Legger til nye danseparet
        parene.add(nyDP);
        return true;
    }


    /**
     * Registrer poeng på et par utifra input fra bruker
     * @param navn1
     * @param navn2
     * @param dans
     * @param poeng
     * @return
     */
    public boolean regPoengDansePar(String navn1, String navn2, String dans, int poeng) {
        //Sjekker om noen av input er tomme
        if(navn1.isBlank() || navn2.isBlank() || dans.isBlank()) return false;

        //Looper gjennom danseparene og sjekker navnene stemmer med input
        for(DansePar dP : parene) {
            if((dP.getNavn1().equalsIgnoreCase(navn1) && dP.getNavn2().equalsIgnoreCase(navn2)) ||
            dP.getNavn1().equalsIgnoreCase(navn2) && dP.getNavn2().equalsIgnoreCase(navn1)) {
                //Returnerer hvis det gikk å registrere poeng
                if(dP.regPoeng(dans, poeng)) return true; // her kan du returnere selve metoden du kaller på
            }
        }
        return false;
    }

    /**
     * Sorterer en kopi av registeret og returnerer kopien
     * @return sortert
     */
    public ArrayList<DansePar> sorterTotalPoeng() {
        //Lager et kopi av eksisterende register
        ArrayList<DansePar> sortert = new ArrayList<>(parene); // grunn kopi - du må kopiere alle objektene, nå peker alle objektene i den nye listen på de samme som den forrige
        //Sjekker at listen ikke er tom
        if(sortert.size() <= 0) return null; // .isEmpty()

        //Sorterer poengsum til dansepar
        Collections.sort(sortert, new sorterPoengsum());
        return sortert;
    }

}


class sorterPoengsum implements Comparator<DansePar>{
    /**
     * Sammenligner to Oving2013.DansePar
     * @param a
     * @param b
     * @return int
     */
    public int compare(DansePar a, DansePar b) {
        return a.getPoengsumAlleDanser() - b.getPoengsumAlleDanser();
    }
}
