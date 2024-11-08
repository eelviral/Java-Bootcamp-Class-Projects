package lab5;
//**********************************************************
// Dog.java			      Author: Eddie Elvira
// 						  Date  : 10/1/2022
// Class to represent a Dog
//**********************************************************
public class Dog
{
	final private String name;		// Name of the dog
	final private String breed;		// Breed of dog
	private int age;				// Dog's age
	final private String gender;	// Dog's gender
	private boolean hungry;			// Whether or not dog is hungry
	
	/**
	 * Manually set the dog's name, age, gender and breed. Default
	 * value of "hungry" is automatically set to true
	 */
	public Dog(String name, int age, String gender, String breed) 
	{
		this.name = name;
		setAge(age);
		this.gender = gender;
		this.breed = breed;
		this.hungry = true;
	}
	
	/**
	 * Set a new age for the dog (in years)
	 * @param age - the age to set the dog to
	 */
	public void setAge(int age)
	{
		this.age = age;
	}
	
	/**
	 * Print out the dog's info, specifically, their name, breed 
	 * and current age
	 */
	public void printInfo()
	{
		// Print name
		System.out.println("This dog's name is " + name + ".");
		
		// Print breed
		System.out.println(name + " is a " + breed);
		
		// Print age
		System.out.print(gender + " is " + age);
		System.out.println(age == 1 ? " year old." : " years old.");
	}
	
	/**
	 * Get the dog's current status (based on hunger)
	 * @return Dog's status
	 */
	public String getStatus() 
	{
		// If hungry is true, then status is "hungry"
		if (getHungry())
			return name + " is hungry.";
		// If hungry is false, then status is "not hungry"
		else
			return name + " is not hungry.";
	}
	
	/**
	 * Play with the dog only if they are fed. After playing, set the value
	 * of "hungry" back to its default value, true
	 */
	public void play()
	{
		// If dog is hungry, they do not want to play
		if (getHungry())
			System.out.println(name + " is hungry and does not want to play.");
		// If dog is fed, play with them but expect them to be hungry afterwards
		else 
		{
			System.out.print(name + " is playing. ");
			this.hungry = true;
			System.out.println("It looks like " + gender.toLowerCase() + " is getting hungry.");
		}
	}
	
	/**
	 * Feed the dog by setting "hungry" to false
	 */
	public void feed()
	{
		this.hungry = false;
		System.out.println(name + " has been fed.");
	}
	
	/**
	 * Get the dog's value of "hungry"
	 * @return value of "hungry"
	 */
	public boolean getHungry()
	{
		return hungry;
	}


}
