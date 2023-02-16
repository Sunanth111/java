package javaexercises;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

class Person{
	String name;
	String email;
	int mobileNo;
	
	Scanner sc=new Scanner(System.in);
	
	public void addDetails() {
		System.out.println("Enter Name:");
		name=sc.next();
		
		System.out.println("Enter email:");
		email=sc.next();
		
		System.out.println("Enter Mobile Number:");
		mobileNo=sc.nextInt();
	}
	
	
	
	public void dispDetails() {
		System.out.println(name);
		System.out.println(email);
		System.out.println(mobileNo);
	}
}




class Student extends Person{
	int Id;
	double cgpa;
	
	public void addDetails() {
		
		super.addDetails();
		
		System.out.println("Enter StudentId:");
		Id=sc.nextInt();
		
		System.out.println("Enter Student Cgpa:");
		cgpa=sc.nextDouble();
		
		
	}
	
	public void registerCourse() {
		
		
	}
	
	public void dispDetails() {
		super.dispDetails();
		
		System.out.println(Id);
		System.out.println(cgpa);
		
	}
}


class Faculty extends Person{
	int Id;
	String facultyposition;
	
	public void addDetails() {
		
		System.out.println("Enter FacultyId:");
		Id=sc.nextInt();
		
		System.out.println("Enter faculty Position:");
		facultyposition=sc.next();
		
	}
	
	public void dispDetails() {
		
		System.out.println(Id);
		System.out.println(facultyposition);
		
		
	}
}

class Course{
	Scanner sc=new Scanner(System.in);
	String Id;
	String coursetitle;
	double courseCredit;
	
	/*Course(String Id,String coursetitle,double courseCredit){
		this.Id=Id;
		this.courseCredit=courseCredit;
		this.coursetitle=coursetitle;
	}*/
		
		
	public void addCourse() {
		System.out.println("Enter Course Id :");
		Id=sc.next();
		System.out.println("Enter Course Title :");
		coursetitle=sc.next();
		System.out.println("Enter credits :");
		courseCredit=sc.nextDouble();
		
	}

	public void dispDetails() {
		System.out.println(Id);
		System.out.println(courseCredit);
		System.out.println(coursetitle);
		
	}
	
}






public class University {
	
	ArrayList<Student> studentList = new ArrayList<>();
	ArrayList<Faculty> facultyList = new ArrayList<>();
	ArrayList<Course> courseList = new ArrayList<>();
	ArrayList<University> university = new ArrayList<>();
	
		
		
	public void add() {
			
		int choiceAdd;
		Scanner sc = new Scanner(System.in);
		System.out.println("1 : Add a student");
		System.out.println("2 : Add a faculty");
		System.out.println("3 : Add a course");
		System.out.println("Make your choice");
		choiceAdd = sc.nextInt();
		switch(choiceAdd) {
				
			case 1: //add a student
					Student S = new Student();
					S.addDetails();
					//S.dispDetails();
					// add this object to student array
					studentList.add(S);
					break;
			
			case 2:	//add a faculty
					Faculty F = new Faculty();
					F.addDetails();
					//F.dispDetails();
					//add this object to faculty array
					facultyList.add(F);
					
					
					break;
					
			case 3: //add a course
				Course c = new Course();
				c.addCourse();
				courseList.add(c);
					
					/*for(Course course :courseList)
						course.dispDetails();*/
					
			}
			
		}
		public void delete() {
			
			int choiceDelete;
			Scanner sc = new Scanner(System.in);
			System.out.println("1 : Delete a student");
			System.out.println("2 : Delete a faculty");
			System.out.println("3 : Delete a course");
			System.out.println("Make your choice");
			choiceDelete = sc.nextInt();
			switch(choiceDelete) {
				
			case 1: //Delete a student
					System.out.println("Enter the Id of the student to be deleted");
					int studId =sc.nextInt();
					for(Student s: studentList)
					{
						if(s.Id==studId) {
							studentList.remove(s);
						}
					}
					
					//to print
					for(Student student :studentList)
						student.dispDetails();
					
					break;
			
			case 2:	//Delete a faculty
					System.out.println("Enter the Id of the faculty to be deleted");
					int facId =sc.nextInt();
					for(Faculty f: facultyList)
					{
						if(f.Id==facId) {
							facultyList.remove(f);
						}
					}
				
					//to print
					for(Faculty faculty :facultyList)
						faculty.dispDetails();
				
					break;
					
			case 3: //Delete a course
					System.out.println("Enter the Id of the course to be deleted");
					String crId =sc.next();
					for(Course c: courseList)
					{
						if(Objects.equals(crId, c.Id)) {
							courseList.remove(c);
						}
					}
					
					for(Course course :courseList)
						course.dispDetails();
					break;
					
					
					
			}
			
		}
		
		public static void main(String[] args) {
			
			University ktu = new University();
			boolean more = true;
			int choice;
			Scanner sc = new Scanner(System.in);
			
			
			
			while (more) {
				
				
				System.out.println("1 : Add");
				System.out.println("2 : Delete");
				System.out.println("3 : Update");
				System.out.println("4 : Print");
				System.out.println("5 : Search");
				System.out.println("Make your choice");
				choice = sc.nextInt();
				
				switch(choice) {
				
				case 1: // add
						ktu.add();
						break;
				case 2: //delete
						ktu.delete();
						break;
				case 4: //print
						ktu.print();
						break;
				}
				
			}	
		}
		private void print() {
			// TODO Auto-generated method stub
			
		}

}
		



