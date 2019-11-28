import java.util.*;

public class SoppRegister{
    ArrayList<Soppart> register;

    public SoppRegister(ArrayList<Soppart> register) {
        this.register = register;
    }

    public boolean newSopp(String name, String descript, boolean poison) {
        Iterator<Soppart> i = register.iterator();

        //Checks if the name or description is blank
        if(name.isBlank() || descript.isEmpty()) {
            return false;
        }
        
        //Loops through all Sopp in the register and checks if the name is similar
        while(i.hasNext()) {
            Soppart sopp = i.next();
            if(name.equals(sopp.getName())){
                return false;
            }
        }
        Soppart sopp = new Soppart(name, descript, poison);
        register.add(sopp);
        return true;
    }

    /**
     * 
     * @return ArrayList<Soppart>
     */
    //Returns all sopp that are not poisonous
    public ArrayList<Soppart> listFoodSopp() {
        //Creates an ArrayList where all edible Sopp will be added
        ArrayList<Soppart> foodSopp = new ArrayList<>();
        Iterator<Soppart> i = register.iterator();

        //Loops through all Sopp in the register
        while(i.hasNext()) {
            Soppart Sopp = i.next();
            if(Sopp.getPoison() == false) {
                foodSopp.add(Sopp);
            }
        }

        //returns null if the list is empty
        if(foodSopp.size() == 0) {
            return null;
        }

        //Returns the list of all edible sopp
        return foodSopp;
    }


    public String listAll() {
        String output = "";
        Iterator<Soppart> i = register.iterator();
        int count = 0;
        while(i.hasNext()) {
            count++;
            Soppart sopp = i.next();
            output += count + "\n    Name: " + sopp.getName() + ".\n    Description: " + sopp.getDescript() + ".\n    Poisonous: " + sopp.getPoison();
        }

    return output;
    }


    public String searchString(String search) {
        Iterator<Soppart> i = register.iterator();
        int count = 0;

        while(i.hasNext()) {
            Soppart sopp = i.next();
            if(sopp.getDescript().equals(search)) {
                count++;

            }
        }
        if(count != 0) {
            return "Found " + count + " with the following description: \n " + search;
        }
        return "Found no identical description...";
    }
}e 