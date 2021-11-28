package ch7java6thedition;

/**
 * This is check point 7.9 - 7.12. 
 * 
 * @author craig
 */
public class CheckPoint7_9 {
	public static void main(String [] args) {
		/**
		 * 7.9 Look at the following statements:
		 * int [] numbers1 {1, 3, 6, 9};
		 * int [] numbers2 {2, 4, 6, 8};
		 * 
		 * Write a statement that multiplies element 0 of the numbers1
		 * array by element 3 of the numbers2 array and assigns the 
		 * result to a variable named 'result'.
		 * 
		 * Answer: 
		 * int result = numbers1[0] * numbers2[3];
		 * 
		 * 7.10 A program uses a variable named array that references 
		 * an array of integers. You do not know the number of elements
		 * in the array	Write a for loop that stores -1 in each element
		 * of the array. 
		 * 
		 * Answer: for(int val : array)
		 * 		{
		 * 			val = -1;
		 *		} 
		 * 
		 * 7.11 A program has the following declaration:
		 * 	double [] values
		 * Write code that asks the user for the size of the array 
		 * and then creates an array of the specified size, referenced 
		 * by the 'values' variable.
		 * 
		 * Answer:
		 * Scanner input = new Scanner(System.in);
		 * final int SIZE;
		 * System.out.println("Enter the size of the array:);
		 * SIZE = input.nextInt();
		 * int [] values = new int[SIZE];
		 * 
		 * 7.12 Look at the following statements:
		 * 	int [] a = {1, 2, 3, 4, 5, 6, 7}
		 * 	int [] b = new int[7];
		 * Write code that copies the 'a' array to the 'b' array.
		 * 
		 * Answer:
		 * for(int index = 0; i < 7; i++;)			>
		 * 	b[index] = a[index];
		 * 
		 */
	}	
}
