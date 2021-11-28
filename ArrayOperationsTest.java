package ch7java6thedition;
import java.util.Scanner;
/**
 * This tests the ArrayOperations class.
 * 
 * @author craig
 */
public class ArrayOperationsTest {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		ArrayOperations ao = new ArrayOperations();
		char [] letters = new char [5];
		String letter;
		System.out.println("Make a list of 5 letters:");
		for(int i = 0; i < 5; i++) {
			System.out.println("Enter letter number " + (i + 1) + ":");
			letter = input.nextLine();
			letters[i] = letter.charAt(0);
		}

		System.out.println("The average of all the chars in the array is : "
			+ ao.getAverage(letters));
		System.out.println("The total of all the chars in the array is : "
			+ ao.getTotal(letters));
		System.out.println("The highest value in the char array is : "
			+ ao.getHighest(letters));
		System.out.println("The lowest value in the char array is : "
			+ ao.getLowest(letters));
	}	
}
