package ch7java6thedition;
import java.util.Scanner;
import java.io.*;
/**
 * This tests the NumberAnalysisClass class.
 * 
 * @author craig
 */
public class NumberAnalysisClassTest {
	public static void main(String [] args) throws IOException{
		String fileName;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a file name to get stats on the "
			+ "numbers it contains:");
		fileName = input.nextLine();
	
		//"/home/craig/NetBeansProjects/Ch7java6thEdition/Numbers.txt";

		NumberAnalysisClass nac = new NumberAnalysisClass(fileName);
		
		System.out.println("The highest value in the file is : "
			+ nac.getHighest());
		System.out.println("The lowest value in the file is : " 
			+ nac.getLowest());
		System.out.println("The average value in the file is : "
			+ nac.getAverage());
		System.out.println("The sum of all the values in the file is : " 
			+ nac.getTotal());

	}	
}
