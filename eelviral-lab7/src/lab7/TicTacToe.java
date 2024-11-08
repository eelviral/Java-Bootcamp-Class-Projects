package lab7;
//**********************************************************
// TicTacToe.java 	  	  Author: Eddie Elvira
// 						  Date  : 10/26/2022
// Program that creates and runs a TicTacToe game on the
// command line
//**********************************************************
import java.util.Scanner;

public class TicTacToe
{
    // The tic tac toe playing board
    private static char[][] board = new char[3][3];
    
    // Used to find the winner. Winning combinations equal 15, every time
    private static final int[][] MAGIC_SQUARE = {
        {8, 1, 6}, 
        {3, 5, 7}, 
        {4, 9, 2}
    };
    
    private static int[] magicSquareX;					// store the magic squares captured by X
    private static int[] magicSquareO;					// store the magic squares captured by O
    private static Scanner sc = new Scanner(System.in); // declare a scanner for the class
    private static boolean player1Turn = true;			// keep track of X and O's turn
    private static int turns = 0;						// keep track of the number of turns

    public static void main(String[] args)
    {
        System.out.println("Let's play tic tac toe!");
        
        // Declare a new TicTacToe object
        TicTacToe game = new TicTacToe();

        // Initialize and display the board
        initBoard();
        displayBoard();
        
        // Loop until a player wins
        while (!win())
        {       	
        	if (player1Turn) game.Xmove(); 	// player 1's turn => X's move
        	else			 game.Omove();	// player 2's turn => O's move
   
        	displayBoard();
        	
        	player1Turn = !player1Turn;		// switch turn to the next player
        	++turns;						// increment the number of turns
        	
        	// If the game is a tie, break
        	if (tie())
            	break;           	
        }
        
        // fill in your game play code here
        sc.close();
    }

    public static void initBoard()
    {
        System.out.println("Initializing the game board...");

        // initialize the board with blank spaces
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
        
        // Initialize the magic squares of X and O to be losing combinations (not equal to 15)
        magicSquareX = new int[]{-15, -15, -15, -15, -15, -15, -15, -15, -15};
        magicSquareO = new int[]{-15, -15, -15, -15, -15, -15, -15, -15, -15};
    }

    public static void displayBoard()
    {
        System.out.println();
        System.out.println("  0  " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("    ---+---+---");
        System.out.println("  1  " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("    ---+---+---");
        System.out.println("  2  " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
        System.out.println("     0   1   2 ");
        System.out.println();
    }

    private void Xmove()
    {
    	// Get the move (row and column) entered by the user
    	int[] move = getValidMove('X');
    	int row = move[0], col = move[1];
    	
        // Store X on the given row and column
        board[row][col] = 'X';
        
        // Store the corresponding magic square (for tracking X's points)
        magicSquareX[3 * row + col] = MAGIC_SQUARE[row][col];
        
    }

    private void Omove()
    {
    	// Get the move (row and column) entered by the user
    	int[] move = getValidMove('O');
    	int row = move[0], col = move[1];
    	
        // Store O on the given row and column
        board[row][col] = 'O';
        
        // Store the corresponding magic square (for tracking O's points)
        magicSquareO[3 * row + col] = MAGIC_SQUARE[row][col];
    }
    
    int[] getValidMove(char player) 
    {
    	int row = -1, col = -1;
    	
    	// Loop until the user enters a valid row and column
    	boolean validInput = false;
    	while(!validInput) 
    	{
        	System.out.print("Player " + player + " plays at location [row column]: ");
        	
    		// Loops until valid integer is given (row)
    		while (!sc.hasNextInt()) 
    			sc.next();
    		row = sc.nextInt();
    		
    		// Loops until valid integer is given (column)
    		while (!sc.hasNextInt())
    			sc.next();
    		col = sc.nextInt();
    		
    		// Make sure row and column are between 0 and 2
    		if (row < 0 || row > 2 || col < 0 || col > 2)
    			continue;
            
    		// If the chosen spot is empty, it's a valid move
            if (board[row][col] == ' ')
            	validInput = true;
            // Otherwise, let the user know that the spot is already taken
            else
            	System.out.println("That square is taken by " + board[row][col] + ".");
    	}
    	
    	// Return the move as an array
    	return new int[] {row, col};
    }

    private static boolean tie()
    {
    	// It's a tie if the board is filled, has no winner, and no moves are left
    	if (turns > 8) 
    	{
    		System.out.println("It's a tie!");
    		return true;
    	}
    		
        // Return false if the game isn't tied
        return false;
    }

    public static boolean win()
    {
    	// Square 1 (checked against squares 2 and 3)
        for (int i = 0; i < 9; ++i)
        {
        	// Square 2 (checked against squares 1 and 3)
        	for (int j = 0; j < 9; ++j)
        	{
        		// Square 3 (checked against squares 1 and 2)
        		for (int k = 0; k < 9; ++k)
        		{
        			// Square 1, 2, and 3 should not be the same square
        			if (i != j && i != k && j != k)
        			{
        				// Check if X or O has a winning combination that equals 15
        				int totalX = magicSquareX[i] + magicSquareX[j] + magicSquareX[k];
                        int totalO = magicSquareO[i] + magicSquareO[j] + magicSquareO[k];
                        
                        // If X had a winning combination, X wins
                        if (totalX == 15)
                        {
                        	System.out.println("Player X wins!");
                        	return true;
                        }
                        
                        // If O had a winning combination, O wins
                        if (totalO == 15)
                        {
                        	System.out.println("Player O wins!");
                        	return true;
                        }
        			}
        		}
        	}
        }
        
        // Return false if neither X nor O won the game 
        return false;
    }
}