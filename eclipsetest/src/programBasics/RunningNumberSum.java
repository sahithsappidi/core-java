package programBasics;

public class RunningNumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int low=9;
		int high=899;
		int sum=0;
		while(low<=high) {
			sum+=low;
			low++;
			
		}
		System.out.println("sum is: "+ sum);
	}

}
