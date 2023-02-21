package pract2;

//import java.nio.file.FileSystem;
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter first number");
		int a= sc.nextInt();
		int b=sc.nextInt();
		System.out.println("enter the operation to be performed");
		char op=sc.next().charAt(0);
		sc.close();
		
		int res=calculate(a,b,op);
		System.out.println(a+" "+op+" "+b+"="+res);

	}
	
	// method to perform calculation
	
	static int calculate(int x,int y,char operator) {
		int res=0;
		switch(operator){
		case'+':
			 res= x+y;
			break;
		case'-':
			res=x-y;
			break;
		case'*':
			res=x*y;
			break;
		case'/':
			res=x/y;
			break;
				
		}
		return res;
		
	}

}
