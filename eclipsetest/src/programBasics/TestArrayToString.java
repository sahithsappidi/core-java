package programBasics;

import java.util.Arrays;

public class TestArrayToString {

	public static void main(String[] args) {
		int[] a1= {2,3,4,5,6,7,8};
		int[] a2= {};
		double[] a3= new double[1];
		
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		System.out.println(Arrays.toString(a3));
		a3[0]= 3.14;
		System.out.println(Arrays.toString(a3));
		
	}

}
