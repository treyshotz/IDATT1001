import java.util.*;


public class Soppart{

    //Declares all variable private and final
    private final String name;
    private final String descript;
    private final boolean poison;

    /**
     * Creates an object of type Soppart
     * @param name
     * @param descript
     * @param poison
     */
    //First constructor, takes input name, descript and poison
    public Soppart(String name, String descript, boolean poison) {
        this.name = name;
        this.descript = descript;
        this.poison = poison;
    }

    /**
     * Creates an object of type Soppart
     * @param o
     */
    public Soppart(Soppart o) {
        this.name = o.getName();
        this.descript = o.getDescript();
        this.poison = o.getPoison();
    }

    /**
     * 
     * @param o
     * @return true/false
     */
    public boolean equals(Soppart o) {
        if(this == o) {
            return true;
        }
        if(!(o instanceof Soppart)) {
            return false;
        }
        Soppart sopp = (Soppart) o;
        return this.name.equals(o.getName());
    }

    public boolean searchString(String i) {
        if(i.equals(this.descript)) {
            return true;
        }
        return false;
    }

    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return the descript
     */
    public String getDescript() {
        return this.descript;
    }

    
    /**
     * @return the poison
     */
    public boolean getPoison() {
        return this.poison;
    }
    
    @Override
    public String toString() {
        return("Name: " + this.getName() + "\nDescription: " + this.getDescript() + "\nPoisonus: " + this.getPoison());
    }
}   
   