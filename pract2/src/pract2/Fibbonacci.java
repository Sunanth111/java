package pract2;

import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number limit");
		int a= sc.nextInt();
		sc.close();
		fibonacci(a);

	}
	
	static void fibonacci(int f) {
		int x=1, y=0, z=0,count=1;
		while(count<=f) {
			System.out.print(z+" ");
			z=x+y;
			x=y;
			y=z;
			count++;
		}
	}

}
