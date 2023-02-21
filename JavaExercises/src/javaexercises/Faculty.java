package javaexercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Faculty extends Person{
	int Id;
	String facultyposition;
	static ArrayList<String> facultyCourseList= new ArrayList<String>();
	
	public void addDetails() {
		
		super.addDetails();
		
		System.out.println("Enter FacultyId:");
		Id=sc.nextInt();
		
		System.out.println("Enter faculty Position:");
		facultyposition=sc.next();
		
	}
	
	
	public static ArrayList<String> registerCourse(String x,String y) {
		
		facultyCourseList.add(x +" registered the Course "+ y);
		return(facultyCourseList);
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
}

