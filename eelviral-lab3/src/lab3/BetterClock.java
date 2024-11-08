package lab3;
//********************************************************************
//  BetterClock.java       	Author: Eddie Elvira
//							Date: 	9/7/2022
//  A better version of Clock.java that checks the user's inputs before
//	making calculations and displaying output.
//********************************************************************
import java.util.Scanner;


public class BetterClock
{
	public static void main(String[] args)
	{
		// Initialize scanner
		Scanner sc = new Scanner(System.in);

		// Store error occurrences as a boolean
		boolean error = false;
		
		// Get hours and make sure it's not less than 0 or greater than 23
		System.out.print("Please enter Hours: ");
		int hr = sc.nextInt();
		if (hr > 23) 
		{
			System.out.println("Error: hours can be no greater than 23");
			error = true;
		} else if (hr < 0) {
			System.out.println("Error: hours cannot be negative");
			error = true;
		}
		// Close scanner and terminate program if there's an incorrect input
		if (error) {
			sc.close();
			return;
		}
		
		// Get minutes and make sure it's not less than 0 or greater than 59
		System.out.print("Please enter Minutes: ");
		int min = sc.nextInt();
		if (min > 59) {
			System.out.println("Error: minutes can be no greater than 59");
			error = true;
		} else if (min < 0) {
			System.out.println("Error: minutes cannot be negative");
			error = true;
		}
		// Close scanner and terminate program if there's an incorrect input
		if (error) {
			sc.close();
			return;
		}
		
		// Get seconds and make sure it's not less than 0 or greater than 59
		System.out.print("Please enter Seconds: ");
		int sec = sc.nextInt();
		if (sec > 59) {
			System.out.println("Error: seconds can be no greater than 59");
			error = true;
		} else if (sec < 0) {
			System.out.println("Error: seconds cannot be negative");
			error = true;
		}
		// Close scanner and terminate program if there's an incorrect input
		if (error) {
			sc.close();
			return;
		}

		// Display amounts entered by the user
		System.out.println("The time you entered is " + hr + ":" + min + ":" + sec);
		
		// Calculate seconds since midnight and display it
		int secondsSinceMidnight = (hr * 60 * 60) + (min * 60) + sec;
		System.out.println("Seconds since midnight: " + secondsSinceMidnight);
		
		// Close the scanner
		sc.close();
	}

}
