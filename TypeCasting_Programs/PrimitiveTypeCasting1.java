package typecasting;

public class PrimitiveTypeCasting1 {

	public static void main(String[] args) {
		int a = (int) 65.56;
		System.out.println(a); //narrowing
			
		double wt = 88.8;
		int wt1 =  (int) wt;
		System.out.println(wt1); //narrowing
	}

}
