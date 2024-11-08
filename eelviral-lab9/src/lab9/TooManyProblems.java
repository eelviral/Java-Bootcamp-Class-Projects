package lab9;
//**********************************************************
// TooManyProblems.java	  Author: Eddie Elvira
//						  Date  : 11/30/2022
// Program that catches multiple exceptions
//**********************************************************
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;

public class TooManyProblems
{
    public static void main(String[] args)
    {
        // ArrayIndexOutOfBoundsException
        try
        {
        	int[] array = new int[5]; // initialize array with 5 elements (index 0 - 4)
        	array[5] = 0;			  // try to access 6th element of array (index 5)
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index is out of bounds!");
        }
        
        // NullPointerException
        try
        {
        	String nullString = null; // initialize String with null value
        	nullString.charAt(0);	  // try to get 1st element from null string 
        }
        catch (NullPointerException e)
        {
            System.out.println("There's nothing there!");
        }
        
        // ArithmeticException
        try
        {
        	// Try to divide 1 by 0
        	int x = 1 / 0; 
        }
        catch (ArithmeticException e)
        {
            System.out.println("Can't divide a number by 0!");
        }
        
        // FileNotFoundException
        try
        {
        	// Try to access missingfile.txt, even though it's not
        	// present in the project directory
        	FileReader fr = new FileReader(new File("missingfile.txt")); 
        }
        catch (FileNotFoundException e)
        {
            System.out.println("There's no file by that name!");
        }
        
        // NumberFormatException
        try
        {
        	// Parse integer from string that has no number in it
        	Integer.parseInt("x");
        }
        catch (NumberFormatException e)
        {
            System.out.println("That's not a number!");
        }
        
        // Programmer's Choice
        try
        {
        	try
            {
        		// Locate the TooLittleProblems class
        		Class.forName("TooLittleProblems");
            }
            catch (ClassNotFoundException e)
            {
            	// Report the exception
                System.out.println("Something bad happened: " + e);
                
                // Rethrow the exception with the same message
                throw new ClassNotFoundException(e.getMessage());
            }
        }
        catch (Exception e)
        {
        	// Report the rethrown exception
        	System.out.println("Exception in thread \"main\" " + e);
        }
    }
}