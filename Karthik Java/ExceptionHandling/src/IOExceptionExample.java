
import java.io.*;

public class IOExceptionExample {

	public static void main(String[  ]  args) throws IOException {

		System.out.println("Enter your name");
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
        d.close();
		String s=null;		
		try {
			s = d.readLine();
		} catch (IOException e) {
			System.out.println("catch block executed");
			e.printStackTrace();
		}
		System.out.println("Entered name is: "+s);				             
	}				
}
