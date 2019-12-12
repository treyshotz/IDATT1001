import java.lang.reflect.Array;
import java.util.*;

public class Bil {

    private int regnr;
    private Motor motor;
    private ArrayList<Hjul> hjul;

    public Bil(int regnr, String merke, double dimensjon, String dekktype, int motornr, boolean girkasse, String motortype) {
        this.regnr = regnr;
        this.motor = new Motor(motornr, girkasse, motortype); // TODO: komposisjon eller aggregering?
        this.hjul = setHjul(merke, dimensjon, dekktype);
    }

    /**
     * Lager en ArrayList med 4 hjul
     * @param merke
     * @param dimensjon
     * @param dekktype
     * @return hjul
     */
    private ArrayList<Hjul> setHjul(String merke, double dimensjon, String dekktype) {
        //Oppretter en ny ArrayList med plass til fire objekter av typer Hjul
        ArrayList<Hjul> hjul = new ArrayList<>(4);

        //Lokke hvor jeg oppretter nytt objekt for lokke, med samme verdier men ulike objekt.
        for(int i = 0; i < 4; i++) {
            Hjul dekk = new Hjul(merke, dimensjon, dekktype);
            hjul.add(dekk);
        }
        return hjul;
    }

    /**
     * Lager en ArrayList med Bakhjul
     * @param merke
     * @param dimensjon
     * @param dekktype
     * @return bakHjul
     */
    private ArrayList<Hjul> setBakHjul(String merke, double dimensjon, String dekktype) {
        //Oppretter en ny ArrayList med plass til to objekter av typer Hjul
        ArrayList<Hjul> bakHjul = new ArrayList<>(2);
        Hjul dekk = new Hjul(merke, dimensjon, dekktype);
        for(int i = 0; i < 2; i++) {
            bakHjul.add(dekk);
        }
        return bakHjul;
    }

    /**
     * Lager en ArrayList med Framhjul
     * @param merke
     * @param dimensjon
     * @param dekktype
     * @return framHjul
     */
    private ArrayList<Hjul> setFramHjul(String merke, double dimensjon, String dekktype) {
        //Oppretter en ny ArrayList med plass til to objekter av typer Hjul
        ArrayList<Hjul> framHjul = new ArrayList<>(2);
        Hjul dekk = new Hjul(merke, dimensjon, dekktype);
        for(int i = 0; i < 2; i++) {
            framHjul.add(dekk);
        }
        return framHjul;
    }

    public int getRegnr() {
        return regnr;
    }

    public Motor getMotor() {
        return motor;
    }

    // TODO: komposisjon eller aggregering
    public ArrayList<Hjul> getHjul() {
        return hjul;
    }

    /**
     * Sjekker om objektet eksisterer, sjekker at det er av objekt typen Bil, sjekker om regnr eller motornr er like
     * @param o
     * @return true/false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bil)) return false;
        Bil bil = (Bil) o;
        return getRegnr() == bil.getRegnr() &&  getMotor().getMotornr() == bil.getMotor().getMotornr(); // TODO: bruk this.regnr etc
    }


    @Override
    public String toString() {
        return "Regnr: " + this.regnr + "" +
                "\nMotor: " + motor.toString() +
                "\nHjul: " + hjul.toString();
    }
}
