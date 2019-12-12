package Oving2013;

import java.util.*;

public class DansePar {
    private static int teller = 0;
    private int id; // final?
    private String navn1;
    private String navn2;
    private ArrayList<Dans> danser;

    /**
     * Tar input og lager til objekt. Gir en unik id til hvert objekt
     * @param navn1 int
     * @param navn2 int
     * @param danser String
     */
    public DansePar(String navn1, String navn2, ArrayList<Dans> danser) {
        this.id = teller++;
        this.navn1 = navn1;
        this.navn2 = navn2;
        this.danser = danser;
    }

    /**
     * Returnerer ArrayListe med dansene til et Oving2013.DansePar
     * @return danser
     */
    public ArrayList<Dans> getDanser() {
        return danser;
    }

    /**
     * Setter nye danser til et objekt. Objektet Oving2013.Dans kan ikke eksistere uten Oving2013.DansePar
     * @param danser
     */
    public void setDanser(ArrayList<Dans> danser) {
        this.danser = danser;
    }

    /**
     * Registrer poengsum som stemmer overens med input
     * @param dans
     * @param poeng
     * @return true/false
     */
    public boolean regPoeng(String dans, int poeng) {
        //Looper gjennom alle danser i listen og sjekker om navnet til dansen er likt som inputen
        for(Dans d : danser) {
            if(d.getNavn().equalsIgnoreCase(dans)) {
                d.setPoeng(poeng);
                return true;
            }
        }
        return false;
    }

    /**
     * Samler sammen poengsummen fra alle danser
     * @return total
     */
    public int getPoengsumAlleDanser() {
        int total = 0;
        for(Dans d : danser){
            total += d.getPoeng();
        }
        return total;
    }

    /**
     * Sjekker om et objekt er likt som er objekt som allerede eksisterer
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        //Sjekker om objektet peker på samme minnelokasjon
        if (this == o) return true;
        //Sjekker at objektet er av typen Oving2013.DansePar
        if (!(o instanceof DansePar)) return false;
        DansePar dansePar = (DansePar) o;
        //Returner om navn1 eller navn2 er likt som noen andre
        return Objects.equals(navn1, dansePar.navn1) && Objects.equals(navn2, dansePar.navn2) ||
                (Objects.equals(navn1, dansePar.navn2) && Objects.equals(navn2, dansePar.navn1));
    }

    /**
     * Returnerer navn1
     * @return navn1
     */
    public String getNavn1() {
        return navn1;
    }

    /**
     * Returnerer navn2
     * @return navn2
     */
    public String getNavn2() {
        return navn2;
    }

    /**
     * Returnerer tekstString
     * @return String
     */
    @Override
    public String toString() {
        return "Danser nr1: " + this.navn1 +
                "\nDanser nr2: " + this.navn2 +
                "\nID: " + this.id +
                "\nDanser: " + this.danser.toString().replaceAll("]", "").replaceAll("\\[", "");
    }
}
