package javaexercises;

import java.util.ArrayList;

class Student extends Person{
	int Id;
	double cgpa;
	ArrayList<String> studentCourseList= new ArrayList<>();
	
	public void addDetails() {
		
		super.addDetails();
		
		System.out.println("Enter StudentId:");
		Id=sc.nextInt();
		
		System.out.println("Enter Student Cgpa:");
		cgpa=sc.nextDouble();
		
		
		
		
	}
	
	public void registerCourse() {
		System.out.println("the course list is:");
		

		
		}
		
		
	

	
	public void dispDetails() {
		super.dispDetails();
		
		System.out.println(Id);
		System.out.println(cgpa);
		
	}
}