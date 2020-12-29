package programBasics;

public class PrintLeapYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int low=999;
		int upper=2010;
		int sum=0;
		int lpnum=0;
		int lp;
		int n=low;
		while(n<=upper) {
			if(n%4==0) {
				sum+=n;
			}
			//lpnum+=n;
			n++;
		}
		lp=n%4;
		if(lp==0) {
			lpnum+=lp;
		}
		
		System.out.println(lpnum);
		System.out.println(sum);

	}

}
