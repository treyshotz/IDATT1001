import java.util.*;
import java.math.*;

public class Brok {
    private int teller;
    private int nevner;

    /**
     * Throws exception is nevner == 0
     * @param teller
     * @param nevner
     */
    public Brok(int teller, int nevner) {
        if(nevner==0) {
            throw new IllegalArgumentException("Nevner er 0");
        }
        this.teller = teller;
        this.nevner = nevner;
    }

    /**
     * Sets nevner to 1
     * @param teller
     */
    public Brok(int teller) {
        this.teller = teller;
        this.nevner = 1;
    }

    /**
     * Sets new values for teller and never by multiplying with input
     * @param teller
     * @param nevner
     */
    public void multiplikasjon(int teller, int nevner) {
        this.teller = this.teller*teller;
        this.nevner = this.nevner*nevner;
        gcd(this.teller, this.nevner);

    }

    public void divisjon(int teller, int nevner) {
        this.teller = this.teller*nevner;
        this.nevner = this.nevner*teller;
        gcd(this.teller, this.nevner);

    }

    public void addisjon(int teller, int nevner) {
        this.teller = (this.teller*nevner) + (teller*this.nevner);
        this.nevner = (this.nevner*teller) + (nevner*this.teller);
        gcd(this.teller, this.nevner);

    }

    public void gcd(int teller, int nevner) {
        BigInteger teller1 = new BigInteger(String.valueOf(teller));
        BigInteger nevner1 = new BigInteger(String.valueOf(nevner));
        BigInteger gcd = teller1.gcd(nevner1);
        int gcdI = gcd.intValue();
        this.teller = this.teller/gcdI;
        this.nevner = this.nevner/gcdI;
    }

    /**
     * returns teller
     * @return teller
     */
    public int getTeller() {
        return teller;
    }

    /**
     * returns nevner
     * @return never
     */
    public int getNevner() {
        return nevner;
    }
}
