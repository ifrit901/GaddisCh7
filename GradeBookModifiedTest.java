package ch7java6thedition;
import java.util.Scanner;
/**
 * This program tests the modified grade book class.
 * 
 * @author craig
 */
public class GradeBookModifiedTest{
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		GradeBookModified gb = new GradeBookModified();
		String name;
		double score;
		for(int i = 0; i < 5; i++) {
			System.out.println("Enter the name of student #" + (i + 1));
			name = input.nextLine();
			gb.setName(name, i);
			for(int p = 0; p < 4; p++) {
				System.out.println("Enter grade " + (p + 1) 
				+ " for " + gb.getName(i));
				score = input.nextDouble();
				// Input validation
				while(score < 0 || score > 100) {
					System.out.println("Please enter a "
						+ "score between 0 - 100: ");
					score = input.nextDouble();
				}
				gb.setScores(i, p, score);
				input.nextLine();
			}
		}
		for(int i = 0; i < 5; i++) {
			System.out.println("Student: " + gb.getName(i) + 
				"\nAverage: " + gb.getAverage(i) +
				"\nGrade: " + gb.getLetter(i));
			System.out.println();
		}
	}
}
