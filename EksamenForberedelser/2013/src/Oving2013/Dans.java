package Oving2013;

import java.util.*;

public class Dans {
    private int poeng;
    private String navn;

    /**
     * Sette poeng automatisk til 0
     * @param navn
     */
    public Dans(String navn) {
        this.poeng = 0;
        this.navn = navn;
    }

    /**
     * Setter poengsum på objekt
     * @param poeng
     */
    public void setPoeng(int poeng) {
        this.poeng = poeng;
    }

    /**
     * Henter poengsum til et objekt
     * @return
     */
    public int getPoeng() {
        return poeng;
    }

    /**
     * Henter navn til et objekt
     * @return
     */
    public String getNavn() {
        return navn;
    }

    @Override
    public String toString() {
        return "Oving2013.Dans: " + this.navn +
                "\nPoeng: " + this.poeng;
    }
}
