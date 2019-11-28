import java.util.*;

public class Oving2_2 {
    public static void main(String [] args) {
        double priceA = 35.90;
        double weightA = 450;
        double ratioA = priceA/weightA;

        double priceB = 39.50;
        double weightB = 500;
        double ratioB = priceB/weightB;

        if(ratioA < ratioB) {
            System.out.println("A er billigst" );
        }
        else{
            System.out.println("B er billigst");
        }
    }
}