package lab8;
//**********************************************************
// BioWriter.java 	  	  Author: Eddie Elvira
// 						  Date  : 11/14/2022
// Program that writes biographical information to an output
// text file called bio.txt
//**********************************************************
import java.io.IOException;
import java.io.PrintWriter;

public class BioWriter
{
	public static void main(String[] args) throws IOException
    {
		// Create output text file "bio.txt"
        PrintWriter out = new PrintWriter("bio.txt");

        // Write biographical information to output file
        out.println("My name is Eddie Elvira.\n"
        		  + "I am majoring in Computer Engineering and minoring in Computer Science.\n"
        		  + "I work remotely as a Full Stack Engineer at a tech startup and I hope\n"
        		  + "to work more closely with hardware to build advanced robots one day.");

        // Close the output file
        out.close();
    }
}
