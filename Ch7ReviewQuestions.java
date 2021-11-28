package ch7java6thedition;

/**
 * These are the review questions for chapter 7.
 * 
 * @author craig
 */
public class Ch7ReviewQuestions {
	public static void main (String [] args) {
		/**
		 * 1. In an array declaration, this indicates the number of 
		 *    array elements that the array will have. 
		 * 
		 * Answer: b. Size declarator
		 * 
		 * 2. Each element of an array is accessed by a number known
		 *    as a(n) ________. 
		 * 
		 * Answer: a. subscript
		 * 
		 * 3. The first subscript in an array is always _______.
		 * 
		 * Answer: b. 0
		 * 
		 * 4. The last subscript in array is always ________.
		 * 
		 * Answer: d. One less than the number of elements
		 * 
		 * 5. Array bounds checking happens _________. 
		 * 
		 * Answer: c. When the program runs
		 * 
		 * 6. This array field holds the number of elements the
		 *    array has. 
		 * 
		 * Answer: c. length
		 * 
		 * 7. This search algorithm steps through an array, 
		 *    comparing each item with the search value.
		 * 
		 * Answer: b. sequential search
		 * 
		 * 8. This search algorithm repeatedly divides the 
		 *    portion of an array being searched in half. 
		 * 
		 * Answer: a. binary search
		 * 
		 * 9. This is the typical number of comparisons performed 
		 *    by the sequential search on an array of N elements
		 *    (assuming the search values are consistently found.)
		 * 
		 * Answer: d. N/2
		 * 
		 * 10. When initializing a 2 - dimensional array, you 
		 *     enclose each row's initialization list in _______.
		 * 
		 * Answer: a. braces
		 * 
		 * 11. To insert an item in a particular location in an 
		 *     ArrayList object, you use this method. 
		 * 
		 * Answer: c. add
		 * 
		 * 12. To delete an object from an ArrayList object, 
		 *     you use this method. 
		 * 
		 * Answer: remove
		 * 
		 * 13. To determine the number of items stored in an 
		 *     ArrayList object, you use this method. 
		 * 
		 * Answer: a. size
		 * 
		 * -------------------------------------------
		 * True or false 
		 * 
		 * 14. Java does not allow a statement to use a subscript
		 *     that is outside the range of valid subscripts for an
		 *     array. 
		 * 
		 * Answer:  T
		 * 
		 * 15. An array's size declarator can be a negative integer
		 *     expression. 
		 * 
		 * Answer: F
		 * 
		 * 16. Both of the following declarations are legal and equivalent:
		 *     int [] numbers;
		 *     int numbers []; 
		 * 
		 * Answer: F 
		 * 	They are equivalent but not equal. The difference is 
		 *  	only apparent when using the statement to initialize
		 * 	more than one variable in the array declaration.
		 * 
		 * 17. The subscript of the last element in a single-dimensional
		 *     array is one less than the total number of elements in 
		 *     the array. 
		 * 
		 * Answer: T
		 * 
		 * 18. The values in an initialization list are stored in the
		 *     array in the order that they appear in the list. 
		 * 
		 * Answer: T
		 * 
		 * 19. The Java compiler does not display an error message 
		 *     when it processes a statement that uses an invalid 
		 *     subscript. 
		 * 
		 * Answer: T
		 * 
		 * 20. When an array is passed to a method, the method has 
		 *     access to the original array. 
		 * 
		 * Answer: T
		 * 
		 * 21. The first size declarator in the declaration of a 
		 *     2-dimensional array represents the number of columns.
		 *     The second size declarator represents the number of rows. 
		 * 
		 * Answer: T
		 * 
		 * 22. A 2-dimensional array has multiple length fields.
		 * 
		 * Answer: T
		 * 
		 * 23. An ArrayList automatically expands in size to accommodate
		 *     the items stored in it. 
		 * 
		 * Answer: T
		 * 
		 * ------------------------------------------
		 * 
		 * Find the error
		 * 
		 * 1. int [] collection = new int [-20]; 
		 * 
		 * Answer: This array declaration uses an invalid subscript
		 * 	   size declarator and will throw an error at runtime.
		 * 
		 * 2. int [] hours = 8, 12, 16;
		 * 
		 * Answer: This array declaration attempts to initialize three
		 * 	   elements but fails to enclose them in curly brackets.
		 * 
		 * 3. int [] table = new int [10]; 
		 *	for(int x = 1; x <=10; x++) {                        >
		 * 		table [x] = 99;
		 *	} 
		 * 
		 * Answer: This for loop makes a "one off" error by attempting
		 * 	   to access an array subscript that is out of bounds.
		 * 	   This will throw an error at runtime.
		 * 
		 * 4. String [] names = {"George", "Susan"};
		 * 	int totalLength = 0; 
		 * 	for(int i = 0; i < names.length(); i++) {             >
		 * 		totalLength += names[i].length;
		 * 	}
		 * 
		 * Answer: In this example, names.length() is a method, 
		 * 	   it should just be names.length
		 * 
		 * 5. String [] words = {"Hello", "Goodbye"};
		 *    System.out.println(words.toUpperCase());
		 * 
		 * Answer: I don't know the proper terminology but 
		 * 	   words.toUpperCase() needs to reference a 
		 * 	   specific element in the words array like
		 * 	   words[0].toUpperCase(). 
		 * 
		 * -------------------------------------------------
		 * 
		 * Algorithm workbench
		 * 
		 * 1. The variable 'names' references an array with 20 
		 *    elements. Write a for loop that prints each element
		 *    in the array. 
		 * 
		 * Answer: for(int i = 0; i < names.length; i++) {            > 
		 *		System.out.println(names[i]); 
		 *	 }
		 *  
		 * 2. The variable names 'numberArray1' and 'numberArray2' 
		 *    reference arrays that each have 100 elements. Write 
		 *    code that copies the values in 'arrayNumber1' to 
		 *    'arrayNumber2'.
		 * 	
		 * Answer: for(int i = 0; i < numberArray1.length; i++) {      >
		 * 		numberArray2[i] = numberArray1[i];
		 *	   } 
		 * 
		 * 3. a. Write a statement that declares a String array 
		 * 	 initialized with the following Strings: "Einstein", 
		 * 	 "Newton", "Copernicus", "Copernicus", "Kepler".
		 * 
		 * 	 String [] names = {"Einstein", "Newton", "Copernicus", 
		 * 			   "Copernicus", "Kepler"}
		 * 
		 *    b. Write a loop that displays the contents of each element
		 *       in the array from 3a. 
		 * 	
		 * 	 for(int i = 0; i < names.length(); i++) {             >
		 * 	 	System.out.println(names[i]);
		 * 	 }
		 * 	
		 *    c. Write code that displays the total length of all the 
		 * 	 Strings in the array from 3a. 
		 * 
		 * 	int total = 0;
		 * 	for(int i = 0; i < names.length();i++) {	       >
		 *		total += names[i].length;  
		 *  	} 
		 * 	System.out.println("The total length of the Strings in "
		 * 			+ "the array is: " + total);
		 * 
		 * 4. In a program you need to store the populations of 12 
		 *    countries. 
		 *    a. Define two arrays that may be used in parallel to store
		 * 	 the names of the countries and their populations. 
		 * 
		 * 	String [] countries = new String [12];
		 * 	int [] population   = new int [12];
		 * 
		 *    b. Write a loop that uses these arrays to print the name
		 * 	 of each country and its population.
		 * 
		 *  	 for(int i = 0; i < countries.length(); i++)	       >
		 * 		System.out.println(
		 * 		"Name: " + countries[i] + " Population: " 
		 * 		+ population[i]); 		
		 * 	 }
		 * 
		 * 5. In a program you need to store the identification numbers
		 *    of 10 employees (as int values) and their weekly gross 
		 *    pay (as double values).
		 *    a. Define two arrays that may be used in parallel to store
		 *       the 10 employee identification numbers and their gross
		 * 	 pay amounts. 
		 * 
		 *    int [] ID = new int [10];
		 *    double [] pay = new double [10];
		 * 
		 *    b. Write a loop that uses these arrays to print each of 
		 * 	 the employee's ID number and weekly gross pay.
		 * 
		 * 	for(int i = 0; i < ID.length(); i++) { 		       >
		 * 		System.out.println("ID :" + ID[i] + " " 
		 * 		+ "Weekly gross pay: $" + pay[i]);
		 * 	}
		 * 
		 * 6. Declare a 2-dimensional int array named 'grades'. It should
		 *    have 30 rows and 10 columns.
		 * 
		 *    int [][] grades = new int [30][10];
		 * 
		 * 7. Write code that calculates the average of all the elements
		 *    in the 'grades' array spelled out in #6. 
		 * 
		 *    int total2 = 0;
		 *    for(int p = 0; p < twoDarray.length; p++) {              >
		 * 	  for(int i = 0; i < twoDarray[i].length; i++) {       >
		 *		total2 += twoDarray[p][i];
		 *	  }
		 *    }
		 *    System.out.println("The average of all the grades in the "
		 *	 		+ "2-dimensional array is " + total2);
		 *      
		 * 8. Look at the following array declaration:
		 *    
		 *    int [][] numberArray = new int[9][11]; 
		 * 
		 *    a. Write a statement that assigns 145 to the first column
		 * 	 of the first row of this array.
		 * 	
		 *       numberArray[0][0] = 145; 
		 * 
		 *    b. Write a statement that assigns 18 to the last column 
		 * 	 of the last row of this array.
		 * 
		 *       numberArray[9][11] = 18;
		 * 
		 * 9. The values variable references a two-dimensional double 
		 *    array with 10 rows and 20 columns. Write code that sums
		 *    all the elements in the array and stores the sum in the
		 *    variable total.
		 * 
		 *    int total = 0;
		 *    for(int p = 0; p < values.length; p++) {                 >
		 * 	  for(int i = 0; i < values[i].length; i++) {          >
		 *		total2 += values[p][i];
		 *	  }
		 *    }
		 *    System.out.println("The average of all the grades in the "
		 *	 		+ "2-dimensional array is " + total);
		 *    
		 * 10. An application uses a two-dimensional array declared as
		 *     follows: 
		 * 
		 *     int [][] days = new int[29][5]; 
		 * 
		 *     a. Write code that sums each row in the array and 
		 *        displays the results.
		 * 
		 *     for(int i = 0; i < days.length; i++) { 		       >
		 *	        int total = 0;
		 * 		for(int p = 0; p < days[i].length; p++) {      >
		 * 			total += days[i][p]	
		 *		} 
		 *      	System.out.println("The total for row " + i 
		 * 			+ " is " + );
		 *     }
		 * 
		 *     b. Write code that sums each column in the array and
		 * 	  displays the results.
		 * 
		 *     for(int i = 0; i < days[i].length; i++) {               >
		 *     		int total = 0;
		 * 		for(int p = 0; p < days.length; p++) {         >
		 * 			total += days[i][p];
		 * 		}	
		 * 		System.out.println("The total for column " 
		 * 			+ i + " is " + total);
		 *     }
		 * 
		 * 11. Write code that creates an ArrayList that can hold String
		 *     objects. Add the names of three cars to the ArrayList, 
		 *     and then display the contents of the ArrayList. 
		 * 
		 *     ArrayList
		 */
	}
}
