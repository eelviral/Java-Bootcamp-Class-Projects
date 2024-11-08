package lab6;
//**********************************************************
// ArrayIntegers.java 	  Author: Eddie Elvira
// 						  Date  : 10/5/2022
// Program that stores numbers entered by a user, calculates
// the average, and finds more info related to the average
//**********************************************************
import java.util.Scanner;

public class ArrayIntegers
{
	public static void main(String[] args)
	{
		// Declare a scanner and prompt the user for a number
		Scanner sc = new Scanner(System.in);
		System.out.print("How many numbers do you want to enter? ");
		
		// Get the number entered by the user to create an
		// integer array of that size
		int size = sc.nextInt();
		int[] numbers = new int[size];
		
		// Store the sum to calculate the average later
		int sum = 0;
		
		// Initialize array elements with values entered by the user
		for (int i = 0; i < size; ++i)
		{
			// Prompt the user for a new number and enter it into the array
			System.out.print("Enter number > ");
			numbers[i] = sc.nextInt();
			
			// Add to the sum
			sum += numbers[i];
		}
		
		// Calculate the average as an integer
		int average = sum / size;
		System.out.println("\nThe average is " + average);
		
		int countBelowAverage = 0;			// Count of numbers less than average
		int countEqualAverage = 0;			// Count of numbers equal to average
		int countAboveAverage = 0;			// Count of numbers greater than average
	
		// Get more info on the array
		for (int i = 0; i < size; ++i) 
		{
			if (numbers[i] < average)		// Get numbers below average
				++countBelowAverage;
			else if (numbers[i] == average)	// Get numbers equal to average
				++countEqualAverage;
			else							// Get numbers above average
				++countAboveAverage;		
		}
		
		// Print the array info that was found
		System.out.println("Count less than average: " + countBelowAverage);
		System.out.println("Count equal to average: " + countEqualAverage);
		System.out.println("Count greater than average: " + countAboveAverage);
		
		// Close the scanner
		sc.close();
	}
}
