package lab3;
//********************************************************************
//  Increasing.java       	Author: Eddie Elvira
//							Date: 	9/7/2022
//  Checks if three integer inputs by the user are strictly increasing.
//********************************************************************
import java.util.Scanner;

public class Increasing
{
	public static void main(String[] args)
	{
		// Initialize scanner
		Scanner sc = new Scanner(System.in);
		
		// Get three integers from the user
		System.out.print("Enter an integer: ");
		int n1 = sc.nextInt();
		System.out.print("Enter an integer: ");
		int n2 = sc.nextInt();
		System.out.print("Enter an integer: ");
		int n3 = sc.nextInt();
		
		// Print all the inputs (the 3 integers)
		String output = String.format("The numbers %d, %d and %d are ", n1, n2, n3);
		
		// Use ternary operator to check if the 3 numbers are strictly increasing
		// or if they are decreasing
		output += n1 < n2 && n2 < n3 ? "strictly increasing." : "not strictly increasing.";
		System.out.println(output);
		
		// Close the scanner
		sc.close();
	}

}
