package pract2;

import java.util.Scanner;


public class input {
	
	static int[] myarray=new int[4];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		for(int i = 0;i<4;i++) {
			System.out.println("enter input: ");
			//System.out.println(input.nextInt() );
			myarray[i]=in.nextInt();
			
		}
		in.close();
					
		for (int i : myarray)
			System.out.print(i + " ");
	

	}
}
