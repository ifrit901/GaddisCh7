package ch7java6thedition;

/**
 * This demonstrates the operating system arguments
 * passed to the main method of a Java program.
 * 
 * @author craig
 */
public class CommandLineArgs {
	public static void main(String [] args)	{
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
