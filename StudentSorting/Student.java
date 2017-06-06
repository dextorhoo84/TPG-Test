package com.tpg.test;

public class Student implements Comparable<Student>{

	private Integer studentId;
	private String name;
	private Float gpa;
	
	public Student(Integer studentId, String name, Float gpa){
		super();
		this.studentId = studentId;
		this.name = name;
		this.gpa = gpa;		
	}
	
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getGpa() {
		return gpa;
	}
	public void setGpa(Float gpa) {
		this.gpa = gpa;
	}

	@Override
	public int compareTo(Student student) {
		Float compareGpa = student.getGpa();
		
		int gpaCompare = compareGpa.compareTo(this.gpa);
				
		if(gpaCompare == 0){
			
			int nameCompare = this.name.compareTo(student.getName());
			
			if(nameCompare == 0){
				
				return this.studentId.compareTo(student.getStudentId());
				
			}else{
				return nameCompare;
			}
			
		}else{
			return gpaCompare;
		}
		
	}
	
}
