import java.util.Calendar;
import java.util.GregorianCalendar;

public class ArbTaker {
    private Person person;
    int arbeidsNr;
    int ansettelsesAar;
    double maanedsLonn;
    double skatteProsent;
    java.util.GregorianCalendar kalender = new GregorianCalendar();
    
    public ArbTaker(Person person,int arbNr, int ansetaar, double mndLonn, double skatteprosent) {
        this.person = person;
        this.arbeidsNr = arbNr;
        this.ansettelsesAar = ansetaar;
        this.maanedsLonn = mndLonn;
        this.skatteProsent = skatteprosent/100;
    }

    public int getArbeidsNr() {
        return arbeidsNr;
    }

    public int getAnsettelsesaar() {
        return ansettelsesAar;
    }

    public String getNavn() {
        return this.person.etternavn + "," + this.person.fornavn;
    }

    public int getAlder() {
        int år = kalender.get(Calendar.YEAR);
        return år - this.person.getDato();
    }

    public int getAarIBedrift() {
        int år = kalender.get(Calendar.YEAR);
        return år - getAnsettelsesaar();
    }

    public Boolean aarIBedrif(int aar) {
        if(aar <= getAarIBedrift()) {
            System.out.println("ja?");
            return true;
        }
        System.out.println("nei?"); 
        return false;
    }

    public double getMaanedsLonn() {
        return maanedsLonn;
    }

    public double getSkatteprosent() {
        return skatteProsent;
    }

    public void setArbeidsNr(int nyttAnsattNr) {
        this.arbeidsNr = nyttAnsattNr;
    }

    public void setAnsettelsesaar(int nyttAnsattaar) {
        this.ansettelsesAar = nyttAnsattaar;
    }

    public void setMaanedslonn(double nyMndLonn) {
        this.maanedsLonn = nyMndLonn;
    }

    public void setSkatteProsent(double nySkatteProsent) {
        this.skatteProsent = nySkatteProsent/100;
    }

    public double skattPerAar() {
        double skattaar = (skattPerMnd() * 10  + (skattPerMnd()/2));
        return skattaar;
    }

    public double skattPerMnd() {
        double skattmnde = getMaanedsLonn() * getSkatteprosent();
        return skattmnde;
    }

    public double bruttoLonn() {
        double bruttoAar = getMaanedsLonn() * 12;
        return bruttoAar;
    }


}
    