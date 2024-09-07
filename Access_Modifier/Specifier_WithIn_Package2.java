package Access_Modifier;

public class Specifier_WithIn_Package2 {

	public static void main(String[] args) {
		Specifier_WithIn_Package1 s = new Specifier_WithIn_Package1();
		s.method1();
		s.method2();
		s.method4();
		//s.method3(); //can not access the private access specifier under package
	}
}
