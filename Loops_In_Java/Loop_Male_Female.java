package Loops;

public class Loop_Male_Female {

	public static void main(String[] args) {
		int age = 12;
		char gender = 'F';
		if (gender == 'F')
		{
			System.out.println("Travelling is free for females");
		} 
		else 
		{
			if (gender == 'F' && age <= 12) 
			{
				System.out.println("Ticket price will be half");
			}
			else if (gender == 'F' && age <= 59)
			{
				System.out.println("Ticket price will be full");
			} else if (gender == 'M' && age >= 60)
			{
				System.out.println("They are senior citizens");
			}
			else 
			{
				System.out.println("Invalid Gender");
			}
		}
	}
}
