package ch7java6thedition;
import java.io.*;
import java.util.Scanner;
/*
 * 
 * Write a class with a constructor that accepts a filename as its argument.
 * Assume the file contains a series of numbers, each written on a separate 
 * line. The class should read the contents of the file into an array, and
 * then displays the following data:
 * 
 * - The lowest number in the array
 * - The highest number in the array
 * - The total of the numbers in the array
 * - The average of the numbers in the array
 * 
 * @author craig
 */
public class NumberAnalysisClass {
	// Instance variables
	private int [] numberList;
	private String fileName;
	private File fileToReadFrom;
	private Scanner input;
	private Scanner inputFile;
	
	// Constructor
	public NumberAnalysisClass(String fileName) throws IOException {
		fileToReadFrom = new File(fileName);
		while(!fileToReadFrom.exists()) {
			System.out.println(fileToReadFrom + " does not exist."
				+ "\nPlease enter a valid file name:");
			input = new Scanner(System.in);
			fileName = input.nextLine();
			fileToReadFrom = new File(fileName);
		}

		inputFile = new Scanner(fileToReadFrom);
		numberList = new int [getNumberOfNumbers()];
		
		inputFile = new Scanner(fileToReadFrom);
	
		int i = 0;
		while(inputFile.hasNext()) {
			numberList[i] = inputFile.nextInt();
			i++;
		}
		
	}


	// Methods
	
	public int getLowest() {
		int lowest = numberList[0];
		for(int i = 1; i < numberList.length; i ++) {
			if(numberList[i] < lowest) {
				lowest = numberList[i];
			}
		}	
		return lowest;
	}

	public int getHighest() {
		int highest = numberList[0];
		for(int i = 1; i <numberList.length; i++) {
			if(numberList[i] > highest) {
				highest = numberList[i];
			}
		}
		return highest;
	}

	public String getAverage() {
		double average;
		double total = 0.0;
		for(int i = 0; i < numberList.length; i++) {
			total += numberList[i];
		}
		average = total / numberList.length;
		return String.format("%,.2f", average);
	}

	public int getTotal() { 
		int total = 0; 
		for(int i = 0; i < numberList.length; i++) {
			total += numberList[i];
		}
		return total;
	}

	public int getNumberOfNumbers() {
		int total = 0;
		while(inputFile.hasNext()) {
			inputFile.nextInt();
			total += 1;
		}
		inputFile.close();
		return total;
	}
}
