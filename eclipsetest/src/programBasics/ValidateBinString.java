package programBasics;

import java.util.Scanner;

public class ValidateBinString {

	public static void main(String[] args) {
		String str;
		int strlen;
		char ch;
		boolean isValid;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a string");
		str=sc.next();
		strlen=str.length();
		
		isValid=true;
		for(int charidx=0;charidx<strlen;charidx++) {
			ch=str.charAt(charidx);
			if(!(ch=='0' || ch=='1')) {
				isValid=false;
				break;
			}
		}
		System.out.println(str + " is"+ (isValid?" ": "not")+"a binary string");
	}

}
