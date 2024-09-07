package basicPrograms;

public class Static_Method {
	
	static void addition() {
		System.out.println("I am addition method");
	}
static void substraction() {
	System.out.println("I am substraction method");
}
static void multiply() {
	System.out.println("I am your multiply method");
}
	public static void main(String[] args) {
		System.out.println("I am your main method");
		substraction();
		multiply();
		addition();

	}

}
