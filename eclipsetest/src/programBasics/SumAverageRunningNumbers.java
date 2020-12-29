package programBasics;

public class SumAverageRunningNumbers {

	public static void main(String[] args) {
		int sum=0;
		int lowerbound=1;
		int upperbound=1000;
		double average;
		
		for(int number=lowerbound;number<=upperbound;number++) {
			sum+=number;
		}
		average=(double)sum/(upperbound-lowerbound+1);
		System.out.println(sum);
		System.out.println(average);
		
		int count=0;
		sum=0;
		
		if(lowerbound %2==0) {
			lowerbound++;
		}
		for(int number=lowerbound; number<=upperbound;number+=2) {
			++count;
			sum+=number;	
		}
		average=(double)sum/count;
		System.out.println(sum);
		System.out.println(average);
		
		
	}

}
