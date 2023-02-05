package pract2;

import java.util.Scanner;

public class Vehicles {
	int year;
	String name;
	String model;
	
	
	public Vehicles() {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter vehicle year");
		year=sc.nextInt();
		System.out.print("enter vehicle name");
		name=sc.next();
		System.out.print("enter vehicle model");
		model=sc.next();
	}
	
	
	void Details() {
		System.out.print("Name:"+ name+"Year:"+ year+"Model:"+ model);
	}
}
	
	
class VehicleDetails{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicles myvehicle=new Vehicles();
		myvehicle.Details();

	}

}
