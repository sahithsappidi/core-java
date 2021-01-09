package Oops;

public class TestShape {

	public static void main(String[] args) {
			Shape s1= new Rectangle(2,6,"blue");
			Shape s2=new Triangle(5,7,"pink");
			
			System.out.println(s1.getArea());
			System.out.println(s2.getArea());
	}

}
