package Scanner;

import java.util.Scanner;

public class CircumferenceOfRectangle {

	public static void main(String[] args) {
		System.out.println("Enter the value of Length");
		Scanner s1 = new Scanner(System.in);
		 double l = s1.nextDouble();
		 System.out.println("Enter the value of Breadth");
		 double b = s1.nextDouble();
		 double circumference = 2*(l+b);
		 System.out.println("Circumference of rectange is --" + circumference);
	}

}
