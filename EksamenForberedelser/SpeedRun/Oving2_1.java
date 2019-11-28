import java.util.*;

public class Oving2_1 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Skriv inn et år: ");
        int year = s.nextInt();

        if(year%4 == 0) {
            System.out.println("Skuddår");
            System.exit(0);
        }
        else{
            System.out.println("Ikke skuddår");
        }
        if(year%100 == 0&& year % 400 == 0) {
            System.out.println("Skuddår");
        }
        else{
            System.out.println("Ikke skuddår");
        }
    }
}