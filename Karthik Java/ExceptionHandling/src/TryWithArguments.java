import java.io.*;

// Try with arguments and multi catch block demo. 

/*class Laptop implements AutoCloseable {
	
	public void close( ) {
		int a = 2/0;
		System.out.println("closing successful");
	}
}*/

public class TryWithArguments {

	public static void main(String[ ] args) {

		File inputFile = new File("File1.txt"); 	
		File outputFile = new File("File2.txt"); 

		try(  FileReader fileReader = new FileReader(inputFile);
				BufferedReader reader = new BufferedReader(fileReader);  
				FileWriter fileWriter = new FileWriter(outputFile,true);	
				BufferedWriter writer = new BufferedWriter(fileWriter);
				//Laptop laptop = new Laptop( );
			 ) {

			String readedLine = null;
			while((readedLine = reader.readLine())!=null) {

				writer.write(readedLine+"\n");        	   

			}
			writer.flush();				
			System.out.println("Copied successfully from File1 to File2");
		}		
		catch(IOException | NullPointerException | IllegalStateException e) {
			e.printStackTrace();
		}				
	}		
}
