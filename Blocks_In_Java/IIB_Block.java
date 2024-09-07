package Blocks_In_Java;

public class IIB_Block {
	{ //IIB block
		System.out.println("IIB Block");
	}
	static //SIB block 
	{
		System.out.println("SIB method");
	}

	/*public static void main(String[] args) 
	{
		System.out.println("Main method");
		
		new IIB_Block();  //after call the object, IIB block will be execute
	} */
	public static void main(String[] args) 
	{
		new IIB_Block();  //after call the object, IIB block will be execute
		System.out.println("Main method");
	}
}
