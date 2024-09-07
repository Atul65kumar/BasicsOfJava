package basicPrograms;

import java.util.Date;

public class Time_And_Date {

	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1.getTime());
		
		Date d2 = new Date(d1.getTime());
		System.out.println(d2);
		
		String time = d2.toString();
		String month = time.substring(4, 7);
		System.out.println(month);
		
		String date = time.substring(8, 10);
		System.out.println(date);
		
		String year = time.substring(24, 28);
		System.out.println(year);	
		
		String dateformat = date.concat("-").concat(month).concat("-").concat(year);
		System.out.println(dateformat);
	}
}
