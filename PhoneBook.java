package ch7java6thedition;
import java.util.ArrayList;
/**
 * 17. Phone Book ArrayList
 * 
 * Write a class named PhoneBookEntry that has fields for a person's 
 * name and phone number. The class should have a constructor and 
 * appropriate accessor and mutator methods.Then write a program 
 * that creates at least 5 different PhoneBook objects and stores
 * them in an ArrayList. Use a loop to display all the objects in 
 * the ArrayList. 
 * 
 * @author craig
 * 1-21-21
 * 
 */
public class PhoneBook {
	private String name; 
	private String phoneNumber;

	public PhoneBook() {
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public String toString() {
		return String.format(getName() + "\t" + getPhoneNumber());

	}
}
