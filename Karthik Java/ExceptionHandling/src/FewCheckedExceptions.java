import java.io.*;

public class FewCheckedExceptions {

	public static void main(String[ ] args) throws IOException {

		System.out.println("Enter some value");
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		//d.close();

		//IOException
		try {

			String value = d.readLine();  //readLine method throws 'IOException'. 

		}
		catch(IOException e) {

			System.out.println("Error reading from console due to "+ e.getMessage());

		}

		//FileNotFoundException
		try {

			FileInputStream fs = new FileInputStream("someFile.txt");
		}
		catch(FileNotFoundException e) {

			System.out.println(e.getMessage());

		}

		//ClassNotFoundException
		try {
			Class.forName("java.lang.Mazenet");
		} 
		catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}				
	}	
}
