/*
Notes:

1. Assertions give you a way to test your assumptions during development and debugging.

2. Assertions are typically enabled during testing but disabled during deployment.

3. Assertions are added to the java language from java 1.4. You can use assert as a keyword (as of version 1.4) or an identifier, 
but not both together. To compile older code that uses assert as an identifier (for example, a method name), use the -source 1.3 
command-line flag to javac. 

4. Assertions are disabled at runtime by default. To enable them, use a command line flag -ea or -enableassertions.
Selectively disable assertions by using the -da or -disableassertions flag.

5. AssertionError should never be handled. 

 */

public class AssertDemo {

	public static void main(String[ ] args) {

	//	TestA(-1);
		TestB(-1);
		
	}
	
	private static void TestA(int age) {
	
		if (age >= 0) {
			//useNum(num + x);  call some method. 
		} 
		else { // num must be < 0. This code should never be reached!
			
			System.out.println("Yikes! num is a negative number! "+ age);
		}
	}
	
	private static void TestB(int age) {
		
		assert (age >=0); // throws an AssertionError if this test becomes false. 
		//useNum(num + x);  call some method.
		
	}	
}
