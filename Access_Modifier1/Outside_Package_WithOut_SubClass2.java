package Access_Modifier1;

import Access_Modifier.Outside_Package_WithOut_SubClass1;

public class Outside_Package_WithOut_SubClass2 {

	public static void main(String[] args) 
	{
		Outside_Package_WithOut_SubClass1 s1 = new Outside_Package_WithOut_SubClass1();
		s1.method1();
		//s1.method2(); //Method 2 is protected so not able to access
		//s1.method3(); //Method 3 is private so not able to access
		//s1.method4(); //Method 4 is default so not able to access
	}

}
