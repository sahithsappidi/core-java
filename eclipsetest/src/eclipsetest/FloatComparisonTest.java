package eclipsetest;

public class FloatComparisonTest {

	public static void main(String[] args) {
		double d1=2.3 + 4.3;
		double d2= 6.9;
		System.out.println(d1==d2);
		System.out.println(d1);
		final double EPSILON= 1e-7;
		System.out.println(Math.abs(d1-d2)< EPSILON);
	}

}
