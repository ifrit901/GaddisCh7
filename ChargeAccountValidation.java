package ch7java6thedition;
import java.util.Scanner;
import java.io.*;
/**
 * This is programming challenge #3 from chapter 7.
 *  
 * 3. Charge Account Validation
 * Create a class with a method that accepts a charge account number as its
 * argument. The method should determine if the number is valid by comparing
 * it to the following list of valid charge account numbers: 
 * 
 * 5658845 4520125 7895122 8777541 8451277 1302850
 * 8080152 4562555 5552012 5050522 7825877 1250255
 * 1005231 6545231 3852085 7576651 7881200 4581002
 * 
 * These numbers should be stored in an array or an ArrayList object. Use a 
 * sequential search to locate the number passed as an argument. If the number
 * is in the array, the method should return true, indicating the number is 
 * valid. If the number is not in the array, the method should return false, 
 * indicating the number is invalid. 
 * 
 * Write a program that tests the class by asking the user to enter a charge 
 * account number. The program should display a message indicating whether 
 * the number is valid or invalid. 
 * 
 * 4. 
 * @author craig
 */
public class ChargeAccountValidation {
	// Instance fields
	private int [] accountNumbers = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850,
 					 8080152, 4562555, 5552012, 5050522, 7825877, 1250255,
  					 1005231, 6545231, 3852085, 7576651, 7881200, 4581002};

	private int accountNumber;

	public ChargeAccountValidation() {

	}

	// Getters 
	public int getAccountNumber() {
		return accountNumber;
	}
	
	// Setters
	public void setAccountNumber(int num) {
		accountNumber = num;
	}
	
	// Validation method
	public boolean numberValidator(int num) {
		boolean isValid = false;
		for(int i = 0; i < accountNumbers.length; i++) {
			if(num == accountNumbers[i]) {
				isValid = true;
			}
		}
		return isValid;
	}

	public void validNumber() throws IOException {
		
		boolean isValid = false; 
		File numberFile = 
new File("/home/craig/NetBeansProjects/Ch7java6thEdition/src/ch7java6thedition/account_numbers.txt");
		Scanner input = new Scanner(numberFile);

		while(input.hasNext()) {
			int accountNumber = input.nextInt();
			System.out.println(accountNumber);
		}		

		input.close();
	}


}
