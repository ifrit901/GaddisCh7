package ch7java6thedition;

/**
 * This is the answers to checkpoint 7.18 - 7.22.
 * 
 * @author craig
 */
public class Checkpoint7_18 {
	public static void main(String [] args) {
		/**
		 * 7.18 What value in an array does the selection sort 
		 * 	look for first?
		 * 
		 * Answer: The selection sort first locates the smallest
		 *  	   value. When the sort finds this value, it 
		 * 	   moves it to the beginning of the array. 
		 * 
		 * 7.19 How many times will the selection sort swap the 
		 * 	smallest value in an array with another value?
		 * 
		 * Answer: The selection sort will swap the smallest value
		 * 	   in an array with another value for as long as 
		 * 	   there continue to be smaller values found or 
		 * 	   until the end of the array is reached. 
		 * 
		 * 7.20 Describe the difference between the sequential 
		 *  	search and the binary search.
		 * 
		 * Answer: The sequential search just runs through the 
		 * 	   array from start till the value searched for
		 *  	   is found. If the value is at the end of the 
		 * 	   array, it will have to search the entire array
		 * 	   before stopping. The binary search is much faster,
		 * 	   it moves to the middle of the array and tests 
		 * 	   whether the target value is greater or lesser
		 * 	   than the value at the midpoint. It continues 
		 * 	   halving the array in the search for the target
		 * 	   value and thus finds the value much faster than
		 * 	   the sequential search. The catch is that the 
		 * 	   binary search can only operate on an array 
		 * 	   that has already been sorted from least to 
		 * 	   greatest or in some other sequential order.
		 * 
		 * 7.21 On average, with an array of 20,000 elements, how 
		 * 	many comparisons will the sequential search perform?
		 * 	(Assume the items being searched for will be 
		 * 	consistently found in the array.)
		 * 
		 * Answer: On average, for an array of N(number of) elements, 
		 * 	   the sequential search will find the target item
		 * 	   in N/2 attempts. If the array has 20,000 elements,
		 * 	   the sequential search will find the target value
		 * 	   in 10,000 attempts typically. 
		 * 
		 * 7.22 If a sequential search is performed on an array, 
		 * 	and it is known that some items are searched for 
		 * 	more frequently than others, how can the contents
		 * 	of the array be reordered to improve the average
		 * 	performance of the search?
		 * 
		 * Answer: The items that are searched for more frequently
		 * 	   should be placed near the beginning of the array.
		 * 	   This way the search will find them faster since
		 * 	   it must start at the beginning and work its way
		 * 	   through. 
		 * 	 
		 */
	}	
}
