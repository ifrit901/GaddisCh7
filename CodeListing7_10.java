package ch7java6thedition;

/**
 * This is the sales data class in code listing
 * 7.10. This class keeps the sales data for a 
 * number of days in an array and provides methods
 * for getting the total and average sales, and 
 * the highest and lowest amounts of sales.
 * 
 * @author craig
 */
public class CodeListing7_10 {
	// Create an array for the sales data
	private double [] sales;	// The sales data

	/**
	 * The constructor copies the elements in an 
	 * array to the sales array. 
	 * @param s The array to copy.
	 */
	public CodeListing7_10(double [] s) {
		// Create an array as large as 's'.
		sales = new double[s.length];

		// Copy the elements from 's' to sales
		for(int index = 0; index < s.length; index++) {
			sales[index] = s[index];
		}
	}
	/**
	 * The getTotal method 
	 * @return The total of the elements 
	 * in the sales array.
	 */	
	public double getTotal() {
		double total = 0.0;	// Accumulator variable

		// Accumulate the sum of elements
		for(int index = 0; index < sales.length; index++) {
			total += sales[index];
		}
		// Return the total
		return total;
	}
	/**
	 * The getAverage method 
	 * @return The average of the elements 
	 * in the sales array.
	 */
	public double getAverage() {
		return getTotal() / sales.length;
	}
	/**
	 * The getHighest method
	 * @return The highest value in the 
	 * elements of the sales array.
	 */
	public double getHighest() {
		double highest = sales[0];
		
		for(int index = 1; index < sales.length; index++) {
			if(sales[index] > highest) {
				highest = sales[index];
			}
		}
		return highest;
	}
	/**
	 * The getLowest method 
	 * @return The lowest value in the 
	 * elements of the sales array.
	 */
	public double getLowest() {
		double lowest = sales[0];

		for(int index = 1; index < sales.length; index++) {
			if(sales[index] < lowest) {
				lowest = sales[index];
			}
		}
		return lowest;
	}
}