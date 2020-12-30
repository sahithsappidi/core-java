package Oops;

public class CircleFinalTest {

	public static void main(String[] args) {
		CircleFinal c1=new CircleFinal();
		System.out.println(c1);
		CircleFinal c2=new CircleFinal(4.0);
		System.out.println(c2);
		CircleFinal c3=new CircleFinal(5.0,"blue");
		System.out.println(c3);
		
		c3.setRadius(10.0);
		c3.setColor("red");
		System.out.println(c3);
		
		System.out.println(c1.getRadius());
		System.out.println(c1.getColor());
		System.out.println(c1.getArea());
		System.out.println(c1.getCircumference());
		System.out.println(c2.getRadius());
		System.out.println(c2.getColor());
		System.out.println(c2.getArea());
		System.out.println(c2.getCircumference());
		System.out.println(c3.getRadius());
		System.out.println(c3.getColor());
		System.out.println(c3.getArea());
		System.out.println(c3.getCircumference());
		
		
		
	}

}
