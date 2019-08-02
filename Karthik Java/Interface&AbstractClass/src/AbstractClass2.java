
/* 
 If a abstract class implements an interface it can override all the methods in the interface or some of them 
 or none of them. The first concrete sub class in the inheritance tree must override all the unimplemented 
 methods. Abstract class can just pass on the implementation to its child classes.
*/
  
interface A1 {
	
	public abstract void m1( );
	public abstract void m2( );
	public abstract void m3( );	
	
}

abstract class SomeAbstractClass implements A1 {

	public void m3( ) {
		System.out.println("m3 called");
	}
	
}

public class AbstractClass2 extends SomeAbstractClass {
	
	@Override
	public void m1() {
		System.out.println("m1 called");		
	}

	@Override
	public void m2() {
		System.out.println("m2 called");
		
	}
	
	public static void main(String[  ] args) {
		
		AbstractClass2 obj = new AbstractClass2( );
		obj.m1();
		obj.m2();
		obj.m3();
		
	}
}
