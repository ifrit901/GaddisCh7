package ch7java6thedition;

/**
 * This program prints out the entire 
 * "99 bottles of beer on the wall" song.
 * 
 * @author craig
 */
public class Bottles_of_Beer_song {
	public static void main(String [] args) {

		for (int index = 99; index >= 1; index--) {
			System.out.println(index + " bottles of beer on the wall\n" +
					   index + " bottles of beer on the wall\n" +
					   "Take one down, pass it around\n" +
					   (index - 1) + " bottles of beer on the wall!\n\n");
		}
	}
	
}
