package ch7java6thedition;
import java.util.Scanner;
/**
 * This is the ObjectArray program that uses the 
 * BankAccount class to create an array of 
 * BankAccount objects.
 * 
 * @author craig
 */
public class ObjectArray {
	public static void main(String [] args) { 
		// Variable
		final int NUM_ACCOUNTS = 3;

		// Create an array of BankAccount objects
		BankAccount [] accounts = new BankAccount[NUM_ACCOUNTS];
		
		// Create accounts to fill the array
		createAccounts(accounts);

		// Display the account data.
		System.out.println("The balances in the accounts is:");

		for(int i = 0; i < accounts.length; i++) {
			System.out.println("Account #" + (i + 1) +": $" + 
				accounts[i].getBalance());
		}
	}	

	/**
	 * The createAccounts method accepts an array
	 * argument and creates objects for each element.
	 */
	public static void createAccounts(BankAccount[]array) {
		double balance;		// To hold the balance

		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		for (int index = 0; index < array.length; index++) {
			// Get account balance from user
			System.out.println("Enter the balance for account #" 
			+ (index + 1));
			balance = input.nextDouble();

			// Create the account object
			array[index] = new BankAccount(balance);
		}
	}
}
