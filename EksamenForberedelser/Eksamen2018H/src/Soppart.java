import java.util.*;

public class Soppart {

    private final String navn;
    private final String beskrivelse;
    private final boolean giftig;

    /**
     * @param navn
     * @param beskrivelse
     * @param giftig
     */
    //Tar input String navn, String beskrivelse, boolean giftig og lager et objekt av typen Soppart
    public Soppart(String navn, String beskrivelse, boolean giftig) {
        this.navn = navn;
        this.beskrivelse = beskrivelse;
        this.giftig = giftig;
    }

    /**
     * @param o
     */
    //Tar input av typen objekt Soppart og kaller den o
    public Soppart(Soppart o) {
        this(o.getNavn(), o.getBeskrivelse(), o.isGiftig());
    }


    public String getNavn() {
        return navn;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public boolean isGiftig() {
        return giftig;
    }

    /**
     *
     * @param o
     * @return true/false
     */
    //Tar input av typen Object og kaller den o
    @Override
    public boolean equals(Object o) {
        //Sjekker om inputen allerede finnes
        if (this == o) return true;
        //Sjekker om input faktisk er en Soppart
        if (!(o instanceof Soppart)) return false;
        Soppart soppart = (Soppart) o;
        //Returner sann eller falsk om navnene er like
        return Objects.equals(getNavn(), soppart.getNavn());
    }


    /**
     * @param beskrivelse
     * @return true/false
     */
    //Tar input String om sjekker om den er lik en annen beskrivelse
    public boolean beskrivelseSjekker(String beskrivelse) {
        if(beskrivelse.contains(this.getBeskrivelse())) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String giftig = "";
        if(isGiftig()) {
            giftig = "Giftig";
        }
        else {
            giftig = "Matsopp";
        }

        return this.getNavn() + " " + this.getBeskrivelse() + " " + giftig;
    }
}
