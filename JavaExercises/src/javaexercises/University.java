package javaexercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

/*class {
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
}*/
/*class Student extends Person{
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
*/
/*
class Faculty extends Person{
	int Id;
	String facultyposition;
	
	public void addDetails() {
		
		super.addDetails();
		
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
*/
/*
class Course{
	Scanner sc=new Scanner(System.in);
	String Id;
	String coursetitle;
	double courseCredit;
	
	      //Course(String Id,String coursetitle,double courseCredit){
		  // this.Id=Id;
	     //	this.courseCredit=courseCredit;
	     	//this.coursetitle=coursetitle;
	    
		
		
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
	
}*/



public class University {
	
	static ArrayList<Student> studentList = new ArrayList<>();
	ArrayList<Faculty> facultyList = new ArrayList<>();
	ArrayList<Course> courseList = new ArrayList<>();
	ArrayList<University> university = new ArrayList<>();
	
	//Course c=new Course();
	//Map<String, String> hasmap=new HashMap<String,String>();

	ArrayList<Student> studentCourseList=new ArrayList<>();
	ArrayList<Faculty> facultyCourseList=new ArrayList<>();
	// Student S = new Student();
	//private static Map<String, String> studentmap;
	//private static Map<String, String> facultymap;
		
		
	public void add() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no individuals wanted to add");
		int count=sc.nextInt();
		int j=0;
		do {
		int choiceAdd;
		
		System.out.println("1 : Add a student");
		System.out.println("2 : Add a faculty");
		System.out.println("3 : Add a course");
		System.out.println("Make your choice");
		choiceAdd = sc.nextInt();
		switch(choiceAdd) {
				
			case 1: //add a student
					Student S = new Student();
					//Student St;
					int z=0;
					S.addDetails();
					//S.dispDetails();
					// add this object to student array
					studentList.add(S);
					System.out.println("Do course register");
					System.out.println(" true/false");
					boolean now=sc.nextBoolean();
					if(now) {
					System.out.println("no of courses to be registered");
					int x=sc.nextInt();
					
						
						
						//Course c=new Course();
						
						if(courseList.isEmpty()) {
							System.out.println("no course added");
						break;
						}
						else {
							for(Course course:courseList) {
								course.dispDetails();
							}
								
							do {
							System.out.println("choose the course");
							String title=sc.next();
						
							int i=0;
							studentCourseList=S.registerCourse(S.name,title);
						 i++;
						 z++;
						 System.out.println("successfully Registered");
						}while(z<x);
					
						break;
					}
					}
					break;
				
			
			case 2:	//add a faculty
					Faculty F = new Faculty();
					F.addDetails();
					//F.dispDetails();
					//add this object to faculty array
					facultyList.add(F);
					//System.out.println(facultyList);
					System.out.println("Do course register");
					//Course c=new Course();
					System.out.println("view course true/fals");
					boolean b=sc.nextBoolean();
					if(b) {
						
						
						//Course c=new Course();
						
						if(courseList.isEmpty()) {
							System.out.println("no course added");
						break;
						}
						else {
							for(Course course:courseList) {
								course.dispDetails();
							}
								
							//}
							System.out.println("choose the course");
							String title=sc.next();
						
							facultyCourseList=F.registerCourse(F.name,title);
							
						}
					break;
					}
					
			case 3: //add a course
				Course c = new Course();
				c.addCourse();
				courseList.add(c);
					
					/*for(Course course :courseList)
						course.dispDetails();*/
					
			}
		j++;
			
		}while( j<count);
		
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
						System.out.println("hi");
						studentList.remove(s);
						for(Student st: studentCourseList)
						{
							if(s.name==st.name)
								Student.studentCourseList.remove(st);
						}
				}	
				}
					
					//to print
				for(Student student :studentList)
					student.dispDetails();
				
				for(Student st:studentCourseList) {
					st.printDetails();;
				}
				
					
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
		
		
		public void print() {
			int choiceSelect;
			//Student st= new Student();
			Scanner sc = new Scanner(System.in);
			System.out.println("1 : Print a student");
			System.out.println("2 : Print a faculty");
			System.out.println("3 : Print a course");
			System.out.println("4 : Print a studentCourseList");
			System.out.println("5: Print facultyCourseList");
			System.out.println("Make your choice");
			choiceSelect = sc.nextInt();
			switch(choiceSelect) {
				
			case 1: //print a student
				   //to print
					for(Student student :studentList)
						student.dispDetails();
					
					break;
			
			case 2:	//print a faculty
					
					for(Faculty faculty :facultyList)
						faculty.dispDetails();
				
					break;
					
			case 3: //print a course
					for(Course course :courseList)
						course.dispDetails();
					break;
					
			case 4://print student course list
//				for (int i = 0; i < studentCourseList.size(); i++) {
//				      System.out.println(studentCourseList.get(i) + " ");

				
					Student st = new Student();
					//for(Student st:studentCourseList) {
						st.printDetails();
					//}
				//System.out.println(S.map);
					//S.studenCoursetList(S.map);
				/* 	Set<Entry<String, String>> entrySetStud = studentmap.entrySet(); 
					//Creating an ArrayList of Entry objects                
					ArrayList<Entry<String, String>> studentCourseList = new ArrayList<Entry<String, String>>(entrySetStud);
					for (Entry<String, String> entry : studentCourseList) 
				       { 
				           System.out.println(entry.getKey()+" : "+entry.getValue()); 
				       } */
					
					
			case 5:	//print faculty course list
				Faculty fc = new Faculty();
					fc.printDetails();
				
				
				
				//for(String f:facultyCourseList) {
					//System.out.println(f);
				}
				
		}
