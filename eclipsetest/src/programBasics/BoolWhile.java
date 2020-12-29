package programBasics;

import java.util.Scanner;

public class BoolWhile {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		boolean isValid;
		int number=in.nextInt();
		do {
			if(number>=1 && number<=10) {
				isValid=true;
			}
			else {
				isValid=false;
			}
		}
		while(!isValid);
		System.out.println(number);
		//in.close();
	}
	

}
