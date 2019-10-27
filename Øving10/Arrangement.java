import java.util.*;



/* Nummer, navn, sted, arrangør, type (konsert, barneteater, foredrag osv)
og tidspunkt (dato og klokkeslett).*/



class Arrangement {
    private String name;
    private int id;
    private String place;
    private String type;
    private long date;

    public Arrangement(String name, int id, String place, String type, long date) {
        this.name = name;
        this.id = id;
        this.place = place;
        this.type = type;
        this.date = date;
    }

    public String getName() {
        return this.name;
    }
    
    public int getId() {
        return this.id;
    }

    public String getPlace() {
        return this.place;
    }

    public String getType() {
        return this.type;
    }

    public long getDate() {
        return this.date;
    }

    public String toString() {
        return ("\nNavn: " + getName() + "\nID: " + getId() + 
        "\nPlass: " +  getPlace() + "\nType: " +  getType() + "\nDato: " + getDate());
    }
    
}

class sortByPlace implements Comparator<Arrangement> {
    public int compare(Arrangement a, Arrangement b) { 
        return(a.getPlace().compareTo((b.getPlace())));
    }
}

class sortByDate implements Comparator<Arrangement> {
    public int compare(Arrangement a, Arrangement b) {
        return Long.compare(a.getDate(), (b.getDate()));
    }
} 

class sortByName implements Comparator<Arrangement> {
    public int compare(Arrangement a, Arrangement b) {
        return(a.getName().compareTo(b.getName()));
    }
}

class sortByType implements Comparator<Arrangement> {
    public int compare(Arrangement a, Arrangement b) {
        return(a.getType().compareTo(b.getType()));
    }
}
