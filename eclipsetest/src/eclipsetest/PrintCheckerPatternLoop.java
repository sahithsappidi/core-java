package eclipsetest;

import java.util.Scanner;

public class PrintCheckerPatternLoop {

	public static void main(String[] args) {
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		size=sc.nextInt();
		
		for(int row=1;row<=size;row++) {
			for(int col=1;col<=size;col++){
				
				if(row%2==0) {
					
					System.out.print(" ");
				}
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}

}
