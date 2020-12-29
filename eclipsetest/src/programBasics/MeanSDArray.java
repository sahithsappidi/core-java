package programBasics;

public class MeanSDArray {

	public static void main(String[] args) {
		int[] marks= {24,45,56,65,54,21};
		int sum=0;
		int sumsq=0;
		double mean;
		
		
		for(int i=0;i<marks.length;i++) {
			sum+=marks[i];
			sumsq+=marks[i]+marks[i];
		}
		mean=(double)sum/marks.length;
		System.out.println(mean);
	}
	

}
