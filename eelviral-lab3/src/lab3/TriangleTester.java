package lab3;
//********************************************************************
//  BetterClock.java       	Author: Eddie Elvira
//							Date: 	9/7/2022
//  A better version of Clock.java that checks the user's inputs before
//	making calculations and displaying output.
//********************************************************************
import java.util.Scanner;


public class TriangleTester
{
	private static boolean scaleneTriangle(int s1, int s2, int s3) {
		return (s1 + s2 > s3) && (s1 + s3 > s2) && (s2 + s3 > s1);
	}
	
	private static boolean rightTriangle(int s1, int s2, int s3) {
		int a = s2;		// One side of triangle
		int b = s3;		// Other side of triangle
		int c = s1;		// Longest side of triangle (defaults to side 1)
		
		// If side 2 is greater than side 1, then c = side 2
		if (c < s2) {
			a = s1;
			b = s3;
			c = s2;
		}
		// If side 3 is greater than side 1 and side 2, then c = side 3
		if (c < s3) {
			a = s1;
			b = s2;
			c = s3;
		}
		
		// If a^2 + b^2 = c^2
		if (a*a + b*b == c*c) { 
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args)
	{
		// Initialize the scanner
		Scanner sc = new Scanner(System.in);
		
		// Get the length of three sides of a triangle from the user 
		System.out.print("Enter side one: ");
		int side1 = sc.nextInt();
		System.out.print("Enter side two: ");
		int side2 = sc.nextInt();
		System.out.print("Enter side three: ");
		int side3 = sc.nextInt();
		
		// Make sure that all sides are not negative or zero
		if (side1 > 0 && side2 > 0 && side3 > 0)
		{
			// If all sides are equal, it's an equilateral triangle
			if (side1 == side2 && side2 == side3) 
			{
				System.out.print("That's an Equilateral Triangle!");
			} 
			// If two sides are equal it's an isosceles triangle
			else if (side1 == side2 ^ side1 == side3 ^ side2 == side3) 
			{
				System.out.print("That's an Isosceles Triangle!");
			} 
			// Run rightTriangle() method to check if sides make a right triangle
			else if (rightTriangle(side1, side2, side3)) 
			{
				System.out.print("That's a Right Triangle!");
			} 
			// Run scaleneTriangle() method to check if sides make a scalene triangle
			else if (scaleneTriangle(side1, side2, side3)) 
			{
				System.out.print("That's a Scalene Triangle!");
			} 
			// If all conditions fail, then the sides do not make a triangle
			else 
			{
				System.out.print("That's NOT a triangle!");
			}
		}
		// If all conditions fail, then the sides do not make a triangle
		else 
		{
			System.out.print("That's NOT a triangle!");
		}
		
		// Close the scanner
		sc.close();
	}

}
