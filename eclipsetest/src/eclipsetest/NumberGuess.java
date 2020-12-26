package eclipsetest;

import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
		int secretNumber;
		int numberIn;
		int trialNum=0;
		boolean done=false;
		Scanner sc=new Scanner(System.in);
		
		secretNumber=(int) (Math.random()*100);
		
		
		while(!done) {
			++trialNum;
			System.out.println("enter number bw 1 and 99");
			numberIn=sc.nextInt();
			if(numberIn==secretNumber) {
				System.out.println("right number");
				done=true;
			}else if(numberIn<secretNumber) {
				System.out.println("try higher number");
			}else {
				System.out.println("try lower");
			}
			
		}
		System.out.println("successful in "+ trialNum + " attempts");
	}

}
