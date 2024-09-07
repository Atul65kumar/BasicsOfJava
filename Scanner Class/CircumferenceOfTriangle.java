package Scanner;

import java.util.Scanner;

public class CircumferenceOfTriangle {

	public static void main(String[] args) {
		System.out.println("Enter the value of Base");
		Scanner s1 = new Scanner(System.in);
		 double b = s1.nextDouble();
		 System.out.println("Enter the value of Height");
		 double h = s1.nextDouble();
		 System.out.println("Enter the value of length");
		 double l = s1.nextDouble();
		 double circumference = b+h+l;
		 System.out.println("Circumference of triange is --" + circumference);
	}

}
