package lab5;
//**********************************************************
// PackLeader.java		  Author: Eddie Elvira
// 						  Date  : 10/5/2022
// Class to represent a Pack Leader (a.k.a. Human), and program
// where they adopt a dog, feed them, then play with them
//**********************************************************
public class PackLeader
{

	public static void main(String[] args)
	{
		// Set dog's current age to 3
		int currentAge = 3;
		
		// Create a Dog object
		Dog myDog = new Dog("Leo", currentAge, "He", "Golden Doodle");
		
		// Print the Dog's info
		myDog.printInfo();
		System.out.println();
		
		// Increment the age, and print the Dog's new info
		myDog.setAge(++currentAge);
		myDog.printInfo();
		System.out.println();
		
		// Print the Dog's status
		System.out.println(myDog.getStatus());
		
		// Play with the dog, feed them, then play with them again
		myDog.play();
		myDog.feed();
		myDog.play();
	}

}
