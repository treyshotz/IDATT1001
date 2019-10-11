
import java.util.*;
//Countdown integer numbers upwards or downwards
public class copy {
	public static void main(String[] args){
		int a, b = 0;
		Scanner ile = new Scanner(System.in);
		System.out.print("Enter the beginning number of the interval \n");
		a = ile.nextInt();
		b = 0;
		System.out.println("Countdown has been started ... \n");
if (b<a){
				//Reduction
				do{
					System.out.println(a);
					a--; }
				while(b<=a);
				}
		System.out.println("\nEnd");
	}
}