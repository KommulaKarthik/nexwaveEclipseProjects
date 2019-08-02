import java.io.*;

/*
Marker interface:

Marker interfaces are used for giving permission to perform a specified task like object cloning or serialization etc..

Marker interfaces do not have any methods in them, they are empty. 
  
1. What is Serialization ?

Serialization is a process of converting the state of an object to a byte stream so that it can be 
saved to a file or database for later use OR transferred across a network.

2. Why to convert an object to byte stream ?

To move or transfer an object from one machine to another machine. 

3. Why should i move an object from one machine to another machine ? 

In J2EE session management all objects added to the session (session attribute values) must implement Serializable 
interface. Session object will migrate from one JVM to another JVM. Facebook is not hosted on one server. 

4. What is De-Serialization ?

Converting byte stream back to the actual java object.

5. What are marker interfaces ? 

Marker interfaces do not have any methods in them, they are used for giving permission(flag) to perform tasks like object 
cloning, serialization etc.. Serializable and Clonable are marker interfaces.     

6. Fields marked as transient will not be serialized. 

7. You can create an empty interface but you cannot make it a marker interface.
 */

class Student implements Serializable {
	
	int id;  
	String name;
	transient long mobile;

	public Student(int id, String name, long mobile) {		
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}	
}

public class Serialization {

	public static void main(String[ ] args) {

		Student s1 = new Student(211,"ravi",7760122682L);  
		ObjectOutputStream out = null;

		try {

			FileOutputStream fout = new FileOutputStream("SavedObjects.txt");  
			out = new ObjectOutputStream(fout);  

			out.writeObject(s1);  
			out.flush();  

			System.out.println("Object saved to file");

		}
		catch(IOException e) {			
			e.printStackTrace();		
		}
		finally {

			try {
				out.close();
			}
			catch(IOException e) {
				System.out.println("Exception:"+e.getMessage());
			}			
		}		
	}	
}
