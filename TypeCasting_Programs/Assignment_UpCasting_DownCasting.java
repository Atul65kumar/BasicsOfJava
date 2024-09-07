package typecasting;
class Amazon
{
	static void jewellery()
	{
		System.out.println("This is jewellery method");
	}
	static void jeans()
	{
		System.out.println("This is jeans method");
	}
	void shirts()
	{
		System.out.println("This is shirts method");
	}
	void hoodie()
	{
		System.out.println("This is hoodie method");
	}
}

public class Assignment_UpCasting_DownCasting extends Amazon
{
	static void shoes()
	{
		System.out.println("This is shoes method");
	}
	static void slippers()
	{
		System.out.println("This is slippers method");
	}
	void trousers()
	{
		System.out.println("This is trousers method");
	}
	void glasses()
	{
		System.out.println("This is glasses method");
	}

	public static void main(String[] args) 
	{
		Amazon a1 = new Assignment_UpCasting_DownCasting(); //upcasting 
		
		System.out.println("This is Upcasting process");
		System.out.println("--------------------------");
		
		a1.hoodie();
		a1.shirts();
		a1.jeans();
		a1.jewellery();
		
		System.out.println("***************************");
		System.out.println("This is Downcasting process");
		System.out.println("---------------------------");
		
		Assignment_UpCasting_DownCasting d1 = (Assignment_UpCasting_DownCasting) a1; //downcasting 	
		
		d1.hoodie();
		d1.shirts();
		d1.jeans();
		d1.jewellery();
		d1.glasses();
		d1.trousers();
		d1.slippers();
		d1.shoes();
	}
}
