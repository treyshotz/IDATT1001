import java.util.*;

public class Oving3_1 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Skriv inn første tall");
        int first = s.nextInt();
        int smallest = first;
        System.out.println("Skriv inn andre tall");
        int second = s.nextInt();
        int biggest = second;

        if(first > second) {
            biggest = first;
            smallest = second;
        }

        while(smallest <= biggest) {
            System.out.println(smallest + "-gangen: ");
            for(int i = 1; i < 10; i++) {
                System.out.println(smallest + " x " + i + " = " + smallest*i);
            }
            smallest++;
        }
    }
}