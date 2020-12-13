package eclipsetest;

public class ThreeFiveSevenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int low=1;
		int upper=1000;
		int sum=0;
		int num=low;
		while(num<=upper) {
			if((num%3==0 || num%5==0 || num%7==0) && !(num%15==0 ||num%21==0 ||num%35==0 || num%105==0)) {
				sum+=num;
			}
			num++;
		}
		
		
		System.out.println(sum);

	}

}
