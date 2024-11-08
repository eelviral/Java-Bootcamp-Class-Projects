package lab4;
//********************************************************************
//  RockPaperScissors.java	Author: Eddie Elvira
//							Date: 	9/21/2022
//	Program that plays "Rock, Paper, Scissors" game with the user
//********************************************************************

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors
{
	public static void main(String[] args)
	{
		// Initialize the scanner and introduce the program
		Scanner sc = new Scanner(System.in);
		System.out.println("Let's play Rock, Paper, Scissors!");
		
		// Initialize random object for later use
		Random rand = new Random();
		
		// Run the loop until one of the conditions inside it make "playing" false
		boolean playing = true;
		while(playing) 
		{
			// Generate an integer between 1 and 3
			int randInt = rand.nextInt(3) + 1;
			
			// Convert random integer into the move it represents
			String computerMove;
			if (randInt == 1)				// 1 => rock			
				computerMove = "rock";
			else if (randInt == 2)			// 2 => paper
				computerMove = "paper";
			else							// 3 => scissors
				computerMove = "scissors";
			
			// Prompt the user for the move they wish to play
			System.out.print("What do you have? ");
			String userMove = sc.nextLine().toLowerCase();
			
			// Draw if the user and CPU chose the same move 
			if (userMove.equals(computerMove)) 
			{
				System.out.println("Computer has " + computerMove);
				System.out.println("It's a draw!");
			}
			// Print error if the user typed something other than rock, paper or scissors
			else if (!userMove.equals("paper") 	  && 
					 !userMove.equals("scissors") && 
					 !userMove.equals("rock"))
				System.out.println("That's not a valid choice!");
			
			// User wins if the chosen moves match one of the three combinations below
			else if (userMove.equals("paper") 	 && computerMove.equals("rock")  || 
					 userMove.equals("scissors") && computerMove.equals("paper") ||
					 userMove.equals("rock") 	 && computerMove.equals("scissors"))
				System.out.println("You win!");
			
			// User loses if all the above conditions don't pass
			else
				System.out.println("You lose!");
			
			// Create another loop to make sure user enters a valid response
			while (true) 
			{
				// Get user's response for wanting to play again
				System.out.print("\nPlay again (y/n)? ");
				String playAgainResponse = sc.nextLine().toLowerCase();
				
				// Play again if user entered "y" by breaking out of the nested loop
				if (playAgainResponse.equals("y")) 
					break;
				// End program if user entered "n" by exiting both the nested and main loop
				else if (playAgainResponse.equals("n")) 
				{
					playing = false;	// set main loop's condition to false
					break;				// exit the nested loop
				} 
				// Otherwise, print error message and rerun the nested loop
				else 
					System.out.println("Not a valid response!");
			}	
		}
		
		System.out.println("Nice playing with you!");
		// Close the scanner
		sc.close();
	}

}
