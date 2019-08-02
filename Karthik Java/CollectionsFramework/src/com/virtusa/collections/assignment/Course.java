package com.virtusa.collections.assignment;

public class Course {
	private String courseName;
	
	
	

	public Course(String courseName) {
		super();
		this.courseName = courseName;
	}




	public String getCourseName() {
		return courseName;
	}




	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}




	@Override
	public String toString() {
		return "Course [courseName=" + courseName + "]";
	}




	
}
