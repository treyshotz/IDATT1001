import java.util.*;

class Oving2del1{
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Skriv inn et arstall: ");
		double arstall = in.nextDouble();
		double delpa4 = arstall % 4;
		double delpa100 = arstall % 100;
		double delpa400 = arstall % 400;

		if( delpa4 == 0) {
			if(delpa100 == 0) {
				if(delpa400 == 0) {
					System.out.println("Skuddar");
				}else {
					System.out.println("Ikke skuddar");
				}
			}else {
				System.out.println("Skuddar");
			}
		}else {
			System.out.println("Ikke et skuddar");
		}
	}
}
