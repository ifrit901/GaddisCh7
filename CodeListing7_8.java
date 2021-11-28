package ch7java6thedition;

/**
 * This is code listing 7.8. It demonstrates passing individual
 * array elements as arguments to a method. 
 * 
 * @author craig
 */
public class CodeListing7_8 {
	public static void main(String [] args) {
		int [] numbers = {5, 10, 15, 20, 25, 30, 35, 40};

		for(int index = 0; index < numbers.length; index++) {
			showValue(numbers[index]);
		}
	}	

	/**
	 * The showValue method displays its argument.
	 * @param n The value to display.
	 */
	public static void showValue(int n) {
		System.out.println(n + " ");
	}
}
