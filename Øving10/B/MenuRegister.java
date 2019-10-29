import java.util.*;

public class MenuRegister {

    private ArrayList<Menu> menues;

    public MenuRegister(ArrayList<Menu> menues) {
        this.menues = menues;
    }
    
    public Dish regDish(String name, String type, double price, String recipe) {
        //Loops through all dishes in all menues. If the name of the new dish matches already exists it cancels, else it register the new dish
        for(int i = 0; i < menues.size(); i++) {
            for(int j = 0; j < menues.get(i).getDishes().size(); j++) {
                String namecheck = menues.get(i).getDishes().get(j).getName();
                if(namecheck.equals(name)) {
                    System.out.println("Retten finnes allerede...\nRetten ble ikke registrert");
                    return null;
                }
            }
        }
        return new Dish(name, type, price, recipe);
    }

    public Menu regMenu(ArrayList<Dish> dishes) {
        //Loop through to check 
        return new Menu(dishes);
    }

    /*public Dish findDish(String name) {
        Iterator<Menu> menuiterator = this.menues.iterator();

        while(menuiterator.hasNext()) {
            Menu menu = menuiterator.next();

            for(Dish dish : menu.geDishes()) {

            }
        }

    }*/

    public int numMenu(){
        return this.menues.size();
    }

    public int numDish() {
        int count = 0;
        for(int i = 0; i < this.menues.size(); i++) {
            count += this.menues.get(i).getDishes().size();
        }
    return count;
    }


    //toString metode
}