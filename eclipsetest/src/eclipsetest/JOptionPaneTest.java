package eclipsetest;

import javax.swing.JOptionPane;

public class JOptionPaneTest {

	public static void main(String[] args) {
		String radiusStr;
		double radius, area;
		
		radiusStr= JOptionPane.showInputDialog("enter the radius");
		radius= Double.parseDouble(radiusStr);
		
		area=radius*radius*Math.PI;
		System.out.println("area is:"+ area);
		
	}

}
