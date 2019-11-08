import java.util.*;


public class RealEstate {

    //Initializing the variables used in the code
    private int munNum;
    private String munName;
    private int lotNum;
    private int secNum;
    private String name;
    private double area;
    private String ownName;
    
    //Creating the cunstructor for RealEstate
    public RealEstate(int munNum, String munName, int lotNum, int secNum, String name, double area, String ownName) {
        this.munNum = munNum; //Kommune nr
        this.munName = munName; //Kommune navn
        this.lotNum = lotNum; //Gards nr
        this.secNum = secNum; //Bruks nr
        this.name = name; //Bruks navn
        this.area = area; //Areal
        this.ownName = ownName; //Eier navn

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