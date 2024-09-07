package typecasting;
class Parent
{
	
}
public class ClassTypeCasting1 extends Parent 
{
	public static void main(String[] args) 
	{
		Parent p1 = new ClassTypeCasting1(); //upcasting
		//parent class properties
		
		Parent p2 = (Parent) new ClassTypeCasting1(); //upcasting
		//explicit manner upcasting
		
		
		ClassTypeCasting1 c1 = (ClassTypeCasting1) p1; //downcasting
		//explicitly
		//both parent and class properties	
	}
}
