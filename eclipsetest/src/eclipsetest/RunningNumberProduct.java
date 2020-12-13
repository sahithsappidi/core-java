package eclipsetest;

public class RunningNumberProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int low=1;
		int high=10;
		int prod=1;
		int num=low;
		while(low<=high) {
			num*=low;
			low++;
		}
		System.out.println("product is: " + num);
	}

}
