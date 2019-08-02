/* Important points:
 
List - Takes duplicates
Set - Does not take duplicates
Hash - Uses hashing algorithm
Linked - Collection is ordered
Tree - Sorted
Map - Used for storing mapping information

1. Set does not allow duplicates. If you add duplicates they wont get added to the collection.  
 
2. List is a index based collection where as set is not. The methods which adds the object at a particular index 
    'add(index,object)' and get method which returns the object at a particular index 'get(index)' are not available in the Set. 
 
3. HashSet uses hashing algorithm to identify duplicates faster.  

4. The objects added to the HashSet MUST override equals and hashCode methods if not hash set takes duplicates (The
objects which are meaningfully equivalent).  

5. HashSet is unordered and unsorted.

*/

import java.util.*;
import somePackage.Student;

public class HashSetExample {
	
	public static void main(String[ ] args) {
		                                      
        HashSet<Student> students = new HashSet<Student>( );
        
        Student s1 = new Student(305600,"Ravi","Bangalore",17);
        students.add(s1); 
        
        Student s2 = new Student(123400,"Kamal","Chennai",17);
        students.add(s2); 
        
        Student s3 = new Student(543200,"Vimal","Delhi",18);
        students.add(s3); 
                                        
        Student s4 = new Student(305601,"Karthik","Kolkatta",20);
        students.add(s4); 
        
        Student s5 = new Student(305604,"Ramesh","Hyderabad",22);
        students.add(s5); 
        
        Student s6 = new Student(305600,"Ravi","Bangalore",17);        
        students.add(s6);   // HashSet does not allow duplicates. The 'add' method will return false.
        
        System.out.println(students.toString());
                
        System.out.println("Students are: "+students.size());   

/*		//HashSet is unordered. The order of objects printed is unpredictable.
        Iterator<Student> allStudents = students.iterator();
        
        while(allStudents.hasNext()) {
        	Student s = allStudents.next();
        	System.out.println(s.getName());
        }*/
                
	}
}
