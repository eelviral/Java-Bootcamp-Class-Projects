package lab8;
//**********************************************************
// WordCounter.java 	  Author: Eddie Elvira
//						  Date  : 11/16/2022
// Program that counts number of words inside text file
// and counts the number of words that start with 'T' or 't'
//**********************************************************
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordCounter
{
	public static void main(String[] args) throws IOException
	{
		// Keep track of the filename
		String filename = "goodwriting.txt";
		
		// Open input text file
		FileReader input = new FileReader(filename);
		
		// Have scanner read values inside input file
        Scanner sc = new Scanner(input);
        
        int wordCount = 0;  // keeps track of word count
        int wordCountT = 0; // keeps track of words that start with 'T' or 't'
        
        // Loop until no words are left in the file
        while (sc.hasNext())
        {
        	// Scan the next word
        	String word = sc.next();
        	
        	// If the word starts with 'T' or 't'
        	if (word.toUpperCase().charAt(0) == 'T')
        		wordCountT++;
        	
        	// Increment word count
        	wordCount++;
        }
        
        // Print file information to the console
        System.out.println("Filename: " + filename);
        System.out.println("Count of words: " + wordCount);
        System.out.println("Count of T words: " + wordCountT);
        
        input.close(); // close the input file
        sc.close();	   // close the scanner
	}
}
