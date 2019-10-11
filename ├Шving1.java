import static javax.swing.JOptionPane.*;
import java.util.*;
class TommerTilCentimeter{
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Lengde i tommer:");
		double lengde = in.nextDouble();
		double tomme = 2.54;
		double omregning = lengde * tomme;
		System.out.println("Lengde i centimeter er " + omregning + " cm.");
	}
}