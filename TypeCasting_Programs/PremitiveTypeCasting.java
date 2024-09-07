package typecasting;
public class PremitiveTypeCasting
{
	public static void main(String[] args) 
	{
		int a = 100;
		double b1 = a; //implicit widening
		System.out.println(b1);
		
		int b = 98;
		double b2 = (double)b; //explicit widening
		System.out.println(b2);
	}
}
