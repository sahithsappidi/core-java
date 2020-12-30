package Oops;

public class CircleFinal {
	
	public static final double RADIUS=2.0;
	public static final String  COLOR="red";
	private static final double PIE = 3.14;
	
	private double radius;
	private String color;
	
	public CircleFinal(){
		this.radius=RADIUS;
		this.color=COLOR;
	}
	
	public CircleFinal(double radius) {
		this.radius=radius;
		this.color= COLOR;
	}
	
	public CircleFinal(double radius, String color) {
		this.radius=radius;
		this.color=color;
	}
	
	public double getRadius() {
		return this.radius;
	}
	public void setRadius(double d) {
		this.radius=radius;
	}
	
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	
	public String toString() {
		return "radius "+radius + "color " + color;
	}
	public double getArea() {
		return PIE*radius*radius;
	}
	public double getCircumference() {
		return PIE*2*radius;
	}
	
}
