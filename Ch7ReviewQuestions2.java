package ch7java6thedition;

/**
 * These are the Ch 7 review questions starting at the 
 * Short Answer section.
 * 
 * @author craig
 */
public class Ch7ReviewQuestions2 {
	public static void main (String[] args) {
		/**
		 * Short Answer
		 * 
		 * 1. What is the difference between a size declarator 
		 *    and a subscript?
		 * 
		 * Answer: A size declarator occurs in an array declaration
		 * 	   and pre-sets the number of elements in the array.
		 * 	   A subscript occurs after the creation of an array
		 * 	   when an element of the array is being accessed. 
		 * 	   They are both numbers which occur in square brackets,
		 * 	   so its understandable that they could be confused.
		 * 
		 * 2. Look at the following array definition:
		 *    
		 *    int [] values = new int [10];
		 * 
		 *    a. How many elements does the array have?
		 *       10
		 * 
		 *    b. What is the subscript of the first element in the array?
		 *       [0]
		 * 
		 *    c. What is the subscript of the last element in the array?
		 *       [9]
		 * 
		 * 3. Look at the following array definition:
		 * 
		 *    int [] values = {4, 7, 6, 8, 2};
		 * 
		 *    What does each of the following code segments display?
		 * 
		 *    a. System.out.println(values[4]);
		 * 	 2
		 * 
		 *    b. x = values[2] + values[3];
		 *	 System.out.println(x);
		 * 	 14
		 * 
		 *    c. x = ++values[1];
		 * 	 System.out.println(x);
		 *	 8
		 * 
		 * 4. How do you define an array without providing a size 
		 *    declarator?
		 * 
		 *    Just don't put a number in the square brackets when 
		 *    declaring it. 
		 * 
		 * 5. Assuming that array1 and array2 are both array reference
		 *    variables, why is it not possible to assign the contents
		 *    of the array referenced by array2 to the array referenced
		 *    by array1 with the following statement?
		 * 
		 *    array1 = array2;
		 * 
		 *    A reference variable for an array is just a memory address.
		 *    That statement will copy the address of array2 to array1
		 *    and just make two variables that reference the same array. 
		 * 
		 * 6. How do you establish an array without providing a size
		 *    declarator?
		 * 
		 *    Isn't this the same as question 4?
		 * 
		 * 7. The following statement creates a BankAccount array: 
		 * 
		 *    BankAccount [] acc = new BankAccount[10]; 
		 * 
		 *    Is it ok or not ok to execute the following statements?
		 * 
		 *    acc[0].setBalance(5000.0);
		 *    acc[0].withdraw(100.0);
		 * 
		 *    Yes, its ok to do this and it will leave the BankAccount 
		 *    object at subscript [0] with $4,900.
		 * 
		 * 8. If a sequential search method is searching for a value 
		 *    that is stored in the last element of a 10,000 element 
		 *    array, how many elements will the search code have to 
		 *    read to locate the value? 
		 * 
		 *    All 10,000 elements.
		 * 
		 * 9. Look at the following array definition:
		 *    
		 *    double [][] sales = new double [8][10];
		 * 
		 *    a. How many rows does the array have?
		 *       8
		 * 
		 *    b. How many columns does the array have?
		 *       10
		 * 
		 *    c. How many elements does the array have?
		 *       80
		 * 
		 *    d. Write a statement that stores a number in the last 
		 *       column of the last row of the array. 
		 * 
		 *       sales[7][9] = 79;
		 * 
		 * 
		 * Programming Challenges will be answered in separate files.    
		 * 
		 */
	}	
}