//				
//				Set<Entry<String, String>> entrySetFac = facultymap.entrySet(); 
//				//Creating an ArrayList of Entry objects                
//				ArrayList<Entry<String, String>> facultyCourseList = new ArrayList<Entry<String, String>>(entrySetFac);
//				for (Entry<String, String> entry : facultyCourseList) 
//			       { 
//			           System.out.println(entry.getKey()+" : "+entry.getValue()); 
//			       } 
//			}
//			
//		}
		public void search() {
			int choiceSelect;
			Scanner sc = new Scanner(System.in);
			System.out.println("1 : search a student");
			System.out.println("2 : search a faculty");
			System.out.println("3 : search a course");
			System.out.println("Make your choice");
			choiceSelect = sc.nextInt();
			switch(choiceSelect) {
				
			case 1: //search a student
				   //to search
					int choiceSel;
					System.out.println("1: Enter the Id of the student to be found");
					System.out.println("2: Enter the name of the student to be found");
					choiceSel = sc.nextInt();
					switch(choiceSel) {
					
					
					case 1:
							int studId =sc.nextInt();
							for(Student s: studentList)
							{
				
								if(s.Id==studId) {
									System.out.println(s.name + s.mobileNo+ s.email+ s.cgpa);
					
								}
							}
							break;
					case 2:
							String studname =sc.next();
							for(Student s: studentList)
							{
			
								if(s.name.equals(studname)) {
									System.out.println(s.Id + s.mobileNo+ s.email+ s.cgpa);
				
								}
							}
							break;
					}
					
					break;
			
			case 2:	int choiceNew;
			System.out.println("1: Enter the Id of the faculty to be found");
			System.out.println("2: Enter the name of the faculty to be found");
			choiceNew = sc.nextInt();
			switch(choiceNew) {
			
			
			case 1:
					int facId =sc.nextInt();
					for(Faculty f: facultyList)
					{
		
						if(f.Id==facId) {
							System.out.println(f.name + f.mobileNo+ f.email+ f.facultyposition);
			
						}
					}
					break;
			case 2:
					String facname =sc.next();
					for(Faculty f: facultyList)
					{
	
						if(f.name.equals(facname)) {
							System.out.println(f.Id + f.mobileNo+ f.email+ f.facultyposition);
		
						}
					}
					break;
			}
			
			break;
					
			case 3: 
				int choiceCouR;
				System.out.println("1: Enter the Id of the student to be found");
				System.out.println("2: Enter the name of the student to be found");
				choiceCouR = sc.nextInt();
				switch(choiceCouR) {
				
				
				case 1:
						String cId =sc.next();
						for(Course c: courseList)
						{
			
							if(c.Id.equals(cId)) {
								System.out.println(c.coursetitle + c.courseCredit);
				
							}
						}
						break;
				case 2:
					String cTitle =sc.next();
					for(Course c: courseList)
					{
		
						if(c.coursetitle.equals(cTitle)) {
							System.out.println(c.Id + c.courseCredit);
			
						}
					}
					break;
				}
				
				break;
					
					
					
			}
			
		}
		
/*		
		public void reg() {
			
			Scanner sc = new Scanner(System.in);
			System.out.println(" Enter the Id of the student");
			int choiceone=sc.nextInt();
			System.out.println(" Enter the true/false to view the courselist");
			boolean now=sc.nextBoolean();
			if(now) {
				for(Course c:courseList) {
					System.out.println(c.coursetitle);
				
			}
			
				System.out.println("select the course");
				String title=sc.next();
				S.registercourse
				
						
					}
				}
			
			
			}	
			
		}*/
			
		
		
		public static void main(String[] args) {
			
			University ktu = new University();
			boolean more = true;
			int choice;
			Scanner sc = new Scanner(System.in);
			
			
			
			while (more) {
				
				
				System.out.println("1 : Add");
				System.out.println("2 : Delete");
				System.out.println("3 : Search");
				System.out.println("4 : Print");
				//System.out.println("5 : register course");
				System.out.println("Make your choice");
				choice = sc.nextInt();
				
				switch(choice) {
				
				case 1: // add
						ktu.add();
						break;
				case 2: //delete
						ktu.delete();
						break;
				case 3: //search
					    ktu.search();
					    break;		
				case 4: //print
						ktu.print();
						break;
				//case 5://register
					//	ktu.reg();
						//break;
				}
				
			}	
		}
		

}
		



