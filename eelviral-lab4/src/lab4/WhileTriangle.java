package lab4;
//********************************************************************
//  WhileTriangle.java      Author: Eddie Elvira
//							Date: 	9/14/2022
//  Program that creates a numeric triangle based on user input
//********************************************************************
import java.util.Scanner;

public class WhileTriangle
{
	public static void main(String[] args)
	{
		// Initialize the scanner and introduce user to the program
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value and draw a triangle!\n");
		
		// Only prompt the user 5 times by incrementing the numLoops 
		// variable each time a response is given
		int numLoops = 0;
		while (numLoops < 5) 
		{
			// Prompt the user for the integer value
			System.out.print("Enter an integer (less than 10): ");
			int value = sc.nextInt();
			
			// Only draw a triangle if the input value is 
			// a positive integer that is less than 10
			if (value > 9)
				System.out.println("Value must be less than 10.");
			else if (value < 1)
				System.out.println("Value must be positive.");
			else
			{
				// Print numbers 1 to "N"
				int i = 1;
				while (i <= value) 
				{
					// Print the value of i, i times on the i'th line
					int j = 0;
					while (j < i)
					{
						System.out.print(i);
						++j;
					}
					
					// Move on to next line
					System.out.println();
					++i;
				}
			}
			++numLoops;
			System.out.println();
		}
		
		// Close the program and the scanner
		System.out.print("Thank you for drawing!");
		sc.close();
	}
}
