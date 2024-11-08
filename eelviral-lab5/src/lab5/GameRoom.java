package lab5;
//**********************************************************
// GameRoom.java     	  Author: Eddie Elvira
// 						  Date  : 9/28/2022
// Program that uses the GuessMyNumber class to create a game
// where the user guesses a random number between 1 and 100
//**********************************************************
import java.util.Scanner;

public class GameRoom
{
    public static void main(String[] args)
    {
		// Declare a scanner
    	Scanner sc = new Scanner(System.in);
    	
        // Create a GuessMyNumber object
        GuessMyNumber brain = new GuessMyNumber();

        // Print out welcome message
        System.out.println("Let's play Guess My Number!\n");

        // play the game
    	System.out.println("I've chosen a number between 1 and 100.");
    	
    	boolean isCorrect = false;	// Tracks the game's progress
    	int guessCount = 0;			// Tracks the number of guesses

    	// Give the user unlimited guesses and stop when isCorrect equals
    	// true (depends on the return value of brain.guess(USER_INPUT))
    	while (!isCorrect) 
    	{
    		System.out.print("Guess what it is: ");
    		isCorrect = brain.guess(sc.nextInt());
    		++guessCount;
    	}
    	
    	// Print the number of guesses the user made and close the scanner
    	System.out.print("You got it in " + guessCount);
    	System.out.println(guessCount == 1 ? " guess." : " guesses.");
    	sc.close();
    }
}
