/* Important points:

1. Comparable interface is used to compare the objects. 

2. An object has many fields comparable interface is used to specify which field you want to use for sorting. 

3. All wrapper classes, string and enum implemented comparable interface. Objects of these classes can be compared
    with each other.

4. TreeSet uses compareTo method of comparable interface to identify the duplicates. It never uses equals method so it
    is not necessary to override equals and hash code methods. 

 */

import java.util.*;
import somePackage.Student;

public class ComparableInterface {

	public static void main(String[ ] args) {

		//Sort students by roll number. 
		TreeSet<Student> students = new TreeSet<Student>();
		students.add(new Student(1,"Prem","Bangalore",18));
		students.add(new Student(6,"Kumar","Bangalore",21));
		students.add(new Student(2,"Rakesh","Bangalore",20));	
		students.add(new Student(3,"Ravi","Bangalore",15));
		students.add(new Student(5,"Rahul","Bangalore",16));				
		students.add(new Student(4,"Veer","Bangalore",19));
		students.add(new Student(4,"Veer","Bangalore",19));	//duplicate

		System.out.println(students);
		
	}
}
