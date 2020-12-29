package programBasics;

public class RunningNumberMod7Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int low=7;
		int high=1000;
		int sum=0;
		int num=low;
		while(low<=high) {
			sum+=low;
			low=low+7;
			
			
		}
		System.out.println("sum is: "+ sum);
		
	}

}
