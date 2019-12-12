import java.util.*;

public class Motor {
    private int motornr;
    private boolean girkasse;
    private String motortype;

    public Motor(int motornr, boolean girkasse, String motortype) {
        this.motornr = motornr;
        this.girkasse = girkasse;
        this.motortype = motortype;
    }

    /**
     *
     * @return motornr
     */
    public int getMotornr() {
        return motornr;
    }

    /**
     *
     * @return girkasse
     */
    public boolean getGirkasse() {
        return girkasse;
    }

    /**
     *
     * @return
     */
    public String getMotortype() {
        return motortype;
    }


    @Override
    public String toString() {

        return "Motoronr: " + this.motornr +
                "\nGirkasse: " + this.girkasse +
                "\nMotortype: " + this.motortype;
    }
}
