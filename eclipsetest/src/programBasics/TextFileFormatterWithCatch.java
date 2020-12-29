package programBasics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class TextFileFormatterWithCatch {

	public static void main(String[] args) {
		try {
			Formatter out=new Formatter(new File("out.txt"));
			int num1=9;
			int num2=78;
			String name="Pauline";
			out.format(""+ num1+num2);
			System.out.println("done");
		}
		catch(FileNotFoundException ex){
			ex.printStackTrace();
			
		}
	}

}
