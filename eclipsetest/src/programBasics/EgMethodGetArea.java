package programBasics;

public class EgMethodGetArea {

	public static void main(String[] args) {
		double r1,area,area2;
		area=getArea(2.0);
		System.out.println(area);
		area2=getArea(3.14);
		System.out.println(area2);
		System.out.println(getArea(4.4));
		
//		double getArea(double radius) {
//			return radius*radius*Math.PI;
//		}
	}

	private static double getArea(double radius) {
		// TODO Auto-generated method stub
		return radius*radius*Math.PI;
	}

}
