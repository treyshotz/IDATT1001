import java.util.*;

class Oving3del1final{
	public static void main(String [] args) {
		while(true) {
		Scanner in = new Scanner(System.in);
		System.out.println("Tast inn forste tall: ");
		int a = in.nextInt();
		System.out.println("Tast inn andre tall: ");
		int b = in.nextInt();

		if(a<b){
			while (a<=b){
				System.out.println(a + " gangen:");
				int c = 1;
				while (c<=10){
					int d = a * c;
					System.out.println("\n" + a + "*" + c + ": " + d);
					c++;
				}
				a++;
				System.out.println("\n");
			}
		}
		else if (b<a)
			while (b<=a) {
				System.out.println(a + " gangen:");
				int c = 1;
				while (c<=10){
					int d = a * c;
					System.out.println("\n" + a + "*" + c + ": " + d);
					c++;
			}
			a--;
			System.out.println("\n");
			}
		}
	}
}


