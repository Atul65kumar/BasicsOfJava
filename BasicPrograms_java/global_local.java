package basicPrograms;

public class global_local {
	int age; //0
	String name; //null
	double salary;// 0.0
	void student_details (int age, String name, double salary)
	{
		System.out.println("non static method");
	}
	public static void main(String[] args) {
		global_local n1 = new global_local();
		n1.student_details(25, "Atul", 87965.34);
		System.out.println(n1.salary);
		System.out.println(n1.age);
		System.out.println(n1.name);
	}
}
