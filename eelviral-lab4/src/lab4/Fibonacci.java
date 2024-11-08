package lab4;
//********************************************************************
//  Fibonacci.java			Author: Eddie Elvira
//							Date: 	9/14/2022
//  A program that prints the first 15 Fibonacci numbers to the console
//********************************************************************

public class Fibonacci
{	
	public static void main(String[] args)
	{
		// Introduce the program
		System.out.println("The first 15 Fibonacci numbers are:");
		
		int f1 = 0; 	// value of F(n-1)
		int f2 = 0;		// value of F(n-2)
		int sum = 0; 	// sum of f1 and f2
		
		// Loop 15 times through Fibonacci formula
		for (int i = 0; i < 15; i++)
		{
			// When f1 and f2 both equal 0 (the 1st Fibonacci number), the Fibonacci formula
			// fails to find the next number in the sequence because the output gets stuck at 0.
			// To fix this, the value of f1 must be manually set equal to the next number in the
			// sequence (the 2nd Fibonacci number, "1")
			if (f1 == 0 && f2 == 0) 
			{
				f1 = 1;					// set f1 equal to the next/2nd Fibonacci number
				System.out.print("1 ");	// print the 2nd Fibonacci number
				++sum;					// raise the sum by the 2nd Fibonacci number
			} 
			// Otherwise, use the Fibonacci formula F(n) = F(n-1) + F(n-2) to find the next
			// number in the sequence
			else 
			{
				int next = f1 + f2;			  // find the next Fibonacci number using 
				
			    System.out.print(next + " "); // print the next number in the sequence
			    sum += next;				  // raise the sum by the value of the next number
			    
			    f2 = f1;					  // set f2 equal to f1's current value
				f1 = next;					  // set f1 equal to the next number in the sequence
			}
		}
		
		// Calculate average
		System.out.println("\nThe average is " + (sum / 15.0));
	}

}
