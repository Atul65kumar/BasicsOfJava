package Access_Modifier;

public class Specifier_WithIn_Package1 {
	public static void method1()
	{
		System.out.println("This is public Access Specifier");
	}
	protected static void method2()
	{
		System.out.println("This is protected Access Specifier");
	}
	private static void method3() //this is private so not access the private in package
	{
		System.out.println("This is private Access Specifier");
	}
	static void method4()
	{
		System.out.println("This is package or Default Access Specifier");
	}
}
