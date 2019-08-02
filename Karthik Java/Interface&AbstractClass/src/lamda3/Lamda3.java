package lamda3;

@FunctionalInterface
interface MathOperation {

	int add(int a, int b);	

}

class Test implements MathOperation {

	@Override
	public int add(int a, int b) {		
		return a+b;				
	}

}

public class Lamda3 {

	public static void main(String[ ] args) {
				
		addNumbers(new Test( ));
		
	}
	
	static void addNumbers(MathOperation op) {
          System.out.println(op.add(10,30));		
	}
}
