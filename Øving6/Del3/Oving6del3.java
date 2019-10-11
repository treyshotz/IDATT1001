import java.util.Scanner;


class Oving6del3 {

    Scanner s = new Scanner(System.in);

    public static void main(String []args) {
        //Temperaturer.getTemp();
        Temperaturer.dagTemp();
        Temperaturer.tempTime();
        System.out.println("Gjennomsnitt for mnden er: "+Temperaturer.mndTemp());
        Temperaturer.sorter();
        
    }   
}