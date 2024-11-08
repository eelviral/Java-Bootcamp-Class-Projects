package lab2;
//********************************************************************
//  CashRegister.java       Author: Eddie Elvira
//							Date: 	9/4/2022
//  A program that calculates change based on user input.
//********************************************************************
import java.util.Scanner;

public class CashRegister
{
	public static void main(String[] args)
	{
		// Initialize the scanner and prompt user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an amount (in cents): ");
		
		// Get number of cents and display it
		int cents = sc.nextInt();		
		System.out.println("Coins needed for " + cents + " cents:");
		
		// Declare and initialize coin variables
		int q = 0;
		int d = 0;
		int n = 0;
		int p = 0;
		
		// Run loop that ends when all cents are subtracted
		while(cents > 0) 
		{
			// Increment/count quarters
			if(cents - 25 > 0) {
				q += 1;
				cents -= 25;
			}
			// Increment/count dimes
			else if(cents - 10 > 0) {
				d += 1;
				cents -= 10;
			}
			// Increment/count nickels
			else if(cents - 5 > 0) {
				n += 1;
				cents -= 5;
			}
			// Increment/count pennies
			else {
				p = cents;
				cents = 0;
			}
		}
		
		// Display quarter amount
		if (q == 1) {
			System.out.println("    1 quarter");
		} else {
			System.out.println("    " + q + " quarters");
		}
		
		// Display dime amount
		if (d == 1) {
			System.out.println("    1 dime");
		} else {
			System.out.println("    " + d + " dimes");
		}
		
		// Display nickel amount
		if (n == 1) {
			System.out.println("    1 nickel");
		} else {
			System.out.println("    " + n + " nickels");
		}
		
		// Display penny amount
		if (p == 1) {
			System.out.println("    1 penny");
		} else {
			System.out.println("    " + p + " pennies");
		}
		
		// Close the scanner
		sc.close();
	}

}
