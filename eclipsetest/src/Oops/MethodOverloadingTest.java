package Oops;

public class MethodOverloadingTest {
	public static int average(int n1, int n2) {
		return (n1+n2)/2;
	}
	public static double average(double d1,double d2) {
		return (d1+d2)/2.0;
	}
	public static void main(String[] args) {
		System.out.println(average(4,9));
		System.out.println(average(4.0,9.0));
		System.out.println(average(4,9.0));
	}

}
