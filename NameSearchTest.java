package ch7java6thedition;
import java.io.*;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 * This is problem #13 in the programming challenges chapter 7.
 * 
 * @author craig
 */
public class NameSearchTest {
	public static void main(String [] args) throws IOException{
		boolean inTheList = false;
		String userInput = JOptionPane.showInputDialog(null, 
			"Enter the name of the file with all the names in it:");

		File myFile = new File(userInput);

		Scanner inputFile = new Scanner(myFile);

		String userName = JOptionPane.showInputDialog(null, "Enter a name "
			+ "and I'll see if it's in the list of popular names:");

		while(inputFile.hasNext()) {
			if(inputFile.nextLine().equalsIgnoreCase(userName))
				inTheList = true;
		}

		inputFile.close();

		if(inTheList) {
			JOptionPane.showMessageDialog(null, "Yes! " 
			+ userName + " is in the list of popular names :D");
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry, " 
			+ userName + " isn't in the list of popular names..."); 
		}
	}	
}
