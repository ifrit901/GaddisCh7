package ch7java6thedition;

/**
 * This is another BankAccount class to be used in 
 * this package. I'm going to try to duplicate it
 * without referencing the other one as much as 
 * possible. 
 * 
 * @author craig
 */
public class BankAccount {
	// Class field
	private double balance;	
	private double annualInterestRate;

	// No-argument constructor
	public BankAccount() {
		balance = 0.0;
	}

	// Argument constructor
	public BankAccount(double bal) {
		balance = bal;
	}
	
	// Methods
	public double getBalance() {
		return balance;
	}

	public void setBalance(double bal) {
		balance = bal;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double interest) {
		annualInterestRate = interest;
	}

	public void deposit(double dep) {
		balance += dep;
	}

	public void withdrawal(double sub) {
		balance -= sub;
	}

	public double calculateInterest() {
		return (annualInterestRate/12) * balance;	
	}
	/*
	I've written this much from memory, gonna check the 
	BankAccount class from chapter 6 now, to see how 
	close I got. 
	*/

	/*
	...
	*/

	/*
	Ok, so the BankAccount in chapter 6 has methods for 
	retrieving data in the form of strings, which I didn't
	include. For brevity, I'm not going to reproduce those 
	methods and just use the Scanner class. 
	*/
	
}
