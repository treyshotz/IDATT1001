import java.util.*;

public class RealEstateReg {

    ArrayList<RealEstate> realEstates = new ArrayList<>();

    public RealEstateReg(ArrayList<RealEstate> realEstates) {
        this.realEstates = realEstates;
    }

    public RealEstate newRealEstate(int munNum, String munName, int lotNum, int secNum, String name, double area, String ownName) {
        RealEstate newReal = new RealEstate(munNum, munName, lotNum, secNum, name, area, ownName);
        return newReal;
    }

    public int numReal() {
        return realEstates.size();
    }
    
}