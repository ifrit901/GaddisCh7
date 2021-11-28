package ch7java6thedition;
import java.util.Scanner;
/**
 * This is code listing 7.9, it demonstrates passing
 * a reference value to an array as an argument to 
 * a method.
 * 
 * @author craig
 */
public class CodeListing7_9 {
	public static void main(String [] args) {
		final int ARRAY_SIZE = 4;	// The size of the array

		// Create an array
		int [] numbers = new int [ARRAY_SIZE];

		// Pass the array to the getValues method
		getValues(numbers);

		System.out.println("Here are the values you entered:");

		showArray(numbers);
	}	

	/**
	 * The getValues method accepts a reference to an array
	 * as its argument. The user is asked to enter a value
	 * for each element. 
	 * @param array A reference to the array.
	 */
	public static void getValues(int [] array) {
		// Create a Scanner object for keyboard input
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a series of " + array.length +
			" numbers.");

		for(int index = 0; index < array.length; index++) {
			System.out.println("Enter number " + (index + 1)
			+ ": ");
			array[index] = input.nextInt();
		}
	}

	/**
	 * The showArray method accepts an array as 
	 * an argument and displays its contents.
	 * @param array A reference to the array. 
	 */
	public static void showArray(int [] array) {
		for(int index = 0; index < array.length; index++) {
			System.out.println(array[index] + " ");
		}
	}
}
