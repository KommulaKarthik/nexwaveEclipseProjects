import java.util.Scanner;
import java.io.*;

public class ScannerLabAssignment {

	public static void main(String args[ ]) throws IOException {

		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		String num = d.readLine();
		Scanner sc = new Scanner(num);

		int counter = 0;
		if(sc.hasNextByte()) {
			counter++;
			System.out.println("byte");
		}
		if(sc.hasNextShort()) {
			counter++;
			System.out.println("short");
		}
		if(sc.hasNextInt()) {
			counter++;
			System.out.println("int");
		}
		if(sc.hasNextLong()) {
			counter++;
			System.out.println("long");
		}
		if(counter==0) {
			System.out.println("Cont be fitted any where");
		}
	}		
}
