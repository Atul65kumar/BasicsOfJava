package Keywords;

public class This_keyword {
		int age; // default value is 0
		String name; // default value is null
		double salary; //default value is 0.0
		
		void details(int age, String name, double salary) 
		{
			this.age = age; //this.global variable = local variable
			this.name = name;
			this.salary = salary;
		}
		public static void main(String[] args) 
		{
			This_keyword k1 = new This_keyword();
			k1.details(27, "Atul Kumar", 45000.56);
			System.out.println(k1.age);
			System.out.println(k1.name);
			System.out.println(k1.salary);
		}
	}
