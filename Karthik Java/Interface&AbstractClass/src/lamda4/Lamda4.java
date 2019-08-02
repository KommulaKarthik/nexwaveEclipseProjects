package lamda4;

@FunctionalInterface
interface MathOperation {

	int add(int a, int b);	

}

public class Lamda4 {

	public static void main(String[ ] args) {
				
		addNumbers((a,b)->a+b);

	}
	
	static void addNumbers(MathOperation op) {
          System.out.println(op.add(12,8));		
	}

}

