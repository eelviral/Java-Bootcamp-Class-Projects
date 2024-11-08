package lab5;
//**********************************************************
// GuessMyNumber.java     Author: Eddie Elvira
// 						  Date  : 9/28/2022
// Class that provides methods for guessing a random number
// between 1 and 100
//**********************************************************
import java.util.Random;

public class GuessMyNumber
{
    private int targetNumber;	// Target number for user to guess from
    private int guessNumber;	// User's current guess number
    
    /** Chooses a target number between 1 to 100 for a user to guess from */
    public GuessMyNumber()
    {
    	Random random = new Random();
    	targetNumber = random.nextInt(99) + 1;
    }
    
    /** 
	 * Checks whether or not the target number matches the user's guess
	 * @return true if they do match, or false if the user guessed incorrectly
	 */
    public boolean isCorrect() 
    {
		return (targetNumber == guessNumber) ? true : false;
    }
    
    /**
     * Gives the user a hint that reveals if their guess was less than or 
     * greater than the target number
     */
    private void showHint()
    {
       String hint = (guessNumber < targetNumber) ? "Too Low!" : "Too High!";
       System.out.println(hint);
    }
    
    /**
     * Determines if the guess obtained from the user  matches the target 
     * number or if it is incorrect, in which case a hint will be displayed
     * @param guess - the user's guess
     * @return true if guess is correct, or false if guess is wrong
     */
    public boolean guess(int guess)
    {
    	// guessNumber is updated for isCorrect() 
    	guessNumber = guess;
    	
    	// If isCorrect() returns true, tell the user that they found the 
    	// correct number and return true
    	if (isCorrect()) 
    	{
    		System.out.println("That's it!");
    		return true;
    	}
    	
    	// If the user's guess was wrong, give them a hint and return false
    	showHint();
    	return false;
    }
}