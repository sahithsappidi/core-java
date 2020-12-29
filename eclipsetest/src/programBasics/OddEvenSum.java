package programBasics;

public class OddEvenSum {
	
	public static void main(String[] args) {
		
		int low=1;
		int upper=1000;
		int oddSum=0;
		int evenSum=0;
		int num=low;
		int absDiff;
		while(num<=upper)
		{
			if(num%2==0) {
				evenSum+=num;
			}else
			{
			oddSum+=num;
			}
		num++;
		}
		absDiff = (oddSum > evenSum) ? oddSum - evenSum : evenSum - oddSum;
		System.out.println(absDiff);
		System.out.println(evenSum);
		System.out.println(oddSum);
}
}
