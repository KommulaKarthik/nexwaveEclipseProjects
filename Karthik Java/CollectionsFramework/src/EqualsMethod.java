/* 
Important points:

1. equals method is used to check whether two objects are meaningfully equivalent or not.

2. equals method is present in the object class that is parent for all classes in java. 

3. equals method in the object class uses == to check object equality. It compares references(addresses) and  
    not object contents(fields)

4. Override equals method if you want to compare object contents(fields) and not references.

5. String, all wrapper classes and Enum has overridden equals method in language.

 */

class Customer {

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	private String customerId;

	public Customer(String customerId) {		
		this.customerId = customerId;
	}

}

class Student {

	private long roll_number;
	private String name;
	private String place;

	public Student(long roll_number, String name, String place) {		
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




	public boolean equals(Object x) {

		Student s = null;

		if(x instanceof Student) {
			s = (Student)x;
		}

		if(this.roll_number == s.roll_number) 
			return true;
		else
			return false;		
	}
}

public class EqualsMethod {

	public static void main(String[  ] args) {

		Customer customer1 = new Customer("E999");
		Customer customer2 = new Customer("E999");

		if(customer1.equals(customer2)) 
			System.out.println("Two customer objects are equivalent");
		else
			System.out.println("Two customer objects are not equivalent");


		Student s1 = new Student(305000,"Rahul","Bangalore");
		Student s2 = new Student(305000,"Rahul","Mysore");

		Student s3 = new Student(101010,"Ravi","Chennai");
		Student s4 = new Student(111111,"Ravi","Chennai");

		if(s1.equals(s2)) 
			System.out.println("s1 and s2 objects are meaningfully equivalent");	
		else 
			System.out.println("s1 and s2 objects are meaningfully not equivalent");


		if(s3.equals(s4)) 
			System.out.println("s3 and s4 objects are meaningfully equivalent");	
		else
			System.out.println("s3 and s4 objects are meaningfully not equivalent");         


		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);

		if(i1.equals(i2)) 
			System.out.println("i1 and i2 integer objects are meaningfully equivalent");

		StringBuffer x1 = new StringBuffer("hello");
		StringBuffer x2 = new StringBuffer("hello");		

		//StringBuffer did not override equals method. It is using object class equals method.  
		if(x1.equals(x2)) 
			System.out.println("true");
		else
			System.out.println("false");					
	}	
}
