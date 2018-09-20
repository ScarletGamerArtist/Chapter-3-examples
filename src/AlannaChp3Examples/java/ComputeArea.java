package AlannaChp3Examples.java;

import java.util.Scanner;

/*
 * Alanna Botscharow
 * 9/18
 * compute the are of a circle.
 */
public class ComputeArea {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		//1. Enter the radius of a circle
		//constant declarations.
		final double PI = 3.1415926535979323846264338327950288419716939;

		
		double radius;
		double area;
		 
		
		//assign a value to radius
		System.out.println("enter the radius of a circle and press enter: ");
		radius = input.nextDouble();
		System.out.println(radius);
		
		//2. Compute the area using the following formula:
		//  area = radius*radius*radius*pi
			area = radius*radius*PI;
		
		//3. Display result
		System.out.println("the area of your circle is:" + area +"\"");
		

	}

}
