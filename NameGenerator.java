package ch7java6thedition;
import java.io.*;

/**
 * This program generates a file of names to be used in 
 * programming challenge #13, Name Search.
 * 
 * @author craig
 */
public class NameGenerator {
	public static void main(String [] args) throws IOException{ 
		String [] names = {"James", "John", "Robert", "Micheal", "William",
		"David", "Richard", "Joseph", "Thomas", "Charles", "Christopher",
		"Daniel", "Matthew", "Anthony", "Donald", "Mark", "Paul", "Stephen", 
		"Andrew", "Kenneth", "Joshua", "Kevin", "Brian", "George", "Edward",
		"Ronald", "Timothy", "Jason", "Jeffery", "Ryan", "Jacob", "Gary", 
		"Nicholas", "Eric", "Johnny", "Larry", "Justin", "Scott", "Brandon",
		"Benjamin", "Samuel", "Frank", "Gregory", "Mary", "Patricia", "Karen",
		"Jennifer", "Linda", "Elizabeth", "Barbara", "Susan", "Jessica",
		"Sarah", "Nancy", "Lisa", "Margaret", "Betty", "Sandra", "Ashley",
		"Dorothy", "Kimberly", "Emily", "Donna", "Michelle", "Carol", "Amanda",
		"Melissa", "Deborah", "Stephanie", "Rebecca", "Laura", "Sharon", 
		"Cynthia", "Kathy", "Amy", "Shirley", "Angela", "Helen", "Anna",
		"Brenda", "Pam", "Nicole", "Samantha", "Katherine", "Emma", "Christine"};

		File myFile = new File("Names.txt");
		PrintWriter pw = new PrintWriter(myFile);

		for(String name : names) {
			pw.println(name);
		}

		pw.close();

	}	
}
