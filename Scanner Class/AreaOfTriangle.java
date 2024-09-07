package Scanner;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args)
	{
		System.out.println("Enter the value of Base");
		Scanner s1 = new Scanner(System.in);
		 double b = s1.nextDouble();
		 System.out.println("Enter the value of Height");
		 double h = s1.nextDouble();
		 double area = (b*h)/2;
		 System.out.println("Area of triange is --" + area);		
	}

}
