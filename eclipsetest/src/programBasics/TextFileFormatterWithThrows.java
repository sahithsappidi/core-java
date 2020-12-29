package programBasics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class TextFileFormatterWithThrows {

	public static void main(String[] args) throws FileNotFoundException{
		Formatter out=new Formatter(new File("out.txt"));
		
		int num=12;
		double num2= 66.9;
		String name="paul";
		
		out.format(""+ name);
		out.close();
		System.out.println("done");
		
		
	}

}
