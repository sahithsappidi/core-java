package eclipsetest;

public class RelationalLogicalOpTest {

	public static void main(String[] args) {
			int age=26;
			double weight=82;
			int height=177;
			boolean married=false;
			boolean attached=false;
			char gender='m';
			
			System.out.println(!married && !attached && (gender=='m'));
			System.out.println(married && (gender=='f'));
			System.out.println(height>= 178 && weight>=75 && weight<=90);
			System.out.println(height>=175 && weight<=90);
	}

}
