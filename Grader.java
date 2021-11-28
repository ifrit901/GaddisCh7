package ch7java6thedition;

/**
 * This is the Grader class that goes along 
 * with the Chemistry class problem in chapter
 * seven, In the Spotlight. This is the UML 
 * diagram for the class:
 * 
 * 	-----------------------------------------
 * 	|		Grader			|
 * 	|---------------------------------------|
 * 	| - testScores : double []		|
 * 	|---------------------------------------|
 * 	| + Grader(scoreArray : double[]) 	|
 * 	| + getLowestScore() : double 		|
 * 	| + getAverage() : double		|
 * 	|---------------------------------------|
 * 
 * 
 * @author craig
 */
public class Grader {
	// Class field
	private double [] testScores; 

	// Constructor
	public Grader(double [] scoreArray) {
		// Assign the array argument to the 
		// testScores field
		testScores = scoreArray;
	}

	/**
	 * The getLowestScore method compares the 
	 * values in the testScores array and returns
	 * the lowest one.
	 * @return The lowest test value.
	 */
	public double getLowestScore() {
		double lowest = testScores[0];

		for (int index = 1; index < testScores.length; index++) {
			if(testScores[index] < lowest) {
				lowest = testScores[index];
			}
		}
		return lowest;
	}

	/**
	 * The getAverage method calculates the sum of 
	 * the values in testScores and divides them 
	 * by testScores.length.
	 */
	public double getAverage() {
		double total = 0,
		       lowest;

		if(testScores.length < 2) {
			// Print an error message if there are less 
			// than two array elements
			System.out.println("Error, there must be at least "
				+ "two test scores!");
			return 0.0;
		}
		else {
			// Calculate the total of the scores,
			// use an enhanced for loop
			for(double score : testScores) {
				total += score;
			}

			// Get the lowest test score
			lowest = getLowestScore();

			// Subtract the lowest from the total
			total -= lowest;
		}	
		// return the total divided by the number of elements
		// minus the lowest test score.
		return total / (testScores.length -1);
	}
		
		
}
