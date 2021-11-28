package ch7java6thedition;
import java.util.Scanner;
import java.io.*;
/**
 * This program tests the ChargeAccountValidation class.
 * 
 * @author craig
 */
public class ChargeAccountValidationTest {
	public static void main(String[]args) throws IOException {
		// Create a Scanner object 
		Scanner input = new Scanner(System.in);

		// Create a ChargeAccountValidation object
		ChargeAccountValidation cav = new ChargeAccountValidation();

		// Engage the user and let them know what's going on...
		System.out.println("This program will test an account number "
			+ "to see if it is valid.\n"
			+ "Enter a number to see if it is on the list:");
		int accountNumber = input.nextInt();

		// Set the account number field in the ChargeAccountValidation object
		cav.setAccountNumber(accountNumber);

		// Test the number for validation
		if(cav.numberValidator(accountNumber)) {
			System.out.println("That number is a valid charge number.");
		}
		else {
			System.out.println("That is not a valid charge number.");
		}

		System.out.println("Now I'll print a list of numbers read from a file:");
		ChargeAccountValidation cav2 = new ChargeAccountValidation();
		cav2.validNumber();
	}	
}
