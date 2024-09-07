package basicPrograms;

public class Final_variable {
	final int leap_year = 366;
	
	static void leap_month()
	{
	final int month = 2;
	System.out.println(month);
	}
	public static void main(String[] args) 
	{
		leap_month();
		Final_variable f1 = new Final_variable();
		System.out.println(f1.leap_year);
	}
}
