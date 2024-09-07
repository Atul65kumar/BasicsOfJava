package Keywords;

public class Assert_Keyword {

	public static void main(String[] args) 
	{
		/* int i = 10;
		assert i==11;
		System.out.println(i+100); */
		
		/* int a=10;
		assert a>5;
		System.out.println(a+100); */
		
		int a = 10;
		String b = "Atul";
		//assert b.length() == 4; expected result is same as actual then it will execute
		//assert b.equals("atul"); //expected result is not same as actual then it will not execute
		assert a==10: ("Sorry, Condition is wrong");
		
		System.out.println(a+100);	
	}

}
