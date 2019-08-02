
public class NestedTryCatch {

	public static void main(String[  ] args) {

		try {

			testMethod( );

		}
		catch(Exception e) {   //Outer catch 

			System.out.println("Outer catch block executed and the exception message is: "+ e.getMessage());
		}
		System.out.println("program execution continued..");

	}

	static void testMethod( ) {

		try {

			//int a = 2/0;
			int a[ ] = {1,2,3};
			int x = a[4];

		}
		catch(NullPointerException e) {    //Inner catch

			System.out.println("Inner catch block executed"+e.getMessage());

		}
		catch(ArithmeticException e){   //Inner catch

			System.out.println("Inner catch block executed"+e.getMessage());

		}		
	}
}
