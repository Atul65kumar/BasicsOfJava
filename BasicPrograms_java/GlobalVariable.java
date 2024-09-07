package basicPrograms;

public class GlobalVariable {
	static String name1 = "Activa";
	static String name2 = "Creta";
	static String name3 = "Auto";
	static int speed = 50;
	
	static void two_wheeler()
	{
		System.out.println(name1);
	}
	void three_wheeler()
	{
		System.out.println(name3);
	}
	void four_wheeler()
	{
		System.out.println(name2);
	}
	public static void main(String[] args) {
		two_wheeler();
		GlobalVariable g1 = new GlobalVariable();
		g1.four_wheeler();
		g1.three_wheeler();
	}
}
