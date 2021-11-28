package ch7java6thedition;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;  
import java.io.*;
/**
 * This is programming challenge #15. 
 * It reads a text file into a String array and then 
 * counts the number of instances a team name appears 
 * in the array.
 * 
 * @author craig
 */
public class WorldSeriesWinners {
	public static void main(String [] args) throws IOException{
		String fileName;

		fileName = JOptionPane.showInputDialog(null, "Enter the name of the"
			+ " file with the World Series winners in it:");


		File myFile = new File(fileName);
		Scanner fileReader = new Scanner(myFile);

		ArrayList<String> winnerList = new ArrayList<>();	

		fileReader = new Scanner(myFile);
		while(fileReader.hasNextLine()) {
			winnerList.add(fileReader.nextLine());
		} 

		System.out.println(winnerList.get(0));
		String teamName = JOptionPane.showInputDialog(null, "Enter the name of a "
			+ "team and I'll tell you how many \ntimes they won the world series"
			+ " in the past 50 years:");

		int winTotal = 0;
		for(int i = 0; i < winnerList.size(); i++) {
			if(winnerList.get(i).equals(teamName)) {
				winTotal++;
			}	
		}
		
		JOptionPane.showMessageDialog(null, "The " + teamName + " won the "
			+ "World Series " + winTotal + " times.");
	}	
	
}
