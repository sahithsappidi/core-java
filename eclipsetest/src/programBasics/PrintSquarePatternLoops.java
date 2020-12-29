package programBasics;

import java.util.Scanner;

public class PrintSquarePatternLoops {

	public static void main(String[] args) {
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		size=sc.nextInt();
		
		for(int row=1;row<=size;row++) {
			for(int col=1;col<=size;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}

}
