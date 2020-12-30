package Oops;

public class TimeTest {

	public static void main(String[] args) {
		Time t1=new Time(1,2,3);
		System.out.println(t1);
		Time t2=new Time();
		System.out.println(t2);
		
		t1.setHour(5);
		t1.setMinute(45);
		t1.setSecond(21);
		System.out.println(t1);
		
		t1.setTime(21,34,11);
		System.out.println(t1);
		
		System.out.println(t1.nextSecond());
		
	}

}
