package Access_Modifier;

public class Specifier_WithIn_Class 
{
	public static void add()
	{
		System.out.println("This is public access Specifier");
	}
	protected static void sub()
	{
		System.out.println("This is protected access Specifier");
	}
	static void mul()
	{
		System.out.println("This is package/Default access Specifier");
	}
	private static void div()
	{
		System.out.println("This is private access Specifier");
	}

	public static void main(String[] args)
	{
		add();
		sub();
		mul();
		div();
	}
}
