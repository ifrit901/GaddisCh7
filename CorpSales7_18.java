package ch7java6thedition;
import java.util.Scanner;
/**
 * This is code listing 7.18. It demonstrates 
 * how to use a two dimensional array to process 
 * data about the sales of different divisions 
 * of a corporation.
 * 
 * @author craig
 */
public class CorpSales7_18 {
	public static void main(String [] args) {
		final int DIVS = 3,	// The divisions in the company
			  QTRS = 4;	// The fiscal quarters
		double totalSales = 0.0;// Accumulator

		// Create a two-dimensional array
		double [][] sales = new double[DIVS][QTRS];

		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Create nested for loops to enter sales information.
		for(int div = 0; div < DIVS; div++) {
			for(int qtr = 0; qtr < QTRS; qtr++) {
				System.out.printf("Division %d, Quarter %d: $"
					,(div + 1),(qtr + 1));
				sales[div][qtr] = input.nextDouble();
			}
			System.out.println();
		}

		// Nested loops to add all the sales
		for(int div = 0; div < DIVS; div++) {
			for(int qtr = 0; qtr < 	QTRS; qtr++) {
				totalSales += sales[div][qtr];
			}
		}
		
		// Display the results
		System.out.println("The total sales were $" + totalSales);
	}	
}
