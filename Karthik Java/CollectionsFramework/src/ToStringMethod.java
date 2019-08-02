/* Important points: 

1. toString method is present in the object class that is parent for all classes in java. 

2. toString method in the object class prints Classname@hexadecimal representation of object's hashcode. 

3. Override toString method if you want to show some meaningful information when you print an object.

4. An implicit call to the toString method happens when you print an object or a reference. 

5. String, all wrapper classes and Enum has overridden toString method in language. 

*/

class Address1 {

	String house_number = "189#";
	String street = "2ndcross";
	String place = "BTM layout";
	String city = "Bangalore";
	String pincode = "560029";
}

class Address2 {

	String house_number = "189#";
	String street = "2ndcross";
	String place = "BTM layout";
	String city = "Bangalore";
	String pincode = "560029";

	@Override 
	public String toString( ) {

		return house_number+", "+street+", "+place+", "+city+", "+pincode;
	}
}

public class ToStringMethod {

	public static void main(String[  ] args) {
				
		Address1 address1 = new Address1( );
		System.out.println("Address1: "+ address1);
		
		Address2 address2 = new Address2( );
		System.out.println("Address2: "+ address2);
		     
		String s = "Welcome";
		System.out.println(s);
		
		Integer i = new Integer(10);
		System.out.println(i);
	}
}
