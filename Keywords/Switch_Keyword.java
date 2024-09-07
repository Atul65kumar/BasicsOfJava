package Keywords;

import java.util.Scanner;

public class Switch_Keyword {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Press 1 for Chrome Browser");
		System.out.println("Press 2 for Firefox Browser");	
		System.out.println("Press 3 for Edge Browser");
		int browser_selection = s1.nextInt();
		switch(browser_selection)
		{
		case 1: System.out.println("Launch the Chrome Browser");
		break;
		case 2: System.out.println("Launch the Firefox Browser");
		break;
		case 3: System.out.println("Launch the Edge Browser");
		break;
		default: System.out.println("Sorry!!, your selection is wrong");
		}
	}
}
