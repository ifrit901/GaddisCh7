package ch7java6thedition;

/**
 * 9. Grade Book Modification
 * 
 * Modify the grade book application in programming challenge
 * 8 so that it drops each student's lowest score when determining 
 * the test score averages and letter grades.
 * 
 * @author craig
 */
public class GradeBookModified {
	// Instance fields
	final int STUDENT = 5;
	final int GRADE = 4;
	double score;
	double average;
	char letterGrade;
	String name;
	String [] names = new String [STUDENT]; 

	char [] letters = new char [STUDENT]; 
	
	double [][] students = new double [STUDENT][GRADE];

	// Constructor
	public GradeBookModified() {
		
	}

	// Methods
	public void setName(String name, int num) {
		names[num] = name;
	}

	public void setScores(int student, int grade, double score) {
		students[student][grade] = score;
	}


	/**
	 * The getAverage method calculates the average grade 
	 * for a specific student and also subtracts the 
	 * lowest grade from the student's grades.
	 * @param name
	 * @return The average grade minus the lowest score
	 */
	public double getAverage(int name) {
		double lowestGrade = students[name][0];
		double average = 0.0;
		double total = 0.0;
		for(int i = 1; i < GRADE; i++) {
			if(students[name][i] < lowestGrade) {
				lowestGrade = students[name][i];
			}
		}

		for(int p = 0; p < 4; p++) {
			total += students[name][p];
		}
		total -= lowestGrade;
		average = total / 3;
			
		this.average = average;
		
		return average;
	}


	public char getLetter(int average) {
		char letter;
		int num = average;
		if(getAverage(num) > 89) {
			letter = 'A';
		}	
		else if (getAverage(num) > 79) {
			letter = 'B';
		}
		else if (getAverage(num) > 69) {
			
			letter = 'C';
		}
		else if (getAverage(num) > 59) {
			letter = 'D';
		}
		else 
			letter = 'F';
		return letter;
	}

	public String getName(int num) {
		return names[num];
	}
	
}
