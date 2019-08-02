import java.io.*;

//EVERY exception class MUST be a sub class of Throwable. 

class InvalidAgeException extends Exception {

	private String message;

	InvalidAgeException(String message) {		
		this.message = message;
	}  

	@Override
	public String getMessage( ) {

		return message;
	} 
}  

public class YourOwnExceptionClass {

	public static void main(String[ ] args) throws IOException {
		
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
								        
		int age;

		while(true) {
						
			System.out.println("Enter your age");

			try {

				String value = d.readLine();

				age = Integer.parseInt(value);

				if(age<0) {
					throw(new InvalidAgeException("Age should not be a negative number"));
				}
				break;
			}
			catch(InvalidAgeException e) {
				System.out.println(e.getMessage());				
			}
			catch(NumberFormatException e) {
				System.out.println("Age should be a number");				
			}			
			catch(IOException e) {
				System.out.println("Error when reading age from console retry");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}					
		}				

		System.out.println("The entered age is :"+age);
	}
}
