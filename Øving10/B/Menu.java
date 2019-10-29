import java.util.*;

public class Menu {
    private String name;
    ArrayList<Dish> dishes;
    private double totalPrice;

    ArrayList<Dish> AllDishes = new ArrayList<>();
 

    public Menu(String name, ArrayList<Dish> dishes) {
        this.name = name;
        this.dishes = dishes;
        for(Dish d : dishes) {
            this.totalPrice += d.getPrice();
        }
    }

    public double getPrice() {
        return this.totalPrice;
    }

    public String getName() {
        return this.name;
    }
  

    public ArrayList<Dish> getDishes() {
        return dishes;
    }

    public String toString() {
        String text = "";
        for(Dish a : dishes) {
            text += a.toString()+"\n";
        }
        return "\nMenynavn: " + this.getName() + text;
    }
}