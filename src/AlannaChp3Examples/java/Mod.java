package AlannaChp3Examples.java;
import java.util.Scanner;
import static java.lang.System.out;

/* 
 * Alanna Botscharow
 * 9/18
 * Modulus 
 */
public class Mod {

	public static void main(String[] args) {
		int quarters;
		int dimes;
		int nickles;
		int cent; 
		int total;
		int whatsLeft;
		boolean True; 
		boolean greaterThan4; 
		
		Scanner input = new Scanner(System.in);
		out.print("How much change is in your pocket?");
		total = input.nextInt();
		quarters = total / 25;
		whatsLeft = total % 25; 
		dimes = whatsLeft / 10;
		whatsLeft = whatsLeft % 10; 
		nickles = whatsLeft / 5;
		whatsLeft = whatsLeft % 5;
		cent = whatsLeft;
		greaterThan4 = quarters >=4;
		
			out.println("From" + total + " cents you get");
			out.println("Quarters: " + quarters + " Dimes: " + dimes + " Nickles: " + nickles + " cents: " + cent);
			out.println(greaterThan4);
		
		
		
		
		
	}

}
