import java.util.*;

public class Oving1_2 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Antall timer: ");
        int hours = s.nextInt();
        hours = hours*60*60;
        System.out.println("Antall minutt: ");
        int minutes = s.nextInt();
        minutes = minutes*60;
        System.out.println("Antall sekunder: ");
        int seconds = s.nextInt();
        int total = hours+minutes+seconds;
        System.out.println("Total: " + total);
    }
}