import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[ ] args) throws IOException {

		Scanner scanner = null;

		try {
			/*scanner = new Scanner(System.in);
			
			//System.out.println("Enter number1");
			int x = scanner.nextInt();			
			
			//System.out.println("Enter number2");
			int y = scanner.nextInt();			
			
			int z = x+y;
			System.out.println("Sum is: "+z); 
			String x = scanner.nextLine();
			System.out.println(x);*/
			System.out.println("Enter a number");
			BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
			String x = d.readLine();
			int number = Integer.parseInt(x);
			System.out.println(number);
		} 
		finally {
			//scanner.close();
		}
	}
}
