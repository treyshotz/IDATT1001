import java.util.*;

public class Dish {
    private String name;
    private String type;
    private double price;
    private String recipe;

    public Dish(String name, String type, double price, String recipe) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.recipe = recipe;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getRecipe() {
        return recipe;
    }

    public String toString() {
        return ("\nNavn: " + getName() + "\nType: " + getType() + "\nPris: " + getPrice() + "\nOppskrift: " + getRecipe());
  }
}