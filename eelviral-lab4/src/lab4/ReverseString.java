package lab4;
//********************************************************************
//  ReverseString.java		Author: Eddie Elvira
//							Date: 	9/14/2022
//	A program that reverses a string larger than two characters, which
//	is provided by the user
//********************************************************************
import java.util.Scanner;

public class ReverseString
{
	public static void main(String[] args)
	{
		// Initialize the scanner
		Scanner sc = new Scanner(System.in);

		// Keep running loop until the user inputs a string of length 2 or more
		while(true) 
		{
			// Prompt the user and store the the line of input as a string
			System.out.print("Enter a string: ");
			String inputString = sc.nextLine();
			
			// Store the input string's length to reference later
			int stringLength = inputString.length();
			
			// If the input string has at least 2 characters, move on to the next step
			if (stringLength >= 2)
			{
				char firstChar = inputString.charAt(0);				  // Find the first character (index: 0)
				char lastChar = inputString.charAt(stringLength - 1); // Find the last character  (index: len-1)
				
				System.out.println("Length: " + stringLength);		  // Print length of input string
				System.out.println("First character: " + firstChar);  // Print the first character
				System.out.println("Last character: " + lastChar); 	  // Print the last character
				
				// Create reversed string by looping through the input string backwards (going from
				// the last index down to the first) and concatenating each character to a new
				// string variable initialized as empty.
				String reversedString = "";
				for (int i = 1; i <= stringLength; i++)
					reversedString += inputString.charAt(stringLength - i);
				
				System.out.println("Reversed string: " + reversedString);	// Print the reversed string
				break;														// Exit loop and program
			}
			// Print error if the input string's length is below two
			else 
				System.out.println("String must be at least 2 characters long.\n");
		}
		
		// Close the scanner
		sc.close();
	}

}
