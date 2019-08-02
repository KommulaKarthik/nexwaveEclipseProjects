package lamda2;

@FunctionalInterface
interface MathOperation {
		
	int add(int a, int b);
	
}

/*class Test implements MathOperation
{

	@Override
	public int add(int a, int b) 
	{ 
		return a+b; 
	}
		
}*/

public class Lamda2 {

	public static void main(String[  ] args) {

		//MathOperation x = new Test( );
		MathOperation x = (int a,int b) -> { return a+b; };
		System.out.println(x.add(21, 9));

	}
}

/*
Lambda expression syntax:

parameter -> expression body

Eg: (int a, int b) -> { return a * b; };

Characteristics of a lambda expression:

1) Optional type declaration in parameter
2) When only one parameter is there parenthesis is optional
3) When only one statement is there in expression body curly braces are optional
4) Optional return keyword

Note : 3 and 4 both has to be applied at same time. 

Reference: https://www.tutorialspoint.com/java8/java8_lambda_expressions.htm
*/
