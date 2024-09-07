package Loops;

public class Operators {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		if(a==10 || b==a) //c1=true, c2=false
		{
			System.out.println("This is OR operator");
		}
		if(a==10 && b==20) //c1=true, c2=true
		{
			System.out.println("This is AND operator");
		}
		if(!(a==10 && b==20)) //c1=true, c2=true
		{
			System.out.println("This is AND operator");
		}
	}

}
