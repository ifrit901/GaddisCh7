package ch7java6thedition;
import javax.swing.JOptionPane;
/**
 * This tests the LotteryApplication class.
 * 
 * @author craig
 */
public class LotteryApplicationTest {
	public static void main(String[]args) {

		String number = "";
		int num = 0;
		int [] userArray = new int [5];
		LotteryApplication la = new LotteryApplication();

		// Here, the program is rigged to tell the winning numbers mwa ha
		for(int biscuits = 0; biscuits < 5; biscuits++) {
			System.out.print(la.getLotteryNumbers(biscuits) + " ");
		}

		JOptionPane.showMessageDialog(null, "\tPLAY THE LOTTERY!!\n"
		+ "Enter five numbers for a chance to win :D");

		for(int i = 0; i < 5; i++) {
			number = JOptionPane.showInputDialog(null, "Enter choice #"
				+ (i + 1) + ":");
			num = Integer.parseInt(number);
			userArray[i] = num;
		}
		
		
		la.setUserArray(userArray);
		la.results();
		System.out.println();


	}	
}
