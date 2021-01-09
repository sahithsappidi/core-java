package Oops;

public class CylinderTest {

	public static void main(String[] args) {
		Cylinder c1=new Cylinder();
		System.out.println(c1.getRadius() +" " + c1.getHeight() +" "  + c1.getArea()+" " +c1.getVolume());
		
		Cylinder c2=new Cylinder(3.9,6.0);
		System.out.println(c2.getRadius() + " " +c2.getHeight() +" "+c2.getArea()+" " +c2.getVolume());
	}

}
