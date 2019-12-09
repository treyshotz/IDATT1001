import java.util.*;

public class Vetikke {
    public static Random r = new Random();

    public static ArrayList<Integer> liste = new ArrayList<>(Collections.nCopies(10,0));

    public static void main(String[] args) {
        for(int i = 0; i < 1000; i++) {
            int next = r.nextInt(10);
            liste.set(next, liste.get(next) + 1);
        }
        System.out.println(liste);
    }
}
