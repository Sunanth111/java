package pract2;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number");
		int a= sc.nextInt();
		sc.close();
		Factorial obj=new Factorial();
		int res=obj.factorial(a);
		System.out.println(res);
	}
	
	 int factorial(int x) {
		int fact=1;
		for(int i=2;i<=x;i++) {
			fact*=i;
		}
		return fact;
	}
	

}
