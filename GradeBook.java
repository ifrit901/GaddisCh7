package ch7java6thedition;

/**
 * 8. Grade Book
 * 
 * A teacher has five students that have taken four tests. The teacher
 * uses the following grading scale to assign a letter grade to a student,
 * bases on the average of his or her four test scores:
 * 
 * Test Score 		Letter Grade
 * ---------------------------------
 * 90-100		     A
 * 80-89		     B
 * 70-79		     C
 * 60-69		     D
 * 0-59			     F
 * 
 * Write a class that uses a String array or an ArrayList object to hold 
 * the five student's names, an array of five characters to hold the five
 * student's letter grades, and five arrays of four doubles to hold each 
 * student's set of test scores. The class should have methods that return
 * a specific student's name, the average test score, and a letter grade 
 * based on the average. 
 * 
 * Demonstrate the class in a program that allows the user to enter each 
 * student's name and his or her four test scores. It should then display 
 * each student's average test score and letter grade. 
 * 
 * Input validation: Do not accept scores less than 0 or greater than 100.
 * 
 * @author craig
 * December 2020
 */
public class GradeBook {
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
	public GradeBook() {
		
	}

	// Methods
	public void setName(String name, int num) {
		names[num] = name;
	}

	public void setScores(int student, int grade, double score) {
		students[student][grade] = score;
	}


	public double getAverage(int name) {
		double average = 0.0;
		double total = 0.0;
			for(int p = 0; p < 4; p++) {
				total += students[name][p];
			}
		average = total / 4;
			
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
