import java.util.*;

class Oving3del1 {
  public static void main(String [] args){
  while(true){
    Scanner in = new Scanner(System.in);
    System.out.println("Skriv inn et tall");
    double tall = in.nextDouble();
    double b = 1;
    if (tall<b) {
		double count = 0;
		double regning = tall % tall;
		if ( regning == 0) {
			double nedtelling = tall - 1;
			double count = count + 1;
			System.out.println(count);
			System.out.println(nedtelling);
    } else {
      System.out.println("Noe gikk feil");
        }
      }
    }
  }
}
