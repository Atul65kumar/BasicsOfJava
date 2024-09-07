package Access_Modifier1;

import Access_Modifier.Outside_Package_With_SubClass1;

public class Outside_Package_With_SubClass2 extends Outside_Package_With_SubClass1
{

	public static void main(String[] args)
	{
		Outside_Package_With_SubClass2 c1 = new Outside_Package_With_SubClass2();
		c1.method1();
		c1.method2();
		//c1.method3(); //Method 3 is private so not able to access
		//c1.method4(); //Method 4 is default so not able to access
	}

}
