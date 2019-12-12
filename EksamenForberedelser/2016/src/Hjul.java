import java.util.*;

public final class Hjul {
    //Ett hjul har et merke, dimensjon og dekktype.
    private String merke;
    private double dimensjon;
    private String dekktype;

    public Hjul(String merke, double dimensjon, String dekktype) {
        this.merke = merke;
        this.dimensjon = dimensjon;
        this.dekktype = dekktype;
    }

    /**
     *
     * @return merke
     */
    public String getMerke() {
        return merke;
    }

    /**
     *
     * @return dimensjon
     */
    public double getDimensjon() {
        return dimensjon;
    }

    /**
     *
     * @return dekktype
     */
    public String getDekktype() {
        return dekktype;
    }

    @Override
    public String toString() {
        return "Merke: " + this.merke +
                "\nDimensjon: " + this.dimensjon +
                "\nDekktype: " + this.dekktype;
    }
}
