package ch7java6thedition;

/**
 * Write a payroll class that uses the following arrays as fields:
 * 
 * - employeeId. An array of seven integers to hold employee 
 *   identification numbers. The array should be initialized
 *   with the following numbers:
 * 
 *   5658845 4520125 7895122 8777541
 *   8451277 1302850 7580489
 * 
 * - hours. An array of seven integers to hold the number of hours
 *   worked by each employee.
 * - payRate. An array of seven doubles to hold each employee's 
 *   hourly pay rate. 
 * - wages. An array of seven doubles to hold each employee's 
 *   gross wages. 
 * 
 * The class should relate the data in each array through the subscripts. 
 * For example, the number in element 0 of the 'hours' array should be 
 * the hours worked by the employee whose identification number should 
 * be stored in element 0 of the 'employeeId' array. That same employee's
 * pay rate should be stored in element 0 of the 'payRate' array. 
 * 
 * In addition to the appropriate accessor and mutator methods, the class 
 * should have a method that accepts an employee's identification number
 * as an argument and returns the gross pay for that employee. 
 * 
 * Demonstrate the class in a complete program that displays each employee
 * number and asks the user to enter that employee's hours and pay rate. 
 * It should then display each employee's identification number and 
 * gross wages. 
 * 
 * 
 * @author craig
 */
public class PayrollClass {
	// Instance fields
	final private int [] employeeId = 
	{5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489},
			          hours = new int [7];
	private double [] payRate = new double [7];
	private double []   wages = new double [7];

	// No-arg constructor
	public PayrollClass() {

	}

	// Getters
	public boolean employeeExists(int num) {
		boolean employee = false;
		for(int i = 0; i < employeeId.length; i++) {
			if(num == employeeId[i]) 
				employee = true;		
		}	
		return employee;
	}

	public int getEmployeeId(int num) {
		return employeeId[num];
	}

	public int getEmployeeIdLength() {
		return employeeId.length;
	}
	
	public int getHours(int num) {
		return hours[num];
	}

	public double getPayRate(int num) {
		return payRate[num];
	}

	public double getWages(int num) {
		return wages[num];
	}
	
	// Setters
	public void setHours(int num, int time) {
		for(int i = 0; i < employeeId.length; i++) {
			if(num == employeeId[i]) {
				hours[i]= time;
			}
		}
	}

	public void setPayRate(int num, double pay) {
		for(int i = 0; i < employeeId.length; i++) {
			if(num == employeeId[i]) {
				payRate[i] = pay;
			}
		}
	}

	public void setWages(int num, int time, double pay) {
		for(int i = 0; i < employeeId.length; i++) {
			if(num == employeeId[i]) {
				wages[i] = time * pay;
			}
		}
	}

	// Search method to locate and return the employee's gross wages
	public double returnWages(int num) {
		int employee = -1;
		for(int i = 0; i < employeeId.length; i++) {
			if(num == employeeId[i]) {
				employee = i;
				break;
			}
		}
		return wages[employee];
	}
}
