
import java.util.Random;
import java.util.*;

public class Oving6del1 {

    private static Random random = new Random();
    

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        System.out.println("Tast inn antall ganger loopen skal kjøre: ");
        int antall = in.nextInt();
        int teller = 0;
        

        int[] list = new int [antall];

        
        for (int i = 0; i < antall; i++) {
            int tall = random.nextInt(10);
            list[i] = tall;
                teller++;
            
        }

        //System.out.println(Arrays.toString(list)); //Skriver ut arrayen
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : list) {
            Integer count = map.get(num);
            map.put(num, count == null ? 1 : count.intValue() + 1);
        }
        
        // now iterate the map
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer num = entry.getKey();
            Integer count = entry.getValue();
            if (count >= 0) {
                System.out.println("Nummer: " + num + ", forekommer: " + count + " antall ganger.");
            }
        }
    }
}