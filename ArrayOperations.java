package ch7java6thedition;

/**
 * 11. Array Operations
 * 
 * Write a program with an array that is initialized with test data. 
 * Use any primitive data type of your choice. The program should 
 * also have the following methods:
 * 
 * - getTotal. This method should accept a one-dimensional array as
 *   its argument and return the sum of its elements.
 * - getAverage. This method should accept a one-dimensional array 
 *   as its argument and return the average of the values in the array.
 * - getHighest. This method should accept a one-dimensional array
 *   as its argument and return the highest value in the array.
 * - getLowest. This method should accept a one-dimensional array 
 *   as its argument and return the lowest value in the array.
 * 
 * Demonstrate each of the methods in the program.
 * 
 * @author craig
 */
public class ArrayOperations {
	// Instance methods
	char [] charArray = new char [5];

	// Constructor
	public ArrayOperations() {

	}
	
	// Methods
	public int getTotal(char [] array) {
		int total = 0;
		for(int i = 0; i < charArray.length; i++) {
			total += array[i];
		}
		return total;
	}

	public double getAverage(char [] array) {
		double average = 0.0; 
		double total = 0.0;
		for(int i = 0; i < array.length; i++) {
			total += array[i];	
		}
		average = total / array.length;
		return average; 
	}

	public int getHighest(char [] array) {
		int highest = array[0];
		for(int i = 1; i < array.length; i++) {
			if(array[i] > highest) {
				highest = array[i];
			}
		}
		return highest;
	}

	public int getLowest(char [] array) {
		int lowest = array[0];
		for(int i = 1; i < array.length; i++) {
			if(array[i] < lowest) {
				lowest = array[i];
			}
		}
		return lowest;
	}
	
}
