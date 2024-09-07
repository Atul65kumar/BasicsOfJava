package Scanner;

import java.util.Scanner;

public class ScannerClass_prog {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		String a = s1.next();
		int b = s1.nextInt();
		byte c = s1.nextByte();
		boolean d = s1.nextBoolean();
		double e = s1.nextDouble();
		float f = s1.nextFloat();
		long g = s1.nextLong();
		s1.close();
		
	}

}
