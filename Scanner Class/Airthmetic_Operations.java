package Scanner;

import java.util.Scanner;

public class Airthmetic_Operations {

	public static void main(String[] args) {
		//addition of two values
		Scanner s1 = new Scanner(System.in);
			
			System.out.println("Enter the value of a");
			int a = s1.nextInt();
			
			System.out.println("Enter the value of b");
			int b = s1.nextInt();
			int sum = a+b;
			int sub = a-b;
			int mul = a*b;
			int div = a/b;
			int mod = a%b;
			System.out.println("Sun of two values - " +sum);
			System.out.println("Sun of two values - " +sub);
			System.out.println("Sun of two values - " +mul);
			System.out.println("Sun of two values - " +div);
			System.out.println("Sun of two values - " +mod);
	}

}
