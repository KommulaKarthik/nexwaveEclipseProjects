import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// All exception classes which extend 'RuntimeException' class come under unchecked exceptions.  

class Person { }

class Student extends Person { String name; }

public class FewUnCheckedExceptions {

	public static void main(String[ ] args) throws IOException {

		String exception_name;

		System.out.println("Enter exception name");

		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		exception_name = d.readLine();

		switch(exception_name) {

		case "NullPointerException":

			Student x = null;
			System.out.println(x.name);

			break;
			
		case "NumberFormatException":

			String age = new String("twenty");
			int a = Integer.parseInt(age);

			break;

		case "ArrayIndexOutOfBoundsException":

			int array[ ] = {1,2,3,4,5};
			System.out.println(array[5]);

			break;

		case "ClassCastException":

			Person p = new Person();
			Student s = (Student)p;

			/*String str = new String("123");
            Integer in = (Integer)str; */

			break;

		case "StringIndexOutOfBounds":

			String string = new String("Welcome");
			System.out.println(string.charAt(7));

			break;

		case "IllegalStateException":

			Scanner sc = new Scanner(System.in);
			
			sc.close();

			sc.nextInt();						

			break;
			
		case "IllegalArgumentException":
			
			Thread t = new Thread( );
			t.setPriority(12);						
		}
	}	    
}
