
interface Interface1 {
	
	public default void print( ) {
		System.out.println("print method called");
	}
	
	public static void staticTest( ) {
		System.out.println("Static method called");
	}
}

class Class1 implements Interface1 {
	
	
}

public class StaticAndDefaultMethods {

	public static void main(String[  ] args) {
	
		Interface1.staticTest();
		//Class1.staticTest( );  - This line wont compile because interface static methods are not inherited.  

		Class1 x = new Class1( );
		x.print();   //print method is inherited. 				
	}
}
