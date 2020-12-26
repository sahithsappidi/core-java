package eclipsetest;

import java.io.Console;
import java.util.Scanner;

public class ConsoleTest {

	public static void main(String[] args) {
		Console con=System.console();
		
		if(con==null) {
			System.err.println("console object unavailable");
			System.exit(1);
		}
		
		String name=con.readLine("enter your name");
		con.printf(name);
		Scanner in = new Scanner(con.reader());
	      con.printf("Enter an integer: ");
	      int anInt = in.nextInt();
	      con.printf("The integer entered is %d%n", anInt);
	      con.printf("Enter a floating point number: ");
	      double aDouble = in.nextDouble();
	      con.printf("The floating point number entered is %f%n", aDouble);
	      in.close();
	}

}
