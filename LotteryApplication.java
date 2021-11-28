package ch7java6thedition;
import javax.swing.JOptionPane;
import java.util.Random;
/**
 * 10. Lottery Application
 * 
 * Write a 'lottery' class that simulates a lottery. The class should have
 * an array of five integers named 'lotteryNumbers'. The constructor 
 * should use the Random class (from the Java API) to generate a random 
 * number in the range of 0 - 9 for each element in the array. The class
 * should also have a method that accepts an array of five integers that 
 * represent a person's lottery picks. The method is to compare the 
 * corresponding elements in the two arrays and return the number of 
 * digits that match. For example, the following shows the 'lotteryNumbers'
 * array and the user's array with sample numbers stored in each. There are
 * two matching digits (elements 2 and 4). 
 * 
 * lotteryNumbers array:
 * 	
 * 	---------------------
 * 	| 7 | 4 | 9 | 1 | 3 |
 * 	---------------------
 * 
 * User's array:
 * 	---------------------
 * 	| 4 | 2 | 9 | 7 | 3 |
 * 	---------------------
 *
 * In addition, the class should have a method that returns a copy of 
 * the lotteryNumbers array. 
 * 
 * Demonstrate the class in a program that asks the user to enter five
 * numbers. The program should display the number of digits that match
 * the randomly generated lottery numbers. If all the digits match, 
 * display a message proclaiming the user a grand prize winner.
 * 
 * 
 * @author craig
 */
public class LotteryApplication {
	final private int NUMBERS = 5;
	private int [] lotteryNumbers = new int [NUMBERS];
	private int [] userNumbers = new int [NUMBERS];


	public LotteryApplication() {
		Random randy = new Random();
		for(int i = 0; i < NUMBERS; i++) {
			lotteryNumbers[i] = randy.nextInt(9);
		}
	}

	public int getLotteryNumbers(int i) {
		return lotteryNumbers[i];
	}

	public int getCommonNumbers(int [] userArray) {
		int total = 0; 
		for(int i = 0; i < NUMBERS; i++) {
			if(lotteryNumbers[i] == userArray[i])
				total++;
		}
		return total;
	}

	public void setUserArray(int [] array) {
		for(int i = 0; i < NUMBERS; i++) {
			userNumbers[i] = array[i];
		}
	}

	public void results()  {
		if(getCommonNumbers(userNumbers) == NUMBERS) {
			JOptionPane.showMessageDialog(null, "\tCongratulations!!\n"
				+ "You won the LOTTERY!!");
		}
		else {
			JOptionPane.showMessageDialog(null, "\tSorry :(\n"
				+ "You only got " + getCommonNumbers(userNumbers) 
				+ " correct.");
		}	
	}
}
