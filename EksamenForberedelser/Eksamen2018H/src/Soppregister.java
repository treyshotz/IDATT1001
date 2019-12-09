import java.util.*;

public class Soppregister {

    ArrayList<Soppart> register;

    /**
     * @param register
     */
    public Soppregister(ArrayList<Soppart> register) {
        this.register = register;
    }


    /**
     * @param navn
     * @param beskrivelse
     * @param giftig
     * @return true/false
     */
    //Tar inn verdier og lage et nytt objekt av typen Soppart
    public boolean regSoppart(String navn, String beskrivelse, boolean giftig) {
        //Looper gjennom alle soppene i listen
        for(Soppart s: register){
            //Hvis det nye navnet allerede finnes returnerer den false
            if (navn.equals(s.getNavn())) return false;
        }

        //Lager nytt objekt av typen Soppart
        Soppart n = new Soppart(navn, beskrivelse, giftig);
        //Legger nye Sopparten til i registeret
        register.add(n);
        return true;
    }

    /**
     * @return mat
     */
    //Returnerer en liste med alle soppene som ikke er giftige
    public ArrayList finnMatSopp() {
        //Oppretter listen
        ArrayList<Soppart> mat = new ArrayList<>();

        //Looper gjennom alle soppene i listen
        for(Soppart s : register) {
            //Sjekker om soppen ikke er giftig
            if(!(s.isGiftig())){
                //Legger til i nye listen hvis den ikke er giftig
                mat.add(s);
            }
        }
        //Returnerer listen med alle soppene som ikke er giftig
        return mat;
    }

    /**
     * @return
     */
    public String info() {
        //Teller for
        int count = 1;
        String tekst = "";

        //Looper gjennom alle sopparter i register og legger til sopparten til i en String
        for(Soppart s : register) {
            tekst += count + ": " + s.toString() + "\n";
            count++;
        }

        return tekst;
    }


    /**
     * søker i alle soppene og finner en matchende beskrivelse
     * @param beskrivelse
     * @return
     */
    public String finnBeskrivelse(String beskrivelse) {
        String tekst = "Sopperarter som har lik beskrivelse: \n";

        //Looper gjennom alle sopparter
        for(Soppart s : register) {
            //Bruker metode beskrivelseSjekker for å sjekke om de har lik beskrivelse
            if(s.beskrivelseSjekker(beskrivelse)) {
                tekst += s.getNavn() + "\n";
            }
        }

        return tekst;
    }
}

