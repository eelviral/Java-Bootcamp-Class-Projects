package lab8;
//**********************************************************
// SummingNumbers.java 	  Author: Eddie Elvira
//						  Date  : 11/16/2022
// Program that reads a file using a buffered reader and 
// prints information about the numbers inside the file
//**********************************************************
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayList;

public class SummingNumbers
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("Summing Numbers");
		
		// Scan for a valid filename
		String filename = getValidFileName();
		
		// Open input file
		FileReader input = new FileReader(filename);
		
		// Allows us to read input file data in large chunks
		BufferedReader reader = new BufferedReader(input);
		
		System.out.println("Reading numbers from " + filename);
		
		// Store numbers from file inside ArrayList
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		// Read each line inside input file
		String line;
		while ((line = reader.readLine()) != null)
		{
			// Split line data and store it inside a list
			String[] numbers = line.split(" ");
			
			// Add each number to numList
			for (int i = 0; i < numbers.length; ++i)
				numList.add(Integer.parseInt(numbers[i]));
		}
		
		reader.close(); // close the buffered reader
		input.close();	// close the input file
		
		int total = 0;	// track the total
		
		// Run through each number inside numList
		for (int number : numList)
		{
			System.out.print(number + " "); // print the number
			total += number;				// add number to total
		}
		System.out.println("\nTotal is " + total);
	}

	private static String getValidFileName()
	{
		Scanner sc = new Scanner(System.in); // scanner object
		boolean valid = false;				 // tracks if filename is valid 
		String filename = "";				 // name of input file

		// Loop until filename is valid
		while(!valid)
		{
			System.out.print("Enter number file: ");
			
			// Get user input for filename
			filename = sc.nextLine();
			
			// Use regex operation to get numbers inside input
			String filenumbers = filename.replaceAll("[^0-9]", "");
			
			// Make sure that a number was entered inside filename
			if (!filenumbers.isEmpty())
			{
				// Converts number from String to int
				int filenum = Integer.parseInt(filenumbers);
				
				int len = filename.length();
				
				// If filename is above 8 characters and has a number between 5 and 10
				if (len > 8 && (filenum >= 5 && filenum <= 10))
				{
					// If the filename ends in "nums.txt"
					if (filename.substring(len - 8).equals("nums.txt"))
					{
						// Filename is valid if all the above conditions pass
						valid = true;
						break;
					}
				}
			}
			
			// Let the user know that the filename is invalid if the above
			// conditions fail, and print input suggestions
			System.out.print("Invalid filename\n"
						   + "(Valid filenames: ");
			for (int i = 5; i <= 10; ++i)
			{
				if (i < 10)
					System.out.print(i + "nums.txt, ");
				else
					System.out.println(i + "nums.txt)\n");
			}
		}
		
		sc.close();		 // close the scanner
		return filename; // return valid filename
	}
}
