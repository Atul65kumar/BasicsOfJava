package Scanner;

import java.util.Scanner;

public class AreaOfTrapezium {

	public static void main(String[] args) {
		System.out.println("Enter the value of Length");
		Scanner s1 = new Scanner(System.in);
		 double l = s1.nextDouble();
		 System.out.println("Enter the value of Breadth");
		 double b = s1.nextDouble();
		 System.out.println("Enter the value of Height");
		 double h = s1.nextDouble();
		 double area = ((l+b)*h)/2;
		 System.out.println("Area of Trapezium is --" + area);
	}

}
