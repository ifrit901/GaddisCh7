package ch7java6thedition;

/**
 * This is programming challenge #16. 
 * 
 * Write a program that creates a 2-dimensional array initialized with test data.
 * Use any primitive data type that you want. The program should have the following
 * methods:
 * 
 * - getTotal. This method should accept a 2-dimensional array as its argument
 *   and return the total of the values in the array.
 * - getAverage. This method should accept a 2-dimensional array as its argument
 *   and return the average of all the values in the array.
 * - getRowTotal. This method should accept a 2-dimensional array as its first
 *   argument and an integer as its second argument. The second argument should 
 *   be the subscript of a row in the array. The method should return the total
 *   of the values in the row.
 * - getColumnTotal. This method should accept a 2-dimensional array as its
 *   first argument and an integer as its second argument. The second argument 
 *   should be the subscript of a column in the array. This method should return 
 *   the total of the values in the specified column. 
 * - getHighestInRow. This method should accept a 2-dimensional array as its 
 *   first argument and an integer as its second argument. The second argument 
 *   should be the subscript of a row in the array. The method should return 
 *   the highest value in the specified row in the array. 
 * - getLowestInRow. This method should accept a 2-dimensional array as its first 
 *   argument and an integer as its second argument. 
 * 
 * @author craig
 * 1-20-2021
 */
public class TwoDimensionalOperations {
	public static void main (String [] args) {
		// Generate a 2-dimensional array
		int [][] twoDArray = new int [30][30];

		// Fill it
		for(int i = 0; i < twoDArray.length; i++) {
			for(int p = 0; p < twoDArray[i].length; p++) {
				twoDArray[i][p] = p + 1;
				System.out.print(twoDArray[i][p] + " ");
			}
			System.out.println();
		}
	
		System.out.println("The total of all the elements in the "
			+ "array is " + getTotal(twoDArray));
		System.out.println("The average of all the elements in the "
			+ "array is " + getAverage(twoDArray));
		System.out.println("The total for row 7 in the array is "
			+ getRowTotal(twoDArray, 7));
		System.out.println("The highest element in row 7 is " 
			+ getHighestInRow(twoDArray, 7));
		System.out.println("The lowest element in row 7 is " 
			+ getLowestInRow(twoDArray, 7));
	}

	public static int getTotal(int [][] array) {
		int total = 0;
		for(int i = 0; i < array.length; i++) {
			for(int p = 0; p < array[i].length; p++) {
				total += array[i][p]; 
			}
		}
		return total;
	}

	public static int getAverage(int [][] array) {
		return getTotal(array) / (array.length * array[0].length);
	}

	public static int getRowTotal(int [][] array, int row) {
		int total = 0;
		for(int i = 0; i < array[row].length; i++) {
			total += array[row][i];
		}
		return total;
	}

	public static int getColumTotal(int [][] array, int col) {
		int total = 0; 
		for(int i = 0; i < array.length; i++) {
			total += array[i][col];
		}
		return total;
	}

	public static int getHighestInRow(int [][] array, int row) {
		int highest = array[row][0]; 
		for(int i = 0; i < array[row].length; i++) {
			if(array[row][i] > highest) {
				highest = array[row][i];
			}	
		}
		return highest;
	}

	public static int getLowestInRow(int [][] array, int row) {
		int lowest = array[row][0];
		for(int i = 0; i < array[row].length; i++) {
			if(array[row][i] < lowest) {
				lowest = array[row][i];
			}
		}
		return lowest;
	}
	
}