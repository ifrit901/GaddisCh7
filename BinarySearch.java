package ch7java6thedition;
import java.util.Random;
/**
 * This demonstrates an example of the binary 
 * search algorithm.
 * 
 * @author craig
 */
public class BinarySearch {
	public static void main(String [] args) {
		// Engage the user and let them know what's going on..
		System.out.println("At the beginning of this program, "
			+ "an array of 100 integers is created\n"
			+ "and is filled with random numbers between 1 - 100");

		Random randy = new Random();
		int [] array = new int [100];
		for(int i = 0; i < 100; i++) {
			array[i] = randy.nextInt(100) + 1;
		}

		for(int p = 0; p < array.length; p++) {
			if(p % 10 == 0) {
				System.out.println();
			}
			System.out.print(array[p] + " ");
		}
		System.out.println();

		/*
		Now that a random integer array of 100 elements
		has been created and displayed, a binary search 
		will be applied to the array to search for the 
		value 77. If it is found, the search will return
		the subscript of the element. If it is not found, 
		-1 will be returned. First, the array must be 
		sorted into ascending order.
		*/
		System.out.println("\n\nNow that a random integer array of 100 elements\n"
		+ "has been created and displayed, a binary search\n" 
		+ "will be applied to the array to search for the\n" 
		+ "value 77. If it is found, the search will return\n"
		+ "the subscript of the element. If it is not found,\n" 
		+ "-1 will be returned. First, the array must be\n" 
		+ "sorted into ascending order.");

		int     startScan,
			index,
			minIndex,
			value = 77,
			minValue;

		for(startScan = 0; startScan < (array.length - 1); startScan++) {
			minIndex = startScan;
			minValue = array[startScan];
			for(index = startScan + 1; index < array.length; index++) {
				if(array[index] < minValue) {
					minValue = array[index];
					minIndex = index;
				}
			}
			array[minIndex] = array[startScan];
			array[startScan] = minValue;
		}
		for (int i = 0; i < array.length; i++) {
			if(i % 10 == 0) {
				System.out.println();
			}
			System.out.print(array[i] + " ");
		}
		
		System.out.println("\n");
		if(binarySearch(array, value) != -1) {
			System.out.println("77 was found at position " + 
				(binarySearch(array, value) + 1) + " in the list(array).");
		}	
		else
			System.out.println("77 was not in the array");
		
	}		
	/**
	 * The binarySearch method takes an integer array and a 
	 * integer as arguments. The method searches the array
	 * for the value in the integer argument and returns its
	 * position in the array.
	 * @param ary The integer array
	 * @param num The integer to be found
	 * @return The subscript position of the integer searched
	 * 	   for, -1 if not found.
	 */

	public static int binarySearch(int [] ary, int num) {
		int first;	// First array element
		int last;	// Last array element
		int middle;	// Midpoint of search
		int position;	// Position of search value
		boolean found;	// Flag

		// Set the initial values
		first = 0;
		last = ary.length -1;
		position = -1;
		found = false;

		// Search for the value
		while(!found && first <= last) {
			// Calculate midpoint
			middle = (first + last) / 2;

			// If value is found at midpoint
			if(ary[middle] == num) {
				found = true;
				position = middle;
			}
			
			// else if value is in lower half of array..
			else if (ary[middle] > num) 
				last = middle - 1;	
			

			// else if value is in upper half of array..
			else 
				first = middle + 1;
			
		}
		// Return position of the item, or -1 if the position
		// is not found.
		return position;
	}
}
