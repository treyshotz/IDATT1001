import java.util.*;

public class MenuRegister {

    private ArrayList<Menu> menues;

    public MenuRegister(ArrayList<Menu> menues) {
        this.menues = menues;
    }
    
    public Dish regDish(String name, String type, double price, String recipe) {
        return new Dish(name, type, price, recipe);
    }

    public Menu regMenu(String name, ArrayList<Dish> dishes) {
        return new Menu(name, dishes);
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
        return menues.size();
    }
}