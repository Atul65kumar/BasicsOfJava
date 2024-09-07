package Blocks_In_Java;

public class SIB_Block {
	static
	{
		System.out.println("SIB Method 1"); //first SIB block will execute before Main method
	}
	static
	{
		System.out.println("SIB Method 2"); 
	}
	static
	{
		System.out.println("SIB Method 3"); 
	}
	static
	{
		System.out.println("SIB Method 4"); 
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
	}
}
