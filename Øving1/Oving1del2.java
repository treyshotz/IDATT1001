import java.util.*;

class Oving1del2{
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Antall timer: ");
		int timer = in.nextInt();
		System.out.println("Antall minutter: ");
		int minutter = in.nextInt();
		System.out.println("Antall sekunder: ");
		int sekunder = in.nextInt();
		int	 total = timer * 3600 + minutter * 60 + sekunder;
		System.out.println("Tiden totalt er " + total + " i sekunder");
	}
}