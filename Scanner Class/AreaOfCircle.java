package Scanner;

import java.util.Scanner;

public class AreaOfCircle {
	
	final static double pi = 3.14;

	public static void main(String[] args) 
	{
	System.out.println("Enter the value of r");
	Scanner s1 = new Scanner(System.in);
	double r = s1.nextDouble();
	double area = pi*r*r;
	System.out.println("Area of circle is - "+area);
	s1.close();
	}

}
