package Scanner;

import java.util.Scanner;

public class Even_Odd_Number {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner s1 = new Scanner(System.in);
		int n = s1.nextInt();
		if(n%2 == 0)
		{
			System.out.println("Given number is Even");
		}
		else
		{
			System.out.println("Given number is odd");
		}
	}

}
