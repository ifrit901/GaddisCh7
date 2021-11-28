package ch7java6thedition;
import java.util.ArrayList;
import java.util.Random;
/**
 * These are scrap programs to test my answers to the review 
 * questions at the end of Chapter 7.
 * 
 * @author craig
 */
public class ArrayListExample {
	public static void main(String [] args) {
		// Create an ArrayList
		ArrayList <String> nameList;
		nameList = new ArrayList <>();

		// Add some names to the ArrayList
		nameList.add("Cathy");
		nameList.add("Sean");
		nameList.add("Susan");

		// Print the names
		for(String names : nameList) {
			System.out.println(names);
		}

		// Add a name to a specific point in the list
		nameList.add(2, "John");

		// Print the edited list
		for(String names : nameList) {
			System.out.println(names);
		}

		// Create a String array
		String [] words = {"Hello", "Goodbye"};

		// Print the first word in the list uppercase
		System.out.println(words[0].toUpperCase());

		// Print the array again
		for(int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}

		// Display the length of all the Strings in the array
		int total = 0;	// Accumulator
		for(int i = 0; i < words.length; i++) {
			total += words[i].length();
		}

		System.out.println("The total length of all the Strings in "
			+ "the array is " + total);

		// Create an integer array and fill it 1 - 100
		int [] numberArray1 = new int [100];
		for(int i = 0; i < numberArray1.length; i++) {
			numberArray1[i] = i;
		}

		// Print the array
		for(int num : numberArray1) {
			System.out.print(num + " ");
		}
		
		// Create a second array and copy first array to it
		int [] numberArray2 = new int [100];
		for(int i = 0; i < numberArray2.length; i++) {
			numberArray2[i] = numberArray1[i];
		}

		// Print second array
		System.out.println();
		for(int num : numberArray2) {
			System.out.print(num + " ");
		}

		System.out.println();

		// 2-dimensional array
		int [][] twoDarray = new int [30][10];

		System.out.println("The length of twoDarray is " 
			+ twoDarray.length + " \nand also " + twoDarray[0].length);
		
		Random randy = new Random();

		for(int p = 0; p < twoDarray.length; p++) {
			for(int i = 0; i < twoDarray[0].length; i++) {
				twoDarray[p][i] = randy.nextInt(10) + 1;
			}
		}					

		for(int p = 0; p < twoDarray.length; p++) {
			for(int i = 0; i < twoDarray[0].length; i++) {
				System.out.print(twoDarray[p][i] + " ");
			}
			System.out.println();
		}
		int total2 = 0;
		for(int p = 0; p < twoDarray.length; p++) {
			for(int i = 0; i < twoDarray[i].length; i++) {
				total2 += twoDarray[p][i];
			}
		}
		System.out.println("The average of all the grades in the "
			+ "2-dimensional array is " + total2);

		for(int i = 0; i < twoDarray.length; i++) { 		       
			int total3 = 0;
			for(int p = 0; p < twoDarray[i].length; p++) {      
		  		total3 += twoDarray[i][p];	
		 	} 
		      	System.out.println("The total for row " + i 
		  			+ " is " + total3);
		      }
		System.out.println("The length of the column is " 
			+ twoDarray.length);
		
		for(int p = 0; p < twoDarray[p].length; p++) { 		       
			int total3 = 0;
			for(int i = 0; i < twoDarray.length; i++) {      
		  		total3 += twoDarray[i][p];	
		 	} 
		      	System.out.println("The total for column " + p 
		  			+ " is " + total3);
		}

		// Create an ArrayList, add three String car names, display
		ArrayList<String>carNames = new ArrayList<>();
		carNames.add("Nissan");
		carNames.add("Honda");
		carNames.add("Ford");
		for(String cars : carNames) {
			System.out.println(cars);
		}

		
	}	
}
