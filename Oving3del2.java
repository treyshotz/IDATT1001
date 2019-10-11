import java.util.*;

class Oving3del2 {
	public static void main(String
	[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
		System.out.println("Skriv inn et tall:");
		double tall = in.nextDouble();
		double to = tall % 2;
		double tre = tall % 3;
		double fem = tall % 5;
		double syv = tall % 7;
		double elleve = tall % 11;

		if(tall == 2) {
			System.out.println("Primtall bitch");
		} else if(tall == 3) {
		System.out.println("Yas bitch primtall");
		} else if(tall == 5) {
		System.out.println("Prime to the dime");
		} else if(tall == 7) {
		System.out.println("This mofo is prime af bruh");
		} else if(tall == 11) {
		System.out.println("U know it, primtall");
		} else if(tall == 1) {
		System.out.println("1 er ikke et primtall m8");
		} else {
		if(to == 0) {
			System.out.println("Et oddetall");
			} else {
				if(tre == 0) {
					System.out.println("Ikke et primtall");
					} else {
						if(fem == 0) {
							System.out.println("Ikke et primtall");
						} else {
							if(syv == 0) {
								System.out.println("Ikke et primtall");
							} else {
								if(elleve == 0) {
									System.out.println("Ikke et primtall");
								} else {
									System.out.println("PRIMTALL BABY");
							}
						}
					}
				}
			}
		}
	}
}
}