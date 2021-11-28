package ch7java6thedition;
import java.util.Scanner;
/**
 * This is a test of the RainfallClass class.
 * 
 * @author craig
 */
public class RainfallClassTest {
	public static void main(String[]args) {
		// Create an object of the RainfallClass class
		// man what a dumb name lol.
		RainfallClass rainYear = new RainfallClass();

		// Call the createArray method to collect rainfall data 
		// for the year
		double [] inchesByMonth = rainYear.createArray();
	
		// Prove that the class works as intended 
		System.out.println("The total rainfall for the year is "
			+rainYear.getTotalRainfall(inchesByMonth) + " inches.");

		System.out.println("The average rainfall for the year is " 
			+ String.format("%.2f", rainYear.getAverageRainfall(inchesByMonth)) 
			+ " inches.");

		System.out.println("The most rainfall was " 
			+ rainYear.mostRain(inchesByMonth) + " inches."); 

		System.out.println("The least rainfall a month was " 
			+ rainYear.leastRain(inchesByMonth) + " inches.");
	}	
}
