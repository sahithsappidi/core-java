package Oops;

public class TimeExceptionTest {

	public static void main(String[] args) {
		TimeException t1;
		try {
			t1=new TimeException(second, minute, hour);
			System.out.println("valid input");
		}catch(IllegalArgumentException ex) {
			ex.printStackTrace();
			System.out.println("error in input");
			t1=new TimeException();
		}
		System.out.println("move on buddy");
	}

}
