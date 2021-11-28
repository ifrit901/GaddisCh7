package ch7java6thedition;
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 * This program tests the PhoneBook class.
 * 
 * @author craig
 * 1-21-21
 * 
 */ 
public class PhoneBookTest {
	public static void main (String [] args) {
		String name;
		String phoneNumber;

		ArrayList<PhoneBook>phoneBook = new ArrayList<>();

		name = JOptionPane.showInputDialog(null, "Enter a person's name:");
		phoneNumber = JOptionPane.showInputDialog(null, "Enter that "
						+ "person's phone number:");
		PhoneBook pb1 = new PhoneBook();
		pb1.setName(name);
		pb1.setPhoneNumber(phoneNumber);

		name = JOptionPane.showInputDialog(null, "Enter a person's name:");
		phoneNumber = JOptionPane.showInputDialog(null, "Enter that "
						+ "person's phone number:");
		PhoneBook pb2 = new PhoneBook();
		pb2.setName(name);
		pb2.setPhoneNumber(phoneNumber);
	
		name = JOptionPane.showInputDialog(null, "Enter a person's name:");
		phoneNumber = JOptionPane.showInputDialog(null, "Enter that "
						+ "person's phone number:");
		PhoneBook pb3 = new PhoneBook();
		pb3.setName(name);
		pb3.setPhoneNumber(phoneNumber);

			
		name = JOptionPane.showInputDialog(null, "Enter a person's name:");
		phoneNumber = JOptionPane.showInputDialog(null, "Enter that "
						+ "person's phone number:");
		PhoneBook pb4 = new PhoneBook();
		pb4.setName(name);
		pb4.setPhoneNumber(phoneNumber);

		name = JOptionPane.showInputDialog(null, "Enter a person's name:");
		phoneNumber = JOptionPane.showInputDialog(null, "Enter that "
						+ "person's phone number:");
		PhoneBook pb5 = new PhoneBook();
		pb5.setName(name);
		pb5.setPhoneNumber(phoneNumber);

		phoneBook.add(pb1);
		phoneBook.add(pb2);
		phoneBook.add(pb3);
		phoneBook.add(pb4);
		phoneBook.add(pb5);

		System.out.println(phoneBook);
	}	
}
