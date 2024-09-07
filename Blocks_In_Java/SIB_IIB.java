package Blocks_In_Java;

public class SIB_IIB 
{
	static //SIB
	{
		System.out.println("SIB Block");
	}
	SIB_IIB() //Constructor
	{
		System.out.println("Constructor");
	}
	{ //IIB
		System.out.println("IIB Block");
	}
	public static void main(String[] args)
	{
	System.out.println("Main Method");
	new SIB_IIB(); //need to create an object to call IIB and Constructor
	new SIB_IIB();
	
	}
}
