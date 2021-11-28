package ch7java6thedition;
import java.util.Scanner;
/**
 * This is programming challenge #5. 
 * 
 * In a program, write a method that accepts two arguments:
 * an array and a number 'n'. Assume that the array contains 
 * integers. The method should display all of the numbers
 * in the array greater than the number 'n'.
 * 
 * @author craig
 */
public class LargerThanN {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will generate a list of 30 "
			+ " numbers. \nThen you will choose a number and it will"
			+ "find all the numbers greater than the number you choose."); 
		int [] numList = new int [30];
		for(int i = 0; i < 30; i++) {
			numList[i] = i + 1; 
		}
		System.out.println("This is the list of numbers:");
		for(int i = 0; i < 30; i++) {
			System.out.print(numList[i] + " ");
		}
		System.out.println("\nEnter a number between 1 - 30 and the program\n"
			+ "will list the numbers that are greater than that number:");
		int number = input.nextInt();
		System.out.println("Thanks! This is the list of numbers greater "
			+ "than the one you entered:");
		larger_than_n(numList, number);
	}	
	public static void larger_than_n(int [] array, int num) {
		for(int i = num; i < 30; i++) {
			System.out.print(array[i] + " ");	
		}
		System.out.println();
	}
}
