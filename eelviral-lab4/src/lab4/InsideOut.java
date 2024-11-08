package lab4;
//********************************************************************
//  ForTriangle.java		Author: Eddie Elvira
//							Date: 	9/21/2022
//	Program that draws two complementary diamond patterns based
// 	on what integer the user inputs
//********************************************************************
import java.util.Scanner;

public class InsideOut
{
	// Function for drawing a solid diamond shape with a whitespace background
	private static void printSolidDiamond(int lines)
	{
		// First half of solid diamond shape (prints the first N-1 rows of diamond)
		for (int i = 0; i < lines - 1; ++i)
		{
			/* The length of whitespace on each side of the diamond should decrease
			 * as we move towards the middle, so we subtract i from N (N - i). We also 
			 * need to subtract 1 from the result (N - i - 1) to keep the middle column 
			 * centered and prevent rows from shifting to the right. */
			String whitespace = "  ".repeat(lines - i - 1);
			
			/* The number of hash symbols on each row follow a certain pattern
			 * where the current row has double the amount of hash symbols of
			 * the row before it (i * 2), plus one more ((i * 2) + 1). 
			 * 
			 * If we reference each row, 'i' as starting from 0 (the first row), 
			 * we can represent the pattern as an equation: i * 2 + 1. This will
			 * give us the number of hash symbols at the i'th row. */
			System.out.println(whitespace + "# ".repeat(i * 2 + 1) + whitespace);
		}
		
		// Second half of solid diamond shape (prints the last N rows of diamond)
		for (int i = lines - 1; i > -1; --i) 
		{
			// Same equation as before, but the decrementing loop will now make
			// the length of whitespace on each side increase towards the bottom
			String whitespace = "  ".repeat(lines - i - 1);
			
			// Same equation as before, but now the for loop will make the amount
			// of hash symbols decrease towards the bottom
			System.out.println(whitespace + "# ".repeat(i * 2 + 1) + whitespace);
		}
	}
	
	// Function for drawing a whitespace diamond shape with a solid background
	private static void printInvertedDiamond(int lines)
	{
		// First half of inverted diamond shape (prints the first N-1 rows of diamond)
		for (int i = 0; i < lines - 1; ++i)
		{
			// Left side of background decreases as we approach the middle so i is
			// subtracted from N
			String leftBackground 	= "# ".repeat(lines - i);
			
			/* Right side of background has the same number of hash symbols as the
			 * left side, except when we're at the first row of the diamond (when 
			 * i = 0). 1 hash symbol is removed to maintain the shape */ 
			String rightBackground 	= i == 0 ? "# ".repeat(lines - i - 1) : leftBackground;
			
			/* The amount of whitespace for the inverted diamond follows the same
			 * pattern as the one used to find the number of hash symbols in the 
			 * solid diamond. The only exception is at the first row (i = 0), since
			 * the diamond closes off to keep the background */
			String whitespace = i == 0 ? "" : "  ".repeat(i * 2 - 1);
			
			// Prints the current row
			System.out.println(leftBackground + whitespace + rightBackground);
		}
		
		// Second half of solid diamond shape (prints the last N rows of diamond)
		for (int i = lines - 1; i > -1; --i)
		{
			// Same as before, but now the length increases as we approach the bottom
			// of the diamond
			String leftBackground 	= "# ".repeat(lines - i);
			
			// Same as before, but now 1 hash symbol will be removed at the last row when
			// the loop decrements to i = 0
			String rightBackground 	= i == 0 ? "# ".repeat(lines - i - 1) : leftBackground;
			
			// Same as before, but now the last row needs to close off the diamond at i = 0 
			String whitespace		= i == 0 ? "" : "  ".repeat(i * 2 - 1);
			
			// Prints the current row
			System.out.println(leftBackground + whitespace + rightBackground);
		}
	}
	
	public static void main(String[] args)
	{
		// Initialize the scanner
		Scanner sc = new Scanner(System.in);
		
		// Loop forever until a valid number is given as an input
		while (true)
		{
			// Prompt the user for a positive integer
			System.out.print("Enter number of lines: ");
			int lines = sc.nextInt();
			
			// Print error if the input is not positive
			if (lines < 1)
				System.out.println("Input number should be positive.");
			
			// Draw the diamonds if input passes the condition
			else 
			{
				printSolidDiamond(lines);		// draw the solid diamond
				System.out.println();
				printInvertedDiamond(lines);	// draw the inverted diamond
				break;							// exit the loop
			}
		}
		
		// Close the scanner
		sc.close();
	}

}
