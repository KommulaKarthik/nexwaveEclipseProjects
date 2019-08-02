import java.io.*;

class Employee {

	private String employeeId;
	private int age;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws IllegalArgumentException {

		if(age<=0) {
			throw(new IllegalArgumentException("Age should not be a negative number"));
		} 
		else {
			this.age = age;
		}
	}			
}

public class ThrowsExample {

	public static void main(String[  ] args) throws IOException {

		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));	
		System.out.println("Enter the employee age");
		int age = Integer.parseInt(d.readLine());

		Employee e = new Employee( );

		try {

			e.setAge(age);
            System.out.println("Employee age successfully set");
		}        
		catch(IllegalArgumentException x) {
			System.out.println(x.getMessage());		
		}			
	}
}
