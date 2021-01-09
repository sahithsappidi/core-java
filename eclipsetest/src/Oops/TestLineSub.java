package Oops;

public class TestLineSub {

	public static void main(String[] args) {
		LineSub l1= new LineSub(1,2,3,4);
		LineSub l2= new LineSub(new Point(5,6), new Point(8,9));
		l1.setBegin(new Point(21,22));
		l1.setEnd(new Point(34,35));
		System.out.println(l1.getBeginX());
		System.out.println(l1.getBeginY());
		l1.setBeginX(45);
		l1.setBeginY(78);
		l1.setEndX(45);
		l1.setEndY(78);
		System.out.println(l1.getBeginX());
		System.out.println(l1.getBeginY());
		System.out.println(l1.getEndX());
		System.out.println(l1.getEndY());
		
		l1.setBeginXY(101,102);
		l1.setEndXY(103,104);
		System.out.println("begin's x is: " + l1.getBeginXY()[0]);
	      System.out.println("begin's y is: " + l1.getBeginXY()[1]);
	      System.out.println("end's x is: " + l1.getEndXY()[0]);
	      System.out.println("end's y is: " + l1.getEndXY()[1]);
		
		System.out.printf("length is: %.2f%n", l1.getLength());
		
	}

}
