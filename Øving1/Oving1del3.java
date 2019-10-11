import java.util.*;

class Oving1del3{
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Antall sekunder: ");
		int sekunder = in.nextInt();
		int antalltimer = sekunder / 3600;
		System.out.println("Antall timer: " + antalltimer);
		int antallminutter = sekunder % 3600 / 60;
		System.out.println("Antall minutter: " + antallminutter);
		int antallsekunder = sekunder % 3600 % 60;
		System.out.println("Antall sekunder: " + antallsekunder);
	}
}
x