package com.tpg.test;

import java.util.Arrays;

public class StudentSortingTest {

	/**
	 * Main method to sort the student list
	 * @param args
	 */
	public static void main(String[] args) {

		Student[] students = new Student[6];
		
		Student stuA = new Student(33,"Tina",3.68f);
		Student stuB = new Student(85,"Louis",3.85f);
		Student stuC = new Student(56,"Samar",3.75f);
		Student stuD = new Student(19,"Samar",3.75f);
		Student stuE = new Student(22,"Lorry",3.76f);
		Student stuF = new Student(23,"Ron",3.76f);
		
		students[0] = stuA;
		students[1] = stuB;
		students[2] = stuC;
		students[3] = stuD;
		students[4] = stuE;
		students[5] = stuF;
		
		Arrays.sort(students);
		
		for(Student student : students){
			System.out.println("Student id: " + student.getStudentId() + 
					" , name: " + student.getName() +
					" , gpa: " + student.getGpa());
		}
		
	}

}
