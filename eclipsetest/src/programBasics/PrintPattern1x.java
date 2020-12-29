package programBasics;

import java.util.Scanner;

public class PrintPattern1x {

	public static void main(String[] args) {
		int rowsize,colsize;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row size");
		rowsize=sc.nextInt();
		System.out.println("enter col size");
		colsize=sc.nextInt();
		int num=1;
		
		for(int row=1;row<=rowsize;row++) {
			for(int col=1;col<=row;col++) {
				//num=num+1;
				System.out.print(" ");
				
			}
			row=rowsize-1;
			//num++;
			//colsize--;
			System.out.println();
		}
		sc.close();
	}

}
