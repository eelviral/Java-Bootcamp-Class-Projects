package lab8;
//**********************************************************
// CopyImage.java 	  	  Author: Eddie Elvira
//						  Date  : 11/16/2022
// Program that reads from the image file "pets.jpg" and
// copies each byte to an output image file "pets_copy.jpg"
//**********************************************************
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImage
{	
	public static void main(String[] args) throws IOException
	{
		// Open input image file "pets.jpg"
		FileInputStream input = new FileInputStream("pets.jpg");
		
		// Create output image file "pets_copy.jpg"
		FileOutputStream output = new FileOutputStream("pets_copy.jpg");
		
		System.out.println("Copying file...");
		
		// Loop until there are 0 bytes left to read
		while(input.available() > 0)
		{
			int data = input.read(); // read a single byte from input file
			output.write(data);		 // write the data byte to output file
		}
		System.out.println("Copying complete");		
		
		input.close();	// close the input file
		output.close();	// close the output file
	}
}
