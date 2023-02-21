package javaexercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Set;

class Student extends Person{
	 int Id;
	 double cgpa;
	static String course;
	static ArrayList<Student> studentCourseList= new ArrayList<Student>();
	static Map<String, String> map=new HashMap<String,String>();

	
	public void addDetails() {
		
		super.addDetails();
		
		System.out.println("Enter StudentId:");
		Id=sc.nextInt();
		
		System.out.println("Enter Student Cgpa:");
		cgpa=sc.nextDouble();
	}
	
	
	
	
	
	public static ArrayList<Student> registerCourse(String x,String y) {
//		String choice=y;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("1 : Delete a student");
//		System.out.println("2 : Delete a faculty");
//		System.out.println("3 : Delete a course");
//		System.out.println("Make your choice");
//		//choiceDelete = sc.nextInt();
//		switch(choice) {
//				
		
		//ArrayList<String>studentCourseList =new ArrayList<>();
		Student st=new Student();
		st.name=x;
		st.course=y;
		studentCourseList.add(st);
		return(studentCourseList);
	}
		
	/*	System.out.println("course register");
		//Course c=new Course();
		System.out.println("view course true/fals");
		boolean now=sc.nextBoolean();
		if(now) {
			
			Student st= new Student();
			
			if(c.coursetitle==null) {
				System.out.println("no course added");
			}
			

			else {
			System.out.println(c.coursetitle);
			System.out.println("choose the course");
			String title=sc.next();
		}
		}
			
	} */
	
	/*public static Map<String, String> registerCourse(String x,String y) {
		 Map<String, String> map=new HashMap<String,String>();
		 map.put(x, y);
		 map.put("John Kevin", "Average"); 
         map.put("Rakesh Sharma", "Good"); 
	     map.put("Prachi D", "Very Good"); 
	     map.put("Ivan Jose", "Very Bad"); 
	     map.put("Smith Jacob", "Very Good"); 
	     map.put("Anjali N", "Bad"); 
	     
		 for(Map.Entry<String,String>m:map.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue()); 
		 }
		 return(map);
		
	}

		 
		 
/*
		

		//Getting Set of entries from HashMap 
		                  
		 Set<Entry<String, String>> entrySet = map.entrySet(); 
		                  
		//Creating an ArrayList of Entry objects 
		                  
		 ArrayList<Entry<String, String>> studentCourseList = new ArrayList<Entry<String, String>>(entrySet);


		 for (Entry<String, String> entry : studentCourseList) 
	        { 
	            System.out.println(entry.getKey()+" : "+entry.getValue()); 
	        } 
		}
		
		
	*/
//	public static void studenCoursetList(Map<String, String>map) {
//		System.out.println("hi");
//
//		//Getting Set of entries from HashMap 
//		map.put("John Kevin", "Average"); 
//		                  
//		 Set<Entry<String, String>> entrySet = map.entrySet(); 
//		                  
//		//Creating an ArrayList of Entry objects 
//		                  
//		 ArrayList<Entry<String, String>> studentCourseList = new ArrayList<Entry<String, String>>(entrySet);
//
//
//		 for (Entry<String, String> entry : studentCourseList) 
//	        { 
//	            System.out.println(entry.getKey()+" : "+entry.getValue()); 
//	        } 
//		}
	
	
	
	
	public void printDetails() {
		for (Student st:studentCourseList) {
		      System.out.println(st.name+" : "+st.course);
		      
		}
	}
	
	
	public void dispDetails() {
		super.dispDetails();
		
		System.out.println(Id);
		System.out.println(cgpa);
		
	}
}