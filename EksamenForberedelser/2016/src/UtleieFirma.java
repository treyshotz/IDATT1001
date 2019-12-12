import java.util.*;

public class UtleieFirma {
    private String navn;
    private ArrayList<Bil> biler;
    private int maxBiler;

    public UtleieFirma(String navn, int maxBiler) {
        this.biler = new ArrayList<>();
        this.navn = navn;
        this.maxBiler = maxBiler;
    }

    public boolean regNyBil(int regnr, String merke, double dimensjon, String dekktype, int motornr, boolean girkasse, String motortype) {
        if(biler.size() < maxBiler) {
            Bil nybil = new Bil(regnr, merke, dimensjon, dekktype, motornr, girkasse, motortype);
            for(Bil b : biler) {
                if(nybil.equals(b)) {
                    return false;
                }
            }
            biler.add(nybil);
        }
    return true;
    }


    public ArrayList<Bil> sorter() {
        ArrayList<Bil> sortert = new ArrayList<>(biler);
        Collections.sort(sortert, new sortByRegNr());
        return sortert;
    }

    @Override
    public String toString() {
        return biler.toString();
    }
}

class sortByRegNr implements Comparator<Bil> {
    public int compare(Bil a, Bil b) {
        return a.getRegnr() - b.getRegnr();
    }
}




