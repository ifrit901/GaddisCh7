package ch7java6thedition;

/**
 * This is a class to work with Code Listing 8.5 and 8.6.
 * 
 * @author craig
 * 1-26-21
 * 8:53am
 * 
 */
public class Rectangle {
	private double length;
	private double width;

	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public void setLength(double l) {
		length = l;
	}

	public void setWidth(double w) {
		width = w;
	}
}
