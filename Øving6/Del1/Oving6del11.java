
import java.util.Random;
import java.util.*;

public class Oving6del11 {

    private static Random random = new Random();
    

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        System.out.println("Tast inn antall ganger loopen skal kjøre: ");
        int antall = in.nextInt();
        int teller = 0;
        int d,j,c = 0;
        

        int[] list = new int [antall];
       
        
        for (int i = 0; i < antall; i++) {
            int tall = random.nextInt(10);
            list[i] = tall;
            d = list[i];
            teller++;
            for (j=0;j<antall;j++){
                if (d==list[j]) {
                    c++;
                }
            
            }
            System.out.println(d+ " kom " + c + " ganger");
            //System.out.println(Arrays.toString(list));
        }
        
    }
}