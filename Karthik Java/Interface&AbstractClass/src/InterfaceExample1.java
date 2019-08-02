/*

1. If a class implements an interface it will inherit all the members of the interface (except static methods). Inheritance takes place. 

2. If a class inherits a abstract method it MUST compulsory override it. (does not apply to abstract class)  

*/ 
 
abstract interface I1 {
				 	
	public static final int X = 20;
	
	public abstract void printX( );		
}

class C1 implements I1 {

	@Override
	public void printX() {
		System.out.println(X);
	}
							
}

public class InterfaceExample1 {

	public static void main(String[  ] args) {

         C1 x = new C1();
         x.printX();                 
	}
}
