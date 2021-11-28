package ch7java6thedition;
import java.util.Scanner;
/**
 * This is #1 in the programming challenges for chapter 7.
 * 
 * Write a 'Rainfall' class that stores the total rainfall for each of 12 
 * months into an array of doubles. The program should have methods that 
 * return the following:
 * 
 * - The total rainfall for the year
 * - The average monthly rainfall
 * - The month with the most rain
 * - The month with the least rain
 * 
 * Demonstrate the class in a complete program.
 * (Input validation: Do not accept negative numbers for monthly rainfall figures.)
 * 
 * @author craig
 */
public class RainfallClass {
	private double totalRainfall,
		     averageRainfall,
			    mostRain,
			   leastRain;
	
	public RainfallClass() {

	}

	/**
	 * The createArray method creates an array of 12 doubles 
	 * and fills it with user input for the total rainfall
	 * for each month of the year.
	 */
	public static double [] createArray() {
		String [] monthName = {"January", "February", "March", "April",
				    "May", "June", "July", "August", "September",
				    "October", "November", "December"};
		double [] inchesByMonth = new double [12];

		Scanner input = new Scanner(System.in);
		System.out.println("List the total rainfall for each month "
			+ "of the year: ");
		for(int i = 0; i < 12; i++) {
			System.out.println("Enter the total rainfall for " 
			+ monthName[i] );
		 	inchesByMonth[i]= input.nextDouble();

			// Input validation
			while(inchesByMonth[i] < 0) {
				System.out.println("Please enter a positive "
					+ "number of inches. \n"
					+ "Enter the total rainfall for " 
					+ monthName[i]);
					inchesByMonth[i] = input.nextDouble();
			}
		}
		return inchesByMonth;
	}
	/**
	 * The getTotalRainfall method adds the total rainfall 
	 * inches from each month.
	 * @param inches
	 * @return 
	 */
	public double getTotalRainfall(double [] inches) {
		totalRainfall = 0;
		for(int i = 0; i < inches.length; i++) {
			totalRainfall += inches[i];
		}

		return totalRainfall;
	} 
	/**
	 * The getAverageRainfall method calculates and returns
	 * the average rainfall for the year.
	 * @param inches
	 * @return 
	 */
	public double getAverageRainfall(double [] inches) {
		averageRainfall = getTotalRainfall(inches) / inches.length;

		return averageRainfall;
	}
	/**
	 * The mostRain method sorts the monthly rain totals
	 * and returns the largest total.
	 * @param inches
	 * @return 
	 */
	public double mostRain(double [] inches) {
		// Sort the total inches from each month and 
		// select the greatest value.
		int startScan,
			index,
	       	     minIndex;
 	      double minValue;

		for(startScan = 0; startScan < inches.length - 1; startScan++) {
			minIndex = startScan;
			minValue = inches[startScan];
			for(index = startScan + 1; index < inches.length; index++) {
				if(inches[index] < minValue) {
					minValue = inches[index];
					minIndex = index;
				}
			}
			inches[minIndex] = inches[startScan];
			inches[startScan] = minValue;
		}	
		mostRain = inches[11];
		return mostRain;
	} 

	public double leastRain(double [] inches) {
		// Sort the total inches from each month and 
		// select the greatest value.
	 	int startScan,
			index,
	       	     minIndex;
 	      double minValue = 0;

		for(startScan = 0; startScan < inches.length - 1; startScan++) {
			minIndex = startScan;
			minValue = inches[startScan];
			for(index = startScan + 1; index < inches.length; index++) {
				if(inches[index] < minValue) {
					minValue = inches[index];
					minIndex = index;
				}
			}
			inches[minIndex] = inches[startScan];
			inches[startScan] = minValue;
		}	
		leastRain = inches[0];
		return leastRain;
	}
}