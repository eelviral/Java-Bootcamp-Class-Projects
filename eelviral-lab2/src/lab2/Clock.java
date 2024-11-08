package lab2;
//********************************************************************
//  Clock.java       		Author: Eddie Elvira
//							Date: 	9/4/2022
//  Program that asks for time, displays it, and makes a calculation
//********************************************************************
import java.util.Scanner;


public class Clock
{

	public static void main(String[] args)
	{
		// Initialize scanner
		Scanner sc = new Scanner(System.in);

		// Prompt user while getting number of hours, minutes and seconds
		System.out.print("Please enter Hours: ");
		int hr = sc.nextInt();
		System.out.print("Please enter Minutes: ");
		int min = sc.nextInt();
		System.out.print("Please enter Seconds: ");
		int sec = sc.nextInt();
		
		// Display amounts entered by the user
		System.out.println("The time you entered is " + hr + ":" + min + ":" + sec);
		
		// Calculate seconds since midnight and display it
		int secondsSinceMidnight = (hr * 60 * 60) + (min * 60) + sec;
		System.out.println("Seconds since midnight: " + secondsSinceMidnight);
		
		// Close the scanner
		sc.close();
	}

}
