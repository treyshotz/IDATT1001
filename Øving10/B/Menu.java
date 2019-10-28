import java.util.*;

public class Menu {
    private String name;
    ArrayList<Dish> dishes;
 

    public Menu(String name, ArrayList<Dish> dishes) {
        this.name = name;
        this.dishes = dishes;
    }

    public String getName() {
        return name;
    }
}