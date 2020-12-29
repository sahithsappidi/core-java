package programBasics;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String str;
		int strlen;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter string");
		str=sc.next();
		strlen=str.length();
		
		System.out.println("reverse string is:");
		
		for(int index=strlen-1;index>=0;index--) {
			System.out.print(str.charAt(index));
		}
		System.out.println();
		sc.close();
	}

}
