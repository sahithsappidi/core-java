package Oops;

public class TestPoin2DPoint3D {

	public static void main(String[] args) {
		Point2D p1= new Point2D(3,5);
		Point2D p2= new Point2D();
		
		p1.setX(6);
		p1.setY(8);
		
		Point3D p3=new Point3D(12,32,34);
		p3.setZ(45);
		
		Point3D p4=new Point3D();
		p4.setZ(4);
		p4.setX(5);
		p4.setY(7);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		
	}

}

