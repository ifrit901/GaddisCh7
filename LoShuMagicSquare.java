package ch7java6thedition;
import java.util.Scanner;
/**
 * 19. Lo Shu Magic Square
 * 
 * The Lo Shu Magic Square is a grid with 3 rows and 3 columns, shown in 
 * figure 1 below. The Lo Shu Magic Square has the following properties:
 * 
 * 		Fig 1	-------------
 * 			| 4 | 9 | 2 |
 * 			-------------	
 *			| 3 | 5 | 7 |
 * 			-------------
 * 			| 8 | 1 | 6 |
 * 			-------------
 * 
 * - The grid contains the numbers 1 - 9 exactly.
 * - The sum of each row, each column, each diagonal all add up to the 
 *   same number. This is shown in figure 2.
 * 
 *				      15 
 * 				     /
 * 		Fig 2   ------------- 
 * 			| 4 | 9 | 2 | --> 15
 * 			-------------	
 *			| 3 | 5 | 7 | --> 15
 * 			-------------
 * 			| 8 | 1 | 6 | --> 15
 * 			-------------
 *			  |   |   |  \	     
 *			 15  15  15   15 				      
 * 
 * In a program you can simulate a magic square using a two-dimensional
 * array. Write a method that accepts a two-dimensional array as an 
 * argument, and determines if the array is a Lo Shu Magic Square. 
 * Test the function in a program.
 * 
 * 
 * @author craig
 * 1-25-21
 * 8:07am
 * 
 */
public class LoShuMagicSquare {
	public static void main(String[]args) {
		int [][] magicSquare = new int [3][3];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 9 numbers that will go into a "
			+ "square like this:\n"
			+ "	-------------\n"
			+ "	| 1 | 2 | 3 |\n"
			+ "	-------------\n"
			+ "	| 4 | 5 | 6 |\n"
			+ "	-------------\n"
			+ "	| 7 | 8 | 9 |\n"
			+ "	-------------");
		System.out.println("If all the rows, columns, and diagonals "
			+ "each individually add up to 15,\n"
			+ "then what you have is a Lo Shu Magic Square.");

		for(int i = 0; i < magicSquare.length; i++) {
			for(int p = 0; p < magicSquare[i].length; p++) {
				System.out.println("Enter a number for row " +
					(i + 1) + " column " + (p + 1) + ":");
				magicSquare[i][p] = input.nextInt();
			}	
		}

		// Test the array for magic squareness..
		if(magicSquareTest(magicSquare)) {
			System.out.println("Congrats! This is a Lo Shu Magic Square!");
		}
		else if(!magicSquareTest(magicSquare)) {
			System.out.println("Sorry, this isn't a Magic Square :(");
		}
		else
			System.out.println("Something went wrong...");
	}		

	public static boolean magicSquareTest(int [][] array) {
		boolean isMagic = false;
		int totalRow1 = 0,
		    totalRow2 = 0,
		    totalRow3 = 0,
		    totalColumn1 = 0,
		    totalColumn2 = 0,
		    totalColumn3 = 0,
		    totalDiagonal1 = 0,
		    totalDiagonal2 = 0;
		
		for(int i = 0; i < array[0].length; i++) {
			totalRow1 += array[0][i];
		}
		for(int i = 0; i < array[1].length; i++) {
			totalRow2 += array[1][i];
		}
		for(int i = 0; i < array[2].length; i++) {
			totalRow3 += array[2][i];
		}
		for(int i = 0; i < array.length; i++) {
			totalColumn1 += array[i][0];
		}
		for(int i = 0; i < array.length; i++) {
			totalColumn2 += array[i][1];
		}
		for(int i = 0; i < array.length; i++) {
			totalColumn3 += array[i][2];
		}	

		// Diagonals
		totalDiagonal1 = array[0][0] + array[1][1] + array[2][2];
		totalDiagonal2 = array[2][0] + array[1][1] + array[0][2];

		if(totalRow1 == 15 && totalRow2 == 15 && totalRow3 == 15 &&
		   totalColumn1 == 15 && totalColumn2 == 15 && totalColumn3 == 15 &&
		   totalDiagonal1 == 15 && totalDiagonal2 == 15) {
			isMagic = true;
		}
		return isMagic;
	}
}
