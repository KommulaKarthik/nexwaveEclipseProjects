import java.io.*;

public class DeSerialization {

	public static void main(String[ ] args) {

		ObjectInputStream in = null;

		try {

			in = new ObjectInputStream(new FileInputStream("SavedObjects.txt"));  
			Student s = (Student)in.readObject();			
			System.out.println("Student ID: "+s.id+" "+"Name: "+s.name+" Mobile: "+s.mobile);

		}
		catch(IOException e) {
			System.out.println("IOException caught "+e.getMessage());
		}
		catch(ClassNotFoundException e) {
			System.out.println("Class not found exception caught "+e.getMessage());
		}
		finally {
			try {
				in.close();
			}
			catch(IOException e) {
				System.out.println("IOException caught "+e.getMessage());	
			}
		}
	}
}
