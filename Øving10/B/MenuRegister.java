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

    public Menu regMenu(String name, ArrayList<Dish> dishes) {
        //Loop through to check 
        Iterator<Menu> mIterator = this.menues.iterator();
        while(mIterator.hasNext()) {
            Menu m = mIterator.next();
            if(m.getName().equalsIgnoreCase(name)) {
                System.out.println("Dette navnet er tatt, velg et annet");
                return null;
            }
        }
        Menu newMenu = new Menu(name, dishes);
        this.menues.add(newMenu);
        return newMenu;
    }

  
    public Dish findDish(String name) {
        Iterator<Menu> menuiterator = this.menues.iterator();

        while(menuiterator.hasNext()) {
            Menu menu = menuiterator.next();

            for(Dish dish : menu.getDishes()) {
                if(dish.getName().equalsIgnoreCase(name)) {
                    return dish;
                }
            }
        }
        return null;
    }

    public ArrayList findType(String type) {
        Iterator<Menu> mIterator = this.menues.iterator();
        ArrayList<Dish> foundList = new ArrayList<>();

        while(mIterator.hasNext()) {
            Menu menu = mIterator.next();
            for(Dish d : menu.getDishes()) {
                if(d.getType().equalsIgnoreCase(type)) {
                    foundList.add(d);
                }
            }
        }
        if(foundList.isEmpty()) {
            System.out.println("Kunne ikke finne noen retter...");
            return null;
        }
        return foundList;
    }

    public ArrayList findMenu(double minPrice, double maxPrice) {
        Iterator<Menu> mIterator = this.menues.iterator();
        ArrayList<Menu> foundList = new ArrayList<>();

        while(mIterator.hasNext()) {
            Menu menu = mIterator.next();
            if(menu.getPrice() > minPrice && menu.getPrice() < maxPrice) {
                foundList.add(menu);
            }
        }
        if(foundList.size() == 0) {
            System.out.println("Kunne ikke finne en meny som er innenfor prisklassen...");
            return null;
        }
        return foundList;
    }

    public int numMenu(){
        return this.menues.size();
    }

    public int numDish() {
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < menues.size(); i++) {
            for(int j = 0; j < menues.get(i).getDishes().size(); j++) {
                String name = menues.get(i).getDishes().get(j).getName();
                if(!list.contains(name)) {
                    list.add(name);
                }
            }
        }
    return list.size();
    }


    public String toString(){
        String text = "";
        for(Menu a : menues) {
            text += a.toString()+"\n";
        }
        return text;
    }
}