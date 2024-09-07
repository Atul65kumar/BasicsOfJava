package Access_Modifier;

public class Outside_Package_With_SubClass1
{
	public static void method1()
	{
		System.out.println("This is public Access Specifier");
	}
	protected static void method2()
	{
		System.out.println("This is protected Access Specifier");
	}
	private static void method3() 
	{
		System.out.println("This is private Access Specifier");
	}
	static void method4()
	{
		System.out.println("This is package or Default Access Specifier");
	}
}
