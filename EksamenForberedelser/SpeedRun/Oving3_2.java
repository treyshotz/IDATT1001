import java.util.*;

public class Oving3_2 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);

        while(true) {
            System.out.println("Skriv inn et tall: ");
            int num = s.nextInt();
            if(num%2 != 0 && num%5 != 0 && num%3 != 0) {
                System.out.println("Primtall");
            }
            else {
                System.out.println("Ikke et primtal");
            }
        }
    }
}