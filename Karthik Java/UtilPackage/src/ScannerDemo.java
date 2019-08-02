import java.io.*;
import java.util.*;

public class ScannerDemo {

	public static void main(String[  ] args)  {

		Scanner scan = null;
		double sum = 0;

		try {
			scan = new Scanner(new File("ScannerInputFile.txt"));
			scan.useLocale(Locale.US);

			//Default delimiter is white space. Use ',' followed by at least a single space as a delimiter. 
			scan.useDelimiter(",\\s+");		

			while (scan.hasNext()) {	//Is there a next token ? 				
				if (scan.hasNextDouble()) {  //Is it possible to return the next token as double value ? 
					sum = sum+scan.nextDouble();  //Return the next token as double value and move cursor forward. 
				} else {
					scan.next();	 //Return the next token as string and move cursor forward.					
				}  
			}
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			scan.close();
		}

		System.out.println(sum);
	}
}
