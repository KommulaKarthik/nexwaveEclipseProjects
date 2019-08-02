
// Reference to an instance method of an arbitrary object of a particular type

class Person {

	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge(  ) {	
		return age;
	}		
}

interface PersonOp {

	int fetchPersonAge(Person p);
}

public class MethodReference3 {

	public static void main(String[  ] args) {
				        			
		//PersonOp op = Person::getAge;
		
		PersonOp op = (Person p) -> { return p.getAge(); };
		        				               
        int age = op.fetchPersonAge(new Person("Ravi",25));
        
        System.out.println(age); 
	}
}
