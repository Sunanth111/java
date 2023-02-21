package javaexercises;

import java.util.Scanner;

public class Person {
	
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



