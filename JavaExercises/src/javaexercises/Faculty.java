package javaexercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Faculty extends Person{
	int Id;
	static String course;
	String facultyposition;
	static ArrayList<Faculty> facultyCourseList= new ArrayList<Faculty>();
	
	public void addDetails() {
		
		super.addDetails();
		
		System.out.println("Enter FacultyId:");
		Id=sc.nextInt();
		
		System.out.println("Enter faculty Position:");
		facultyposition=sc.next();
		
	}
	
	
	public static ArrayList<Faculty> registerCourse(String x,String y) {
		
		
		
		Faculty fc=new Faculty();
		fc.name=x;
		fc.course=y;
		facultyCourseList.add(fc);
		return(facultyCourseList);
	
		
		//facultyCourseList.add(x +" registered the Course "+ y);

	}
		
		
//		 Map<String, String> map=new HashMap<String,String>();
//		 map.put(x, y);
//		/* map.put("John Kevin", "Average"); 
//        map.put("Rakesh Sharma", "Good"); 
//	     map.put("Prachi D", "Very Good"); 
//	     map.put("Ivan Jose", "Very Bad"); 
//	     map.put("Smith Jacob", "Very Good"); 
//	     map.put("Anjali N", "Bad"); 
//	     */
//		 for(Map.Entry<String,String>m:map.entrySet()){  
//			   System.out.println(m.getKey()+" "+m.getValue()); 
//		 }
//		return(map);
//	}
//	
	public void dispDetails() {
		super.dispDetails();
		System.out.println(Id);
		System.out.println(facultyposition);
		
		
	}
	public void printDetails() {
		for (Faculty fc:facultyCourseList) {
		      System.out.println(fc.name+" : "+fc.course);
		      
		}
	}
}

