/* Antonio Brown 
 * Programming Fundamentals 
 * Lab 2 
 * 7/18/20
 */

import java.util.Scanner;
import java.util.Random;

public class Lab2_Ex1_ageGuess {

	public static void main(String[] args) {

		// Declaring variables
		int ageGuess;

		// Creating Random Object
		Random gen = new Random();

		// Creating a variable that will generate a random age
		int age = gen.nextInt(100);

		// Creating Scanner object
		Scanner scan = new Scanner(System.in);
		// Creating the question for the user to answer
		System.out.print("Guess Age: ");
		// Creating the field to enter users name
		ageGuess = scan.nextInt();

		// Stops scanning for input
		scan.close();

		// Displays users age
		System.out.print(" The users age guess is : ");
		System.out.println(ageGuess);
		// Displays users age
		System.out.print(" The actual age is: ");
		System.out.println(age);
	}

}
