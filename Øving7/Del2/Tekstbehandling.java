import java.util.Arrays;


class Tekstbehandling {
    private String tekst;
    private String ord;


    /*
Done    � � finne antall ord i teksten.
Done    � � finne gjennomsnittlig ordlengde. Skilletegn er ikke en del av ordene.
Done    � � finne gjennomsnittlig antall ord per periode. Bruk punktum, utropstegn, kolon og
    sp�rretegn som skilletegn mellom periodene. Anta at teksten er feilfri, slik at ikke to
    eller flere slike tegn f�lger etter hverandre.
Done    � � skifte ut et ord med et annet gjennom hele teksten. For eksempel kan en �nske �
    skifte ut ordet �finnes� med �fins�.
Done    � � hente ut teksten slik den st�r, uten endringer.
Done    � � hente ut teksten, men slik at alle bokstaver er store.
    */



    public Tekstbehandling(String tekst) {
        this.tekst = tekst;
    }

    
    public int ordLengde(){
        String trimmer[] = getTeksten().split("[\\s@&.,!?$+-]+");
        //System.out.println(trimmer);
        //System.out.println("Antall ord i teksten.");
        return trimmer.length;
    }
    public String getTeksten() {
        return tekst;
    }

    public String getTekstStore() {
        System.out.println("\nTeksten i store bokstaver: ");
        return this.getTeksten().toUpperCase();
    }

    public double gjennomsnitt() {
        String tekst[] = getTeksten().split("[\\s@&.,!?$+-]+");
        String tekst1 = getTeksten().replaceAll("[^a-zA-Z]", "");
        //System.out.println(Arrays.toString(tekst));
        //System.out.println(tekst1.length());
        double bokstav = tekst1.length();
        double ord = tekst.length;
        return bokstav / ord;
    }
    public String erstattOrd(String gammeltOrd, String nyttOrd) {
        String skiftUt = getTeksten().replace(gammeltOrd, nyttOrd);
        return skiftUt;
    } 


    public double ordPerSetning() {
        String tekst = getTeksten();
        int teller = 1;
        for(int i = 0; i < tekst.length(); i++) {
            int verdi = tekst.charAt(i);
            if(verdi == 33 || verdi == 46 || verdi == 63 || verdi == 58){
                teller++;
            } 
        }
        System.out.println("Ord per setning.");
        return ordLengde()/teller;
    }
}