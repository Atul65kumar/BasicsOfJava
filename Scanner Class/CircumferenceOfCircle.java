package Scanner;

import java.util.Scanner;

public class CircumferenceOfCircle {
	final static double pi = 3.14;

	public static void main(String[] args) {
		System.out.println("Enter the value of r");
		Scanner s1 = new Scanner(System.in);
		double r = s1.nextDouble();
		double circumference = 2*pi*r;
		System.out.println("Circumference of circle is - "+circumference);
		s1.close();
	}

}
