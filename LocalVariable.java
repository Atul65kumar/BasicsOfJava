package basicPrograms;

public class LocalVariable {
	
	void add()
	{
		System.out.println("This is additional method");
	}
	static void sub()
	{
		System.out.println("This is subtraction method");
	}
	void mul()
	{
		System.out.println("This is multiplication method");
	}

	public static void main(String[] args) {
		sub();
		LocalVariable v1 = new LocalVariable();
		v1.add();
		v1.mul();		
	}
}
