package ch7java6thedition;

/**
 * 7. Quarterly Sales Statistics
 * 
 * Write a program that lets the user enter four quarterly sales 
 * figures for six divisions of a company. The figures should be
 * stored in a two-dimensional array. Once the figures are entered,
 * the program should display the following information for each
 * quarter:
 * 
 * - A list of the sales figures by division
 * - Each division's increase or decrease from the previous quarter
 *   (This will not be displayed for the first quarter)
 * - The total sales for the quarter
 * - The company's increase or decrease from the previous quarter
 *   (This will not be displayed for the first quarter)
 * - The average sales for all divisions that quarter
 * - The division with the highest sales for that quarter
 * 
 * (Input validation: Do not accept negative numbers for sales figures.)
 * 
 * @author craig
 */
public class QuarterlySalesStatistics {
	// Instance fields
	private final int DIVISION = 6,
			   QUARTER = 4;   
	
	private double sales;

	private double [][] salesFigures = new double [QUARTER][DIVISION];

	public QuarterlySalesStatistics() {

	}
	
	// Setters
	public void setSales(int quart, int div, double sales) {
		salesFigures[quart][div] = sales;	
	}

	// Getters
	public double [][] getSalesFigures() {
		return salesFigures;
	}

	public double getSalesByDivision(int div){
		double divisionSales = 0.0;
		for(int i = 0; i < 4; i++) {
			divisionSales += salesFigures[i][div];
		}
		return divisionSales;
	}

	public double getSalesByQuarter(int quart) {
		double salesByQuarter = 0.0;
		for (int i = 0; i < 6; i++) {
			salesByQuarter += salesFigures[quart][i];
		}
		return salesByQuarter;
	}

	public double getIncreaseDecrease(int quart, int division) {
		double change = 0.0;
		change = salesFigures[quart][division] - salesFigures[quart - 1][division];
		return change;
	}

	public double getIncreaseDecreaseByQuarter(int quart) {
		double change = 0.0;
		change = getSalesByQuarter(quart) - getSalesByQuarter(quart -1);
		return change;
	}

	public double getAverageSalesByQuarter(int quart) {
		double average = 0.0;
		average = getSalesByQuarter(quart) / 4;
		return average;
	}

	public int highestSalesByQuarter(int quart) {
		int highest = 0;
		for(int i = 1; i < 6; i++) {
			highest = salesFigures[quart][i] > highest ? i : highest;
		}
		return highest; 
	}
} 