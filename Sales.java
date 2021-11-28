package ch7java6thedition;
import javax.swing.JOptionPane;
/**
 * This program tests the CodeListing7_10 (SalesData) class.
 * It gathers the sales amounts for the week. It uses the
 * CodeListing7_10(SalesData) class to display the total,
 * average, lowest and highest amounts.
 * 
 * @author craig
 */
public class Sales {
	public static void main(String [] args) {
		final int ONE_WEEK = 7;		// Number of elements

		// Create an array to hold the sales amounts for one week
		double sales [] = new double [ONE_WEEK]; 

		// Get the week's sales figures
		getValues(sales);

		// Create a SalesData object, initialized with
		// the week's sales figures.
		CodeListing7_10 week = new CodeListing7_10(sales);

		// Display the total, average, highest and lowest 
		// sales amounts for the week.
		JOptionPane.showMessageDialog(null, 
			String.format("The total sales were $%,.2f\n"
				      +"The average sales were $%,.2f\n"
				      + "The highest sale was $%,.2f\n"
				      + "The lowest sale was $%,.2f",
					week.getTotal(), 
					week.getAverage(),
					week.getHighest(), 
					week.getLowest()));

		System.exit(0);
	}	

	/**
	 * The getValues method asks the user to 
	 * enter sales amounts for each element 
	 * of an array. 
	 * @param array The array to store the values in. 
	 */
	public static void getValues(double [] array) {
		String input;
		double sale;
		for(int i = 0; i < 7; i++) {
			input = JOptionPane.showInputDialog
			(null, "Enter the sales for week " + (i + 1) + ":"); 
			sale = Double.parseDouble(input);
			array[i] = sale;
		}
}
}
