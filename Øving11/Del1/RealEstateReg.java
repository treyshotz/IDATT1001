import java.util.*;

public class RealEstateReg {

    //Initializing the ArrayList used to hold all RealEstates
    //Chose to use ArrayList cause im more Comfortable using is, and it has some useful methods
    private ArrayList<RealEstate> realEstates = new ArrayList<>();

    public RealEstateReg(ArrayList<RealEstate> realEstates) {
        this.realEstates = realEstates;
    }

    //Registert a new RealEstate based on input and adds to the ArrayList
    public RealEstate newRealEstate(int munNum, String munName, int lotNum, int secNum, String name, double area, String ownName) {
        RealEstate newReal = new RealEstate(munNum, munName, lotNum, secNum, name, area, ownName);
        realEstates.add(newReal);
        return newReal;
    }


    //Uses munNum, lotNum and secNum to find the given RealEstate with listWNum function
    //Removes the found RealEstate from the list if found
    public String delRealEstate(int munNum, int lotNum, int secNum) {

        //Add a try catch function?
        RealEstate r = listWNum(munNum, lotNum, secNum);
        System.out.println(r);
        if(r == null) {
            return "Noe gikk galt, fant ikke eiendommen...\n";
        }
        realEstates.remove(r);
        return "Slettet!";

    }


    //Returns the size of the ArrayList, which is the number of RealEstates registered
    public int numReal() {
        return realEstates.size();
    }

    //Return an ArrayList with all the RealEstates
    public ArrayList listAll() {
        return realEstates;
    }

    //Loops through the list to check if any RealEstate matches the input
    //Returns the RealEstate if found, else returns null
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

    //Loops through list and adds the area to a totalArea variable
    //Divides the totalArea on number of RealEstates and returns that variable
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