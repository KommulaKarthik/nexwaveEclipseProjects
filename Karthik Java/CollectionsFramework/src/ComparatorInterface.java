/* Important points:

1. Using comparable interface we can create only 1 sort sequence where as by using comparator we can create many 
    sort sequences.

2. Comparable interface will not work if we con't modify the source code of the class. Comparator works in all cases.   

3. Comparator has more precedence over comparable.   

*/ 

import java.util.*;
import somePackage.Student;

class SortStudentsByAge implements Comparator<Student> {

	public int compare(Student s1, Student s2) {

		if(s1.getAge() > s2.getAge()) {
			return -1;
		}
		if(s1.getAge() == s2.getAge()) {
			return 0;
		}
		if(s1.getAge() < s2.getAge()) {
			return 1;
		}
		return 0;		
	}		
}

class SortStudentsByName implements Comparator<Student> {

	public int compare(Student s1, Student s2) {

		return (s1.getName().compareTo(s2.getName())); 

	}
}

class SortStudentsByPlace implements Comparator<Student> {

	public int compare(Student s1, Student s2) {

		return (s1.getPlace().compareTo(s2.getPlace()));
	}	

}

public class ComparatorInterface {

	public static void main(String[  ] args) {
				
		//Sort students by Age  
		TreeSet<Student> students = new TreeSet<Student>(new SortStudentsByAge( ));		
		students.add(new Student(3,"Ravi","Bangalore",22));
		students.add(new Student(5,"Rahul","Delhi",21));
		students.add(new Student(1,"Prem","Ahemadabad",15));
		students.add(new Student(6,"Kumar","Varanasi",17));
		students.add(new Student(2,"Arvind","Chennai",19));
		students.add(new Student(4,"Veer","Mumbai",20));
		System.out.println(students);
									
		//Sort students by name
		TreeSet<Student> students2 = new TreeSet<Student>(new SortStudentsByName());
		students2.add(new Student(3,"Ravi","Bangalore",15));
		students2.add(new Student(5,"Rahul","Bangalore",16));
		students2.add(new Student(1,"Prem","Bangalore",18));
		students2.add(new Student(6,"Kumar","Bangalore",21));
		students2.add(new Student(2,"Arvind","Bangalore",20));
		students2.add(new Student(4,"Veer","Bangalore",19));
		System.out.println(students2);

		//Sort students by place  
		TreeSet<Student> students3 = new TreeSet<Student>(new SortStudentsByPlace());
		students3.add(new Student(3,"Ravi","Bangalore",15));
		students3.add(new Student(5,"Rahul","Delhi",16));
		students3.add(new Student(1,"Prem","Ahemadabad",18));
		students3.add(new Student(6,"Kumar","Varanasi",21));
		students3.add(new Student(2,"Arvind","Chennai",20));
		students3.add(new Student(4,"Veer","Mumbai",19));
		System.out.println(students3);
	}
}
