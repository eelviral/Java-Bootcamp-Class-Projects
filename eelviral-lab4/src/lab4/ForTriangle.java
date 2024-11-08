package lab4;
//********************************************************************
//  ForTriangle.java		Author: Eddie Elvira
//							Date: 	9/21/2022
//	Draw a triangle based on user input using only for loops
//********************************************************************
import java.util.Scanner;

public class ForTriangle
{	
	public static void main(String[] args)
	{
		// Initialize the scanner and briefly state what the program does/expects
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value and draw a triangle!");
		
		// Repeat the triangle drawing routine 5 times
		for (int i = 0; i < 5; ++i) 
		{
			// Prompt the user for an integer value less than 10
			System.out.print("\nEnter an integer (less than 10): ");
			int value = sc.nextInt();
			
			
			// Only draw a triangle if the input value passes the first two
			// conditions below (must be a positive number between 1 and 9)
			if (value < 1)
				System.out.println("Value must be positive.");
			else if (value > 9)
				System.out.println("Value must be less than 10.");
			else 
			{
				// Draw a triangle with "N" rows and only print the numbers 1 to "N"
				for (int j = 1; j <= value; ++j)
				{
					// Print the value of j at the j'th row j times
					for (int k = 0; k < j; ++k)
						System.out.print(j);
					
					// Move on to the next row/line
					System.out.println();
				}
			}
		}
		
		// Thank the user and close the scanner
		System.out.println("\nThank you for drawing!");
		sc.close();
	}

}
