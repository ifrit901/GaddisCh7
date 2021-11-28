package ch7java6thedition;

/**
 * This is code listing 7.17 which demonstrates 
 * a sequential search through an array to find
 * a specific value.
 * 
 * @author craig
 */
public class SearchArray7_17 {
	public static void main(String [] args) {
		int [] tests = {87, 75, 98, 100, 82};
		boolean found = false;
		int element = 0;
		
		// Search the array for the value 100.
		for(int index = 0; index < tests.length -1; index++) {
			if(tests[index] == 100) {
				found = true;
				element = index;
			}
		}
		
		if(found) {
			System.out.println("The grade 100 is number " 
				+ (element + 1) +
				" in this list.");
		}
		else
			System.out.println("The grade 100 is not in this list.");
	}	
}
