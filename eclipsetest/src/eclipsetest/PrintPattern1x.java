package eclipsetest;

import java.util.Scanner;

public class PrintPattern1x {

	public static void main(String[] args) {
		int rowsize,colsize;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row size");
		rowsize=sc.nextInt();
		System.out.println("enter col size");
		colsize=sc.nextInt();
		
		for(int row=rowsize;row>=1;row--) {
			for(int col=colsize;col>=1;col--) {
				System.out.print(" " + row*col);
				
			}
			colsize--;
			System.out.println();
		}
		sc.close();
	}

}
