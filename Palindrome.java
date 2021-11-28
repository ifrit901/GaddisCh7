package ch7java6thedition;
import java.util.Scanner;
/**
 * This program determines whether a phrase 
 * is a palindrome or not.
 * 
 * @author craig
 */
public class Palindrome {
	public static void main(String [] args) {
		System.out.println("Enter a word or phrase without spaces\n"
			+ "and I'll tell you "
			+ "if it is a palindrome or not.\n"
			+ "Enter the word/phrase:");
		
		Scanner input = new Scanner(System.in);
		String phrase = input.nextLine();
		int    counter = 0;		
		int length = phrase.length() - 1;
		
		for (int index = 0; index < length; index++, length--) {
			if(phrase.charAt(index) != phrase.charAt(length))	
				counter += 1;
		}
		if(counter > 0) {
			System.out.println(phrase + " is not a palindrome.");
		}
		else
			System.out.println(phrase + " is a palindrome.");
	}	
}

