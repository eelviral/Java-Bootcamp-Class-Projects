package lab7;
//**********************************************************
// WordChanger.java 	  Author: Eddie Elvira
// 						  Date  : 11/8/2022
// Program that takes words from command line and modifies
// each of them based on whether or not they are plural
//**********************************************************

import java.util.ArrayList;
import java.util.Arrays;

public class WordChanger
{
    public static void main (String[] args)
    {
        // Step 1:
        // Create an empty ArrayList object called words, and copy the
        // strings from the command line args to the ArrayList object
        ArrayList<String> words = new ArrayList<String>(Arrays.asList(args));
        
        // Step 2:
        // Print the values in the ArrayList object.
        System.out.print("Original list: ");
        printList(words);
        
        // Step 3:
        // For every element in ArrayList object words: 
        // Reverse the singular words and capitalize the plural words.
        ArrayList<String> modifiedWords = new ArrayList<String>();
        
        for(String word : words)
        {
        	// Capitalize plural words
        	if (word.endsWith("s"))
        		modifiedWords.add(capitalize(word));
        	// Reverse singular words
        	else
        		modifiedWords.add(reverse(word));
        }
        
        // Step 4:
        // Print the modified values in the ArrayList object.
        System.out.print("Modified list: ");
        printList(modifiedWords);
    }

    // Use for-each loop to print words in ArrayList
	private static void printList(ArrayList<String> words)
	{
		for(String word : words)
        	System.out.print(word + " ");
        System.out.println();
	}
    
    // Finish implementing the capitalize method
    public static String capitalize(String s)
    {
        return s.toUpperCase();
    }
    
    // Finish implementing the reverse method
    public static String reverse(String s)
    {
    	String reversed = ""; // initialize reversed string as empty string
    	int len = s.length(); // get string length
    	
    	// Start at last element and finish at first element to generate
    	// reversed string
    	for (int i = 0; i < len; ++i)
    		reversed += s.charAt(len - i - 1);
		
    	return reversed;
    }


}