package ch7java6thedition;

/**
 * This is code listing 7.19, it uses the data
 * in a 2D array to display the number of rows
 * and columns in each row.
 * 
 * @author craig
 */
public class Lengths7_19 {
	public static void main(String [] args) {
		final int ROWS = 3,
		       COLUMNS = 4;
		int      total = 0, 
		    totalTotal = 0;

		// Declare a 2D array with 3 rows and 4 columns
		int [][]numbers = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		// Display the contents of the arrays
		for(int i = 0; i < ROWS; i++) {
			for(int p = 0; p < COLUMNS; p++) {
				System.out.print(numbers[i][p] + " ");
			}
			System.out.println();
		}

		// Print the length of the array, which is the number 
		// of rows
		System.out.println("The number of rows in the array is " +
			numbers.length);

		// Print the number of columns in each row
		for(int index = 0; index < numbers.length; index++) {
			System.out.println("The number of columns in row "
			+ (index + 1) + " is " + numbers[index].length);
		}

		// Add the elements of each row
		for(int index = 0; index < numbers.length; index++) {
			for(int i = 0; i < numbers[index].length; i++) {
				total += numbers[0][i];
			}
			System.out.println("The total for row "
				+ (index + 1) + " is: " + total);
			totalTotal += total;
		}

		// Display the total of all the rows
		System.out.println("The total of all the rows is: " + totalTotal);

		total = 0;
		// Add the columns in each row
		for(int col = 0; col < numbers[0].length; col++) {
			for(int row = 0; row < numbers.length; row++) {
				total += numbers[row][col];
			}
			System.out.println("The total for column " + (col + 1) +
			" is " + total);
		}	
	}	
}
