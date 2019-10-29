import java.util.*;

public class Menu {
    private String name;
    ArrayList<Dish> dishes;

    ArrayList<Dish> AllDishes = new ArrayList<>();
 

    public Menu(ArrayList<Dish> dishes) {
        this.dishes = dishes;
        AllDishes.addAll(dishes);
    }

  

    public ArrayList<Dish> getDishes() {
        return dishes;
    }
}