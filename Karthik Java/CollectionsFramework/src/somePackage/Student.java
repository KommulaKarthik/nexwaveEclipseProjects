package somePackage;

public class Student implements Comparable<Student> { 

	private long roll_number;
	private String name;
	private String place;
	private int age;

	public Student(long roll_number, String name, String place, int age) {		
		this.roll_number = roll_number;
		this.name = name;
		this.place = place;
		this.age = age;
	}

	public long getRoll_number() {
		return roll_number;
	}

	public void setRoll_number(long roll_number) {
		this.roll_number = roll_number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object x) {
		
		//System.out.println("equals called");
				
		if(x instanceof Student) {
			Student s = (Student)x;
			if(this.roll_number == s.roll_number) {
				return true;
			}
			else {
				return false;
			}	
		}	
		return false;
	} 

	@Override
	public int hashCode( ) {
		
		//System.out.println("hashcode called");
				
		String rollnumber = Long.toString(roll_number);

		if(rollnumber.length() == 1) {
			return Integer.parseInt(rollnumber);
		}

		return Integer.parseInt(rollnumber.substring(rollnumber.length()-2));		
	}
         
	public String toString( ) {

		return "Name:"+name+"   Rollnumber:"+roll_number+"   Place:"+place+"   Age:"+age+"\n";
	}

	@Override
	public int compareTo(Student s) {
		       								
		if(this.roll_number > s.roll_number) {
			return 1;
		}
		if(this.roll_number < s.roll_number) {
			return -1;
		}
		if(this.roll_number == s.roll_number) {
			return 0;
		}

		return 0;
	}  	
}
