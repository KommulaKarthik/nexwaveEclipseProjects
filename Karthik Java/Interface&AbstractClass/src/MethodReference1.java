//Reference to a static method

@FunctionalInterface
interface MathOp
{
	double power(int base,int index);	
}

public class MethodReference1 {

	public static void main(String[  ] args) {
		
        //MathOp op=(int base, int index) -> { return Math.pow(base, index); };
		
		MathOp op2 = Math::pow;
			
		System.out.println(op2.power(2,3));
		                		
	}	
}

/* 
If the lamda expression is only calling one of the existing methods or constructor 
and not doing any other task then it can be written as a method reference. 
*/
