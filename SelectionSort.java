package ch7java6thedition;
import java.util.Random;
/**
 * This is an example of a selection sort using 
 * and integer array. The array is filled with 
 * random numbers 1 - 10 which are printed out 
 * in their original random order and then sorted.
 * During the sort, statements are printed out 
 * telling what each variable is at that time
 * in the iterations.
 * 
 * @author craig
 */
public class SelectionSort {
	public static void main (String [] args) {
		int array [] = new int [10];
		Random randy = new Random();

		for(int index = 0; index < array.length; index++) {
			int decimal = randy.nextInt(10) + 1;
			array[index] = decimal;
		}
		System.out.println("The randomized array starts out as:");
		for(int num : array) {
			System.out.print(num + " ");
		}
		
		System.out.println("\n"); 
		
		int 	startScan,
		    	index,
			minIndex,
			minValue;

		for(startScan = 0; startScan < array.length - 1; startScan++) {
			minIndex = startScan;
			minValue = array[startScan];
			System.out.println("Outer loop, iteration " + (startScan+1) + ", minIndex is " + minIndex 
					   + ", minValue is " + minValue + " and startScan is at index " 
					   + startScan + ". \nEntering inner loop...");
			for(index = startScan + 1; index < array.length; index++) {
				if(array[index] < minValue) {
					minValue = array[index];
					minIndex = index;
					System.out.println("\t\tAt inner loop iteration " +index+", " 
						+ array[index] + "(array["+ index +"]) is "
						+ "less than minValue and its \n\t\tindex and value are assigned. "
						+ "minIndex is now " + minIndex 
						+ " and minValue is now " + minValue + ".");
				}
				else {
					System.out.println("\t\tAfter if statement has made its comparison,\n\t\t"
					+  array[index] + "(array[" + index + "]) is not less than "
					+ minValue + " at array[" + minIndex + "]."
					+ "\n\t\tInner loop index is incremented to " + (index++) + ".");	
				}
			}
			System.out.println("Before the next iteration of the outer loop,\n"
				+ "the value at array[minIndex] (" + array[minIndex] 
				+ ") is changed to the value at array[startScan]" 
				+ "(" + array[startScan] + ") \n"
				+ "and then the value at array[startScan](" + array[startScan] 
				+ ") is set equal to minValue ("+ minValue + ")"
				+ "\nThe state of the array at this point is:");
 
			array[minIndex] = array[startScan];
			array[startScan] = minValue;
					for(int num : array) {
						System.out.print(num + " ");
					}
					System.out.println("\n");
		}
		System.out.println("\nAfter sorting, the array becomes:");	
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
