import java.util.*;

public class RealEstateReg {

    ArrayList<RealEstate> realEstates = new ArrayList<>();

    public RealEstateReg(ArrayList<RealEstate> realEstates) {
        this.realEstates = realEstates;
    }

    public RealEstate newRealEstate(int munNum, String munName, int lotNum, int secNum, String name, double area, String ownName) {
        RealEstate newReal = new RealEstate(munNum, munName, lotNum, secNum, name, area, ownName);
        realEstates.add(newReal);
        return newReal;
    }

    public int numReal() {
        return realEstates.size();
    }

    public ArrayList listAll() {
        return realEstates;
    }

    public RealEstate listWNum(int munNum, int lotNum, int secNum) {
        Iterator<RealEstate> iterator = realEstates.iterator();

        while(iterator.hasNext()) {
            RealEstate nEstate = iterator.next();
            if(nEstate.getMunNum() == munNum && nEstate.getLotNum() == lotNum && nEstate.getSecNum() == secNum) {
                return nEstate;
            }
        }
        return null;

    }

    public double avgArea() {
        Iterator<RealEstate> iterator = realEstates.iterator();
        double totArea = 0;

        while(iterator.hasNext()) {
            RealEstate e = iterator.next();
            totArea += e.getArea();
        }

        return totArea/realEstates.size();
    }
}