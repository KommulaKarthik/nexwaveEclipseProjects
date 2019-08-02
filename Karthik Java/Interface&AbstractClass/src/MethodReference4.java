
// Reference to an instance method of a particular object

class Arithmetic {
	
	int squareNumber(int n) {
		return n*n;
	}
}

interface ArithmeticOp {
	
	int findSquareOfNumber(int num);
}

public class MethodReference4 {

	public static void main(String[ ] args) {

		Arithmetic obj = new Arithmetic();		
				
		ArithmeticOp op = obj :: squareNumber;
		
		//ArithmeticOp op = (int num) -> {  return obj.squareNumber(num); };
		
		System.out.println(op.findSquareOfNumber(3));		         		        
	}
}
