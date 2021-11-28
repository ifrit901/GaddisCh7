package ch7java6thedition;
import java.util.Scanner;
/**
 * This program tests the 'QuarterlySalesStatistics' class.
 * 
 * @author craig
 */
public class QuarterlySalesStatisticsTest {
	public static void main(String[]args) {
		/**
		 * Getting the input...
		 */
		Scanner input = new Scanner(System.in);
		QuarterlySalesStatistics qss = new QuarterlySalesStatistics();
		double sales = 0.0;

		for(int quarter = 0; quarter < 4; quarter++) {
			for(int division = 0; division < 6; division++) {
				System.out.println("Enter the sales for division "
					+ (division + 1) + " during quarter "
						+ (quarter + 1) + ":");
				sales = input.nextDouble();

				while(sales < 0) {
					System.out.println("Please enter a positive "
						+ "number for the sales : ");	
					sales = input.nextDouble();
				}
			
				qss.setSales(quarter, division, sales);
			}
		}

		/**
		 * Displaying the sales by division...
		 */
		System.out.println("1. Total Sales by Division");
		System.out.println("   D I V I S I O N S  1 - 6");
				
		for(int division = 0; division < 6; division++) {
			System.out.print("|$" + 
				String.format("%,.2f", qss.getSalesByDivision(division)));
		}

		/** * This section displays the amount of increase or decrease 
		 * by quarter. The first quarter is left out because logic.
		 */
		System.out.println("\n");
		System.out.println("2. Increases or Decreases by Quarter");
		

		System.out.print("          ");
		System.out.println("D I V I S I O N S   1 - 6");

		for(int quarter = 1; quarter < 4; quarter++) {
			System.out.print("QUARTER " + (quarter + 1));
			for(int division = 0; division < 6; division++) {
				System.out.print("|$" + 
				String.format("%,.2f", qss.getIncreaseDecrease(quarter, division)));
			}
			System.out.println();
		}

		/**
		 * Display the totals by quarter.
		 */
		System.out.println("\n3. Total Sales by Quarter");
		System.out.println("    Q U A R T E R S  1 - 4");

		for(int quarter = 0; quarter < 4; quarter++) {
			System.out.print("|$" +
			String.format("%,.2f", qss.getSalesByQuarter(quarter)));
		}
		System.out.println();
		
		/**
		 * Display increases or decreases in sales
		 */	
		System.out.println("\n4. Change in Sales from Quarter to Quarter");
		System.out.println("  QUARTERS 2 - 4");

		for(int quarter = 1; quarter < 4; quarter++) {
			System.out.print("|$" +
			String.format("%,.2f", qss.getIncreaseDecreaseByQuarter(quarter)));
		}
		System.out.println("\n");

		/**
		 * Display the average sales by quarter
		 */
		System.out.println("5. The Average Sales by Quarter");
		System.out.println("     QUARTERS 1 - 4");

		for(int quarter = 0; quarter < 4; quarter++) {
			System.out.print("|$" + 
			String.format("%,.2f", qss.getAverageSalesByQuarter(quarter)));
		}
		System.out.println("\n");

		/**
		 * Division with the highest sales by quarter
		 * 
		 */
		System.out.println("6. The Highest Sales by Quarter");
		System.out.println("   QUARTERS 1 - 4");

		for(int i = 0; i < 4; i++) {
			System.out.println("The highest sales in Quarter " + (i + 1) 
				+ " were in Division " + (qss.highestSalesByQuarter(i) + 1));
		}
	}	
}
