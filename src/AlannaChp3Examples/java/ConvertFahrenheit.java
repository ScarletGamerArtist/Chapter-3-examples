package AlannaChp3Examples.java;
import java.util.Scanner;

/*
 * Alanna Botscharow
 * 9/18
 * Converts and calculates Fahrenheit into Celcius. 
 */
public class ConvertFahrenheit {

	public static void main(String[] args) {
		//Formula = temperature - 32 * .5556 = Celcius
	Scanner input = new Scanner(System.in);
		
		double temp; 
		double Celcius;

			 
		
	System.out.println("Enter the temperature in degrees Fahrenheit.");
		temp = input.nextDouble();
		Celcius = (temp - 32) * .5556;
	System.out.println("The temperature in degrees Celcius is");
	System.out.println(Celcius);
		
	}

}
