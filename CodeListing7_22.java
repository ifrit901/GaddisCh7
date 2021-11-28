package ch7java6thedition;

/**
 * This demonstrates a variable argument (vararg) method
 * that accepts a variable array of object references.
 * 
 * @author craig
 */
public class CodeListing7_22 {
	public static void main(String [] args) {
		
		double total;	// To hold all the balances

		// Create a BankAccount object with $100
		BankAccount account1 = new BankAccount(100.0);

		// Create a BankAccount object with $500
		BankAccount account2 = new BankAccount(500.0);

		// Create a BankAccount object with $1500
		BankAccount account3 = new BankAccount(1500.0);

		// Call the method with one argument
		total = totalBalance(account1);
		System.out.println("Total = $" + total);

		// Call the method with two arguments
		total = totalBalance(account1, account2);
		System.out.println("Total = $" + total);

		// Call the method with three arguments
		total = totalBalance(account1, account2, account3);
		System.out.println("Total = $" + total);

	}	
	public static double totalBalance(BankAccount... bals) {
		double total = 0;	// Accumulator

		for(BankAccount accountObjects : bals) {
			total += accountObjects.getBalance();
		}

		return total;
	}
}
