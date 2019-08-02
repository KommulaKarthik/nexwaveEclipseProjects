import java.io.*;

public class MultipleCatchWithFinallyBlock {

	public static void main(String[ ] args) {

		File inputFile = null, outputFile = null;
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		BufferedReader reader = null;
		BufferedWriter writer = null;		

		try {

			inputFile = new File("File1.txt"); 						
			fileReader = new FileReader(inputFile); 			
			reader = new BufferedReader(fileReader);  			

			outputFile = new File("File2.txt");			
			outputFile.createNewFile();
			fileWriter = new FileWriter(outputFile,true);   //'true' means append the content to the end of the file. 
			writer = new BufferedWriter(fileWriter);                                 

			//writer.close();
			String readedLine = null;
			while((readedLine = reader.readLine())!=null) {

				writer.write(readedLine+"\n");        	   

			}
			writer.flush();				
			System.out.println("Copied successfully from File1 to File2");
		}
		
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}		
		catch(IOException e) {
			e.printStackTrace();
		}			
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {

			try {
				fileReader.close();
			} 
			catch (IOException e) {				
				e.printStackTrace();
			}

			try {
				fileWriter.close();
			} 
			catch (IOException e) {				
				e.printStackTrace();
			}

			try {
				reader.close();
			} 
			catch (IOException e) {				
				e.printStackTrace();
			}

			try {
				writer.close();
			} 
			catch (IOException e) {				
				e.printStackTrace();
			}			
		}			  				
	}		
}
