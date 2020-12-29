package programBasics;

import java.util.Scanner;

public class IncomeTaxCalculator {

	public static void main(String[] args) {
			int taxableIncome;
			double taxPayable = 0;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter the taxable income");
			taxableIncome= sc.nextInt();
			
			if(taxableIncome<20000) {
				taxPayable=0;
			}
			else if(taxableIncome>=20000 && taxableIncome<40000) {
				taxPayable=(taxableIncome-20000)*0.1;
			}else if(taxableIncome>=40000 && taxableIncome<60000) {
				taxPayable=(taxableIncome-20000)*0.2;
			}else if(taxableIncome>=60000 && taxableIncome<80000) {
				taxPayable=(taxableIncome-20000)*0.3;
			}
			
			System.out.println(taxPayable);
	}

}
