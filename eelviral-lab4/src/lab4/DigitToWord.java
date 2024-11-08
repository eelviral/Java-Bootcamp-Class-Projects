package lab4;
//********************************************************************
//  DigitToWord.java		Author: Eddie Elvira
//							Date: 	9/21/2022
//	Program that prints the name of an integer input by the user
//********************************************************************

import java.util.Scanner;

public class DigitToWord
{
	public static void main(String[] args)
	{
		// Initialize the scanner and prompt the user for a digit
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a digit: ");
		
		// Get digit entered by user and check if its value matches
		// one of the cases below to print its corresponding word
		switch(sc.nextInt()) 
		{
			case 0:
				System.out.println("ZERO");				// 0 => ZERO
				break;
			case 1:
				System.out.println("ONE");				// 1 => ONE
				break;
			case 2:
				System.out.println("TWO");				// 2 => TWO 
				break;
			case 3:
				System.out.println("THREE");			// 3 => THREE
				break;
			case 4:
				System.out.println("FOUR");				// 4 => FOUR
				break;
			case 5:
				System.out.println("FIVE");				// 5 => FIVE 
				break;
			case 6:
				System.out.println("SIX");				// 6 => SIX
				break;
			case 7:
				System.out.println("SEVEN");			// 7 => SEVEN
				break;
			case 8:
				System.out.println("EIGHT");			// 8 => EIGHT
				break;
			case 9:
				System.out.println("NINE");				// 9 => NINE
				break;
			default:
				System.out.println("Invalid digit!");	// Print error
		}
		
		// Close the scanner
		sc.close();
	}

}
