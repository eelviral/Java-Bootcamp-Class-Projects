package lab6;
//**********************************************************
// ArrayWords.java	 	  Author: Eddie Elvira
// 						  Date  : 10/6/2022
// Program that separates the words in a sentence, then finds
// the total number of words and the shortest and longest word
//**********************************************************
public class ArrayWords
{
    static public void main (String[] args)
    {
    	// The original sentence
        String sentence = "Java is a class-based, object-oriented programming language " +
            "that is designed to have as few implementation dependencies as possible. It " +
            "is a general purpose programming language intended to let application " +
            "developers write once, run anywhere (WORA), meaning that compiled Java " +
            "code can run on all platforms that support Java without the need for recompilation.";
        
        // Split the sentence into separate words
        String[] words = sentence.split(" ");
        
        // Get the total words and print them
        int totalWords = words.length;
        System.out.println("Total words: " + totalWords);
        
        // Initialize the longest and shortest word to the first word in the
        // sentence, or to an empty string (in case the sentence is empty)
        String longestWord = totalWords > 0 ? words[0] : "";
        String shortestWord = totalWords > 0 ? words[0] : "";
        
        // Loop through each word in the sentence
        for (int i = 0; i < totalWords; ++i)
        {
        	int charCount = words[i].length();		// Get the current word's length
        	
        	if (charCount > longestWord.length())	// If it's longer than previous words,
        		longestWord = words[i];				// then update longestWord
        	
        	if (charCount < shortestWord.length())	// If it's shorter than previous words,
        		shortestWord = words[i];			// then update shortestWord
        }
        
        // Print the results
        System.out.println("Longest word: " + longestWord);
        System.out.println("Shortest word: " + shortestWord);
    }
}