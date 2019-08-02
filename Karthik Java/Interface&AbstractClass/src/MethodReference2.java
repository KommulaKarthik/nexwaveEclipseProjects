
// Reference to a constructor	

class Employee {
	
	long employeeID;
	float salary;
	
	Employee(long employeeID, float salary) {		
		this.employeeID = employeeID;
		this.salary = salary;
	}	
	
	Employee( ) {
		
	}
	
	Employee(long employeeID) {		
		this.employeeID = employeeID;		
	}	
		
}

interface EmployeeOp {
	
	Employee createEmp(long id,float sal);
}

public class MethodReference2 {

	public static void main(String[ ] args) {
	
		EmployeeOp op = Employee::new;
		
		//EmployeeOp op = (long id,float sal) -> {  return new Employee(id,sal); };
    		
		Employee e = op.createEmp(1234,50000);
		System.out.println(e.employeeID+"   "+e.salary);	
		
	}	
}
