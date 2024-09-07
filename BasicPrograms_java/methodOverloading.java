package basicPrograms;

public class methodOverloading {
	
	static void add(int a)
	{
		System.out.println(1234);
	}
	static void add()
	{
		System.out.println(56);
	}
	static void add(boolean b)
	{
		System.out.println(90);
	}
	void add(String a, char d, boolean b)
	{
		System.out.println("Non Static method");
	}
	public static void main(String[] args) {
		add();
		add(100);
		add(true);
		methodOverloading m1 = new methodOverloading();
		m1.add("Atul", 'A', true);	
	}
 
}
