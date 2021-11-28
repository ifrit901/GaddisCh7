package ch7java6thedition;
import java.util.Scanner;
/**
 * This program uses the Grader class to calculate 
 * the average of a set of test scores with the
 * lowest grade dropped. 
 * 
 * @author craig
 */
public class CalcAverage {
	public static void main(String [] args) {
		int numberOfScores;

		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Get the number of test scores
		System.out.println("How many test scores do you have?");

		numberOfScores = input.nextInt();

		// Create an array to hold the scores
		double [] scores = new double[numberOfScores];

		// Get the scores and store them in the array
		for(int index = 0; index < scores.length; index++) {
			System.out.println("Enter score number " + (index + 1) 
			+ ": ");
			scores[index] = input.nextDouble();
		}

		// Create a Grader object, passing the scores array as
		// an argument to the Constructor
		Grader grader = new Grader(scores);

		// Display the adjusted average
		System.out.println("The average test score is " 
		+ grader.getAverage());
		
		// Display the lowest test score
		System.out.println("The lowest score was " + grader.getLowestScore());
	}	
}
