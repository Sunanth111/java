package javaexercises;

import java.util.Scanner;

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






