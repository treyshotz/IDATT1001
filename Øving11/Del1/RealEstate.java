import java.util.*;


public class RealEstate {

    //Initializing the variables used in the code
    public int munNum;
    public String munName;
    public int lotNum;
    public int secNum;
    public String name;
    public double area;
    public String ownName;
    
    //Creating the cunstructor for RealEstate
    public RealEstate(int munNum, String munName, int lotNum, int secNum, String name, double area, String ownName) {
        this.munNum = munNum;
        this.munName = munName;
        this.lotNum = lotNum;
        this.secNum = secNum;
        this.name = name;
        this.area = area;
        this.ownName = ownName;

    }

    /**
     * @return the area
     */
    public double getArea() {
        return area;
    }
    
    /**
     * @return the lotNum
     */
    public int getLotNum() {
        return lotNum;
    }

    /**
     * @return the munName
     */
    public String getMunName() {
        return munName;
    }
    
    /**
     * @return the munNum
     */
    public int getMunNum() {
        return munNum;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the ownName
     */
    public String getOwnName() {
        return ownName;
    }

    /**
     * @return the secNum
     */
    public int getSecNum() {
        return secNum;
    }

    //Writes out RealEstate to String
    public String toString() {
        return("\nNr: " + this.getMunNum() + "-" + this.getLotNum() + "/" + this.getSecNum() + "\nKommune navn: " + this.getMunName() +  
        "\nBruksnavn: " + this.getName() + "\nAreal: " + this.getArea() + "\nEier: " + this.getOwnName() + "\n");
    }

}