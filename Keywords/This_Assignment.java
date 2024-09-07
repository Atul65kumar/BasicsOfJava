package Keywords;

public class This_Assignment {
	String name;
	int legs;
	double bones;
	
	void Dog(String name, int legs, double bones)
	{
		this.name = name;
		this.bones = bones;
		this.legs = legs;
	}

	public static void main(String[] args) {
		This_Assignment t = new This_Assignment();
		t.Dog("Bruno", 04, 152.0);
		System.out.println("No. of bones --" + t.bones);
		System.out.println("No. of legs --" + t.legs);
		System.out.println("Name of the Dog --" + t.name);

	}
}
