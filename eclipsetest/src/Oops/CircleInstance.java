package Oops;

public class CircleInstance {
	private double radius;
	private String color;
	
	public CircleInstance() {
		
		radius=2.9;
		color="blue";
	}
	public CircleInstance(double r) {
		radius=r;
		color="red";
	}
	public CircleInstance(double r, String c) {
		radius=r;
		color=c;
	}
	public double getRadius() {
		return radius;
	}
	public String getColor() {
		return color;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}

}
