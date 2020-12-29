package programBasics;

public class RunningNumberSquareSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int low=1;
		int high=1000;
		int sum=0;
		int num=low*low;
		while(low<=high) {
			sum=sum+num;
			low=low++;
			}
		System.out.println("sum is: "+ sum);
	}

}
