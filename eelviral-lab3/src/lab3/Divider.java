package lab3;
//********************************************************************
//  Divider.java       		Author: Eddie Elvira
//							Date: 	9/7/2022
//  Divides two numbers and returns error when dividing by zero.
//********************************************************************
import java.util.Scanner;


public class Divider
{

	public static void main(String[] args)
	{
		// Initialize scanner
		Scanner sc = new Scanner(System.in);
		
		// Get dividend and divisor from the user
		System.out.print("Enter the dividend: ");
		double dividend = sc.nextDouble();
		System.out.print("Enter the divisor: ");
		double divisor = sc.nextDouble();
		
		// If divisor is 0, return divide by zero error, otherwise
		// perform the calculation
		if (divisor == 0) {
			System.out.println("Error: you cannot divide by zero");
		} else {
			System.out.println("Result is: " + (dividend / divisor));
		}
		
		// Close the scanner
		sc.close();
	}

}
