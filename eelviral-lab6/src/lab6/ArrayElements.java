package lab6;
//**********************************************************
// ArrayElements.java 	  Author: Eddie Elvira
// 						  Date  : 10/5/2022
// Program that creates an array containing numbers 0-9, and
// edits one of the elements afterwards
//**********************************************************
public class ArrayElements
{
	// Print each element inside an integer array
	private static void printIntArray(int[] array) 
	{
		for (int i = 0; i < array.length; i++) 
		    System.out.print(array[i] + " ");
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		// Declare an integer array of size 10
		int[] numbers = new int[10];
		
		// Initialize the numbers array with
		// the values 0 thru 9
		for (int i = 0; i < 10; i++)
		    numbers[i] = i;
		
		// Output the values of the numbers array
		printIntArray(numbers);
		
		// Set the value of the 5th element equal to the 
		// sum of the 8th and 9th element
		numbers[5] = numbers[8] + numbers[9];
		
		// Output the new values of the numbers array
		printIntArray(numbers);
	}

}
