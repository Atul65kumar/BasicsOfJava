package basicPrograms;

public class NonStatic_Method {
	void add()
	{
		System.out.println("This is additional method");
	}
	void sub()
	{
		System.out.println("This is subtraction method");
	}
	public static void main(String[] args) {
		NonStatic_Method n1 = new NonStatic_Method();
		n1.add();
		n1.sub();	
	}

}
