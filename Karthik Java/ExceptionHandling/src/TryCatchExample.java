
/*
What is exception ?

Dictionary meaning of exception is 'abnormal condition'. In java, exception is an event that disrupts the normal flow of the program.

What is exception handling ?

Exception handling is a mechanism to handle runtime errors so that normal flow of the application can be maintained.


Advantages of exception handling:

1. The core advantage of exception handling is to maintain the normal flow of the application when there is a run time error.

2. Closing of resources in a appropriate manner. (use finally block to achieve this)

3. Exception handling is very helpful when debugging the project because it gives complete details of the run time error like 
    exception name, exception message and which line of the program caused the run time error.

4. Exception handling is very useful in implementing transaction management in JDBC.  

5. Separate exception handling code from business logic.  

 */


// Handle arithmetic exception and move on. 

class TryCatchExample {

	public static void main(String args[  ]) {

		int a;		

		for(int i=0; i<100; i++) {

			try {	  //Statements that cause run time error should be written inside try block.   
				a = 12345 / (int)(Math.random()*10);
			} 
			catch(ArithmeticException e) {    //Inside catch block write code to recover from the run time error. 
				System.out.println(e.getMessage());
				a = 0; // set a to zero and continue
			}			
			System.out.println("a: " + a);
		}
	}
}
