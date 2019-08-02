package test;
import java.io.*;

public class FileBasics {

	public static void main(String[  ] args) {

		File file = new File("abc.txt");
		
		File output = new File("output.txt");
		
		try {
			output.createNewFile();
		} catch (IOException e1) {			
			e1.printStackTrace();
		}
		
		BufferedReader d = null;
		BufferedWriter w = null;
		
		try {
			w = new BufferedWriter(new FileWriter(output));
		} catch (IOException e1) {			
			e1.printStackTrace();
		}
		
		try {
			 d = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}
		
		String line=null;
		
		try {
			while((line = d.readLine())!=null) {				
				w.write(line+"\n");				
			}
		} catch (IOException e) {			
			e.printStackTrace();
		}
				
		try {
			w.flush();
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
        		
	}
}
