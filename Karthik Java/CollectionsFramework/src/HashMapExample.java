/* Important points:

1. HashMap is used to store mapping information. 

2. HashMap is a data structure where keys are mapped to values. Key and value both are objects. If you give key as 
    input you should get the key corresponding value as output.     

3. Keys should be unique where as values can be duplicated. 

4. If you add a duplicate key its not an error, the old key value will be replaced with the new key value.

5. HashMap uses hashing algorithm to find the key and retrieve its value faster.

6. THE KEY CLASS MUST OVERRIDE EQUALS AND HASHCODE METHODS. If you don't override program will compile and
    run successfully but hash map will not work (If you give a key as input it will return null even if the key exists).    

7. All wrapper classes, String, Enum, Date has overridden equals and hash code methods so all these classes will 
    perfectly work as key class in HashMap.

8. Hashtable and HashMap both are same the only difference is Hashtable is thread safe because the methods in the 
    Hashtable are synchronized. HashMap is not thread safe. Null can be used as a key in the hashmap but not in hashtable.
    
9. HashMap is unordered. HashMap will not preserve the order of keys.

*/

import java.util.*;
import somePackage.Student;

public class HashMapExample {

	public static void main(String[ ] args) {

		//Students mapped to their enrolled courses. 
		HashMap<Student,Course> entries =  new HashMap<Student,Course>();

		Student s1 = new Student(305600,"Ravi","Bangalore",17);
		Student s2 = new Student(123400,"Kamal","Chennai",17);								
		Student s3 = new Student(543200,"Vimal","Delhi",18);		
		Student s4 = new Student(305601,"Karthik","Kolkatta",20);		

		Course c = new Course("C","1 month",5000);
		Course cpp = new Course("C++","1 month",6000);
		Course java = new Course("Java","2 month",15000);
		Course j2ee = new Course("J2ee","1 month",15000);

	    entries.put(s1, c);
		entries.put(s2, cpp);
		entries.put(s3, java);			
		entries.put(s4, j2ee); 	
		entries.put(null,null);
		System.out.println(entries.size());	

		Student find = new Student(543200,"Vimal","Delhi",18);
		System.out.println("Vimal enrolled for "+entries.get(find).getName()+" course");

		if(entries.containsKey(s1)) 
			System.out.println(s1.getName()+" enrolled for some course");

		if(entries.containsValue(cpp))
			System.out.println("Some student enrolled for cpp course");

		entries.remove(s1);

		System.out.println("Number of entries after removing student s1 : "+entries.size());
		
		Collection<Course> allValues = entries.values();
		System.out.println(allValues);
	}		
}
