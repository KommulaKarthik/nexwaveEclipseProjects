/* Important points:

1. hash codes are typically used to increase the performance of large collection of data. 

2. hash code method is present in the object class that is parent for all classes in java. 

3. hash code method present in the object class generates unique(different) hash code for every object. It does not 
    care whether two objects are meaning fully equivalent or not.  

4. Override hash code method in such a way that - "If two objects are meaning fully equivalent, then their hash codes
    should also be equivalent". 

5. If two objects are meaning fully not equivalent and if they generate the same hash code it does not create any problem.

6. Hashing is a simple two step algorithm:    
    i) Use 'hash code' method to find the right hash bucket.  
    ii) Search the bucket for the right object using equals method.

7. String, all wrapper classes and Enum has overridden hash code method.

 */

class Student1 {  

	private long roll_number;
	private String name;
	private String place;

	public Student1(long roll_number, String name, String place) {		
		this.roll_number = roll_number;
		this.name = name;
		this.place = place;
	}

	@Override
	public boolean equals(Object x) {

		Student1 s = (Student1)x;

		if(this.roll_number == s.roll_number) 
			return true;
		else 
			return false;		
	}
}

class Student2 {

	private long roll_number;
	private String name;
	private String place;

	public Student2(long roll_number, String name, String place) {		
		this.roll_number = roll_number;
		this.name = name;
		this.place = place;
	}
	
	

	public long getRoll_number() {
		return roll_number;
	}



	public void setRoll_number(long roll_number) {
		this.roll_number = roll_number;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPlace() {
		return place;
	}



	public void setPlace(String place) {
		this.place = place;
	}



	@Override
	public boolean equals(Object x) {

		Student2 s = (Student2)x;

		if(this.roll_number == s.roll_number) 
			return true;		
		else 
			return false;		
	}

	@Override
	public int hashCode( ) {

		String rollnumber = Long.toString(roll_number);

		if(rollnumber.length() == 1) {
			return Integer.parseInt(rollnumber);
		}

		return Integer.parseInt(rollnumber.substring(rollnumber.length()-2)); 

		/* Example of incorrect way of overriding hash code method.
		return name.charAt(0);
		*/
		
		/*
		return 20;
		*/
	}
}

public class HashCodeMethod {

	public static void main(String[  ] args) {

		Student1 s1 = new Student1(305640,"pavan","Bangalore");   
		Student1 s2 = new Student1(305640,"pavan","Bangalore");   
				
		if(s1.equals(s2)) System.out.println("s1 and s2 objects are meaning fully equivalent");

		System.out.println("s1 hashcode: "+ s1.hashCode()); 
		System.out.println("s2 hashcode: " + s2.hashCode()); 

		System.out.println("Note: They are generating different hash codes because hashcode method is not overridden");

		Student2 s3 = new Student2(305640,"pavan","Bangalore");		
		Student2 s4 = new Student2(305640,"karthik","Bangalore");

		if(s3.equals(s4)) System.out.println("\ns3 and s4 objects are meaning fully equivalent");

		System.out.println("s3 hashcode: "+ s3.hashCode());
		System.out.println("s4 hashcode: "+ s4.hashCode());


		String x1 = new String("hello");
		String x2 = new String("hello");

		if(x1.equals(x2)) System.out.println("\nx1 and x2 are meaningfully equivalent");

		System.out.println("x1 hashcode: "+ x1.hashCode());
		System.out.println("x2 hashcode: "+ x2.hashCode());

		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);

		if(i1.equals(i2)) System.out.println("\ni1 and i2 are meaningfully equivalent");

		System.out.println("i1 hashcode: "+ i1.hashCode());
		System.out.println("i2 hashcode: "+ i2.hashCode());

	}
}
