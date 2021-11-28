package ch7java6thedition;

/**
 * This is check point 7.15. 
 * a) Write a statement that declares a String array initialized
 *    with the following Strings: "Mercury", "Venus", "Earth", "Mars". 
 * b) Write a loop that displays the contents of each element you 
 *    declared in a). 
 * c) Write a loop that displays the first character of the
 *    Strings stored in each element of the array you declared
 *    in a). (Hint: use the String class's charAt method discussed
 *    in chapter 2.)
 * 
 * @author craig
 */
public class CheckPoint7_15 {
	public static void main (String [] args) {
		// Declare a String array
		String [] planets = {"Mercury", "Venus", "Earth", "Mars"};

		for (String names : planets) {
			System.out.print(names + " \n");
		}

		for(String names : planets) {
			System.out.println(names.charAt(0));
		}
	}		
}
