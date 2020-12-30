package Oops;

public class DateTest {

	public static void main(String[] args) {
		Date d1=new Date(12,29,2020);
		System.out.println(d1);
		
		d1.setYear(2021);
		d1.setMonth(12);
		d1.setDay(02);
		
	System.out.println(d1);
	
	d1.setDate(2022,3,4);
	}

}
