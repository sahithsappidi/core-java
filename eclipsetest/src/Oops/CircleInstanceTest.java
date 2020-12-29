package Oops;

public class CircleInstanceTest {

	public static void main(String[] args) {
		CircleInstance c1=new CircleInstance(3.4,"blue");
		
		System.out.println(c1.getRadius());
		System.out.println(c1.getColor());
		System.out.println(c1.getArea());
		
		CircleInstance c2= new CircleInstance(4.5);
		
		System.out.println(c2.getRadius());
		System.out.println(c2.getColor());
		System.out.println(c2.getArea());
		
		CircleInstance c3= new CircleInstance();
		
		System.out.println(c3.getRadius());
		System.out.println(c3.getColor());
		System.out.println(c3.getArea());
		
		
		
		
	}

}
