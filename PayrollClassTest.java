package ch7java6thedition;
import java.util.Scanner;
/**
 * This program tests the PayrollClass' methods by 
 * asking the user to enter information about seven 
 * employees.
 * 
 * The list of acceptable employee numbers is:
 * 
 * 5658845 4520125 7895122 8777541
 * 8451277 1302850 7580489
 * 
 * @author craig
 */
public class PayrollClassTest {
	public static void main(String[]args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Create a PayrollClass object
		PayrollClass pc = new PayrollClass();

		// Engage the user and let them know what's going on...
		System.out.println("This program associates employees' id,"
			+ " hours and wages. \nI'll need you to enter their"
			+ " hours and wages.\n\n");

		// Loop through the employees by number for data entry
		for(int i = 0; i < pc.getEmployeeIdLength(); i++) {
			int hours;
			double pay;
			System.out.println("Enter the hours and pay rate for "
				+ "employee #" + pc.getEmployeeId(i) + ".\n"
				+ "Hours: ");
			hours = input.nextInt();

			// Validate input
			while(hours < 0) {
				System.out.println("Please enter a positive number "
					+ "of hours.\n"
					+ "How many hours did the employee work?");
				hours = input.nextInt();
				pc.setHours(pc.getEmployeeId(i), hours);
			}
			pc.setHours(pc.getEmployeeId(i), hours);
			
			System.out.println("Pay Rate: ");
			pay = input.nextDouble();

			// Validate input 
			while(pay < 6.00) {
				System.out.println("Please enter a pay rate "
					+ "greater than $6. \n"
					+ "What is the employee's pay rate?");
				pay = input.nextDouble();
			}
			pc.setPayRate(pc.getEmployeeId(i), pay);
			pc.setWages(pc.getEmployeeId(i), pc.getHours(i), pc.getPayRate(i));
		}

		// Thank the user for all that work
		System.out.println("Thank you! You can now access each "
			+ "employee's total wages \nby entering their "
			+ "number. Would you like to try? Enter y or n:");
		input.nextLine();
		String answer = input.nextLine();
		while(answer.equals("y") || answer.equals("Y")) {
			int id;
			System.out.println("Enter the employee number:");
			id = input.nextInt();

			// Validate employee number
			while(!pc.employeeExists(id)) {
				System.out.println("Please enter a valid "
					+ "employee number:");
				id = input.nextInt();
			}				
			System.out.println("Employee #" + id
				+ " earned $" 
				+ String.format("%,.2f", pc.returnWages(id)));

			System.out.println("Would you like to find the "
				+ "wages of another employee?");
			input.nextLine();
			answer = input.nextLine();
		}
		System.out.println("Thanks for using this program :)");
	}
}	

