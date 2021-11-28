package ch7java6thedition;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;

/**
 * This is programming challenge number 14.
 * 
 * I did not buy the book so I don't have access to the files that 
 * are supposed to go with these problems, so I've just been writing code 
 * that creates files to be used with the problems or just making .txt files
 * to be used with them. The file to be used with this program is USpopulation.txt.
 * The file should have single integer numbers on each line representing
 * the midyear average population of the US for the years 1950 - 1990.
 * 
 * Write a program that reads the file's contents into an array. The program
 * should display the following data:
 * 
 * - The average annual change in population during the time period
 * - The year with the greatest increase in population during the time period
 * - The year with the smallest increase in population during the time period
 * 
 * @author craig
 */
public class PopulationData {
	public static void main(String [] args) throws IOException{
		/*
		String inputFile = JOptionPane.showInputDialog(null, "Enter the name "
			+ "of the file to be read from (hint: its \"USpopulation.txt\"):");
		*/
		
		String inputFile = "USpopulation.txt";
		File myFile = new File(inputFile);
		Scanner reader = new Scanner(myFile);

		System.out.println("The program got this far");
		int fileLength = 0;

		
		System.out.println("This got processed too.");

		while(reader.hasNext()) {
			fileLength++;
			reader.nextLine();
		}

		int [] populations = new int [fileLength];


		reader = new Scanner(myFile);
		for(int i = 0; i < fileLength; i++) {
			populations[i] = reader.nextInt();
			reader.nextLine();
			System.out.println(populations[i]);
		}
		reader.close();

		// Find the average change in population growth
		int greatestChange = populations[1] - populations[0];
		int smallestChange = populations[1] - populations[0];
		int changes = 0;
		for(int i = 0; i < fileLength - 1; i++) {
			changes += populations[i + 1] - populations[i];
			if(populations[i + 1] - populations[i] > greatestChange) {
				greatestChange = populations[i + 1] - populations[i];
			}
			if(populations[i + 1] - populations[i] < smallestChange) {
				smallestChange = populations[i + 1] - populations[i];
			}
		}
		

		JOptionPane.showMessageDialog(null, "The average change in population"
			+ " growth per year is " + changes / fileLength);

		JOptionPane.showMessageDialog(null, "The greatest change in population"
			+ " between years is " + String.format("%,d", greatestChange));
		JOptionPane.showMessageDialog(null, "The smallest change in population"
			+ " between years is " + String.format("%,d", smallestChange));
	}	
}
