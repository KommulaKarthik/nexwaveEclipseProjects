
interface Parent1 {

	default void print( ) {
		System.out.println("parent1 print called");
	}

}

interface Parent2 {

	default void print( ) {
		System.out.println("parent2 print called");
	}

}

class TestClass implements Parent1,Parent2 {
	
	/*//Solution 1
	@Override
	public void print( ) {
		System.out.println("Test class print called");
	}*/
		
	//Solution 2
	@Override
	public void print( ) {
		Parent2.super.print();
		System.out.println("Test class print called");
	}
}

public class DefaultAmbiguity {

	public static void main(String[  ] args) {
		
		TestClass obj = new TestClass( );
		obj.print();
		
	}
}
