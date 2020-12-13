package eclipsetest;

public class RunningNumberOddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int low=1;
		int high=1000;
		int sum=0;
		int num=low;
		while(low<=high) {
			sum+=low;
			low=low+2;
			
			
		}
		System.out.println("sum is: "+ sum);
	}
	
}
