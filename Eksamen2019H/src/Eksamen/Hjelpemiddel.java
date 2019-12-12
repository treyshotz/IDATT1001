package Eksamen;

/**
 * The type Eksamen.Hjelpemiddel.
 */
public class Hjelpemiddel {
    //Klasse variabel som benyttes til å gi unik id til hvert objekt
    private static int hTeller = 1001;
    private static int sTeller = 2001;
    private static int vTeller = 3001;
    private static String høre = "Høreapparat";
    private static String samtale = "Samtaleforsterker";
    private static String varsling = "Varslingsutstyr";
    private int id;
    private String type;
    private boolean utleid;
    private String leietaker;


    /**
     * Konstruktør for oppretting av objekt av typen Eksamen.Hjelpemiddel
     *
     * @param type, String
     * @param utleid, boolean
     * @param leietaker, String
     */
    public Hjelpemiddel(String type, boolean utleid, String leietaker) {
        this.type = type;
        this.utleid = utleid;
        this.leietaker = leietaker;

        //Setter her en unik id til hvert objekt basert på type
        if(type.equalsIgnoreCase(høre)) this.id = hTeller++;
        else if (type.equalsIgnoreCase(samtale)) this.id = sTeller++;
        else if (type.equalsIgnoreCase(varsling)) this.id = vTeller++;
    }


    /* Vurderte å ha en annen konstruktør som ble brukt når et objekt ikke ble leid ut
    Det oppstod problemer når man skulle registrere utleie og konstruktøren ble kommentert ut
    Etter clean code prinsipp burde den fjernes men vil ta med for å vise tanken
     */
    /*
    public Eksamen.Hjelpemiddel(String type, boolean utleid) {
        //Setter her en unik id til hvert objekt
        this.id = teller++;
        this.type = type;
        this.utleid = utleid;
    } */


    /**
     * Henter id.
     *
     * @return id, int
     */
    public int getId() {
        return id;
    }


    /**
     * Henter type.
     *
     * @return type, String
     */
    public String getType() {
        return type;
    }


    /**
     * Er utleid boolean.
     *
     * @return utleid, boolean
     */
    public boolean isUtleid() {
        return utleid;
    }

    /**
     * Gets leietaker.
     *
     * @return leietaker, String
     */
    public String getLeietaker() {
        return leietaker;
    }

    /**
     * Setter utleid.
     *
     * @param utleid, boolean
     */
    public void setUtleid(boolean utleid) {
        this.utleid = utleid;
    }

    /**
     * Setter leietaker på objektet
     *
     * @param leietaker, String
     */
    public void setLeietaker(String leietaker) {
        this.leietaker = leietaker;
    }


    /**
     * Equals metode som tar inn et objekt og sammenligner
     * @param o, Ovbject
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        //Sjekker om objektet peker på samme minnelokasjon
        if (this == o) return true;
        //Sjekker at objektet er av typen Eksamen.Hjelpemiddel
        if (!(o instanceof Hjelpemiddel)) return false;
        Hjelpemiddel that = (Hjelpemiddel) o;
        //Sjekker om Id er lik på begge objektene
        return getId() == that.getId();
    }


    /**
     * Returnerer tekststreng basert på om objektet er utleid
     * @return String
     */
    @Override
    public String toString() {
        //Sjekker om objektet er utleid eller ikke
        if(this.isUtleid()) {
            return (this.id + " " + this.type + " utleid til " + this.leietaker ).trim() + ("\n");
        }
        return (this.id + " " + this.type + " ledig").trim() + "\n";
    }
}


