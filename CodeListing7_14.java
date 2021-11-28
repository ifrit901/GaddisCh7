package ch7java6thedition;

/**
 * This program demonstrates how a reference
 * to an array can be returned from a method.
 * 
 * @author craig
 */
public class CodeListing7_14 {
	public static void main(String [] args) {
		double [] values;

		values = getArray();

		for (double num : values) {
			System.out.println(num);
		}
	}	

	/**
	 * The getArray method.
	 * @return A reference to an array of variables.
	 */
	public static double [] getArray() {
		double [] array = {1.2, 2.3, 3.4, 4.5, 5.6, 6.7};
		return array;
	}
}
