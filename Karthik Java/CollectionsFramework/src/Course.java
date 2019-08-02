
public class Course {

	String name;
	String duration;
	float fees;
			
	public Course(String name, String duration, float fees) {
		super();
		this.name = name;
		this.duration = duration;
		this.fees = fees;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDuration() {
		return duration;
	}
	
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	public float getFees() {
		return fees;
	}
	
	public void setFees(float fees) {
		this.fees = fees;
	}
	
	public String toString( ) {
		
		return "Course name: "+name+"  "+"duration: "+duration+"  "+"fees: "+fees;
	}
	
}

