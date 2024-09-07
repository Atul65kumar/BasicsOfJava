package Keywords;

import java.util.Scanner;

public class Switch_Assignemnt {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Press a for Atul");
		System.out.println("Press b for Rohit");
		 String name = s.next();
		 switch(name)
		 {
		 case "a": System.out.println("Name is Atul");
		 break;
		 case "b": System.out.println("Name is Rohit");
		 break;
		 default: System.out.println("Name is Sandeep");
		 }	
	}
}
