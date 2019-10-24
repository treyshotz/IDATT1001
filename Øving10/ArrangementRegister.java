import java.util.*;

class ArrangementRegister {

    private ArrayList<Arrangement> Arrangementer;

    public ArrangementRegister(ArrayList<Arrangement> Arrangementer) {
        this.Arrangementer = new ArrayList<>(Arrangementer);
    }

    public int antRegArr() {
        return Arrangementer.size();
    }

    public boolean regNewArr(Arrangement s) {
        return this.Arrangementer.add(s);
    }
    
}