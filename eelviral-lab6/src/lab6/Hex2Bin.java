package lab6;
//**********************************************************
// Hex2Bin.java	 	 	  Author: Eddie Elvira
// 						  Date  : 10/6/2022
// Program that converts hexadecimal numbers to a binary
// equivalent and displays it to the user
//**********************************************************
import java.util.Scanner;

public class Hex2Bin
{
	// Decimal to binary lookup table
	final private static String[] hexBits = { "0000", "0001", "0010", "0011",
            			 			   		  "0100", "0101", "0110", "0111",
            			 			   		  "1000", "1001", "1010", "1011",
            			 			   		  "1100", "1101", "1110", "1111"};
	
	public static String dec2Bin(int decNumber)
	{
		// Return binary number in lookup table, but first, make sure that it
		// is a decimal number between 0 and 15
		return (decNumber >= 0 && decNumber <= 15) ? hexBits[decNumber] : "";
	}
	
	public static int hex2Dec(char hexDigit)
    {
    	// Values '0' to '9' (ASCII 48 to 57)
    	if (hexDigit >= 48 && hexDigit <= 57)
    		// Get the remainder of char/48 to account for ASCII value
    		return hexDigit % 48;
    	
    	// Values 'A' to 'F' (ASCII 65 to 70)
    	else if (hexDigit >= 65 && hexDigit <= 70)
    		// Get the remainder of char/(65-10) to account for ASCII value
    		// and the fact that A to F represent numbers in the tens place
    		return hexDigit % (65 - 10);
    	
    	// Values 'a' to 'f' (ASCII 97 to 102)
    	else if (hexDigit >= 97 && hexDigit <= 102)
    		// Get the remainder of char/(97-10) to account for ASCII value
    		// and the fact that a to f represent numbers in the tens place
    		return hexDigit % (97 - 10);
    	
    	// Return -1 if the digit isn't hex
    	return -1;
    }
	
    public static void main (String[] args)
    {
        // Declare a scanner and prompt the user for a hex number                     
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
         
        String hex = sc.next();	// Hex number entered by the user
        String binaryNum = "";	// Binary representation of hex value
        boolean valid = true;	// Tracks if number has valid digits
        
        // Loop through each digit of hex number
        for (int i = 0; i < hex.length(); ++i) 
        {
        	// Find decimal equivalent of hex digit
        	int decimalNum = hex2Dec(hex.charAt(i));
        	
        	// Add to binary string if digit is valid
        	if (decimalNum != -1)
        		binaryNum += dec2Bin(decimalNum);
        	
        	// Otherwise, print error and mark 'invalid'
        	else 
        	{
        		System.out.println("Not a valid hex value!");
        		valid = false;
        		break;
        	}
        	
        	// Add a space between every 4 bits
        	if (i < hex.length() - 1)
        		binaryNum += " ";
        }
        
        // Print the binary representation of valid hex value
        if (valid)
        	System.out.println("The equivalent binary is: " + binaryNum);
        
        // Close the scanner
        sc.close();
    }
    
    
}