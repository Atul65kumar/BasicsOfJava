package basicPrograms;

public class localGlobal_variables {
	static double pi = 3.14;
	int no_of_leap_year = 366;

	public static void main(String[] args) {
		pi=5;
		System.out.println(pi);
		localGlobal_variables l1 = new localGlobal_variables();
		l1.no_of_leap_year=90;  //update the Global variable by creating the object
		System.out.println(l1.no_of_leap_year);
	}

}
