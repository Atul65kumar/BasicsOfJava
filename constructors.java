package basicPrograms;

public class constructors {
	constructors(int a)
	{
		System.out.println(1234);
	}
	constructors()
	{
		System.out.println(56);
	}
	constructors(boolean b)
	{
		System.out.println(90);
	}
	constructors(String a, char d, boolean b)
	{
		System.out.println("Non Static method");
	}
	public static void main(String[] args) {
		new constructors();	
		new constructors(100);	
		new constructors(true);
		new constructors("A", 'D', true); 
	}
}

