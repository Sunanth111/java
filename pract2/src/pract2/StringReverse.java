package pract2;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the text");
		String text= sc.nextLine();
		sc.close();
		
		String rev=reversestring(text);
		System.out.println(rev);

	}
	
	static String reversestring(String p) {
		String[] words = p.split(" ");
		String revstrings="";
		for(String word:words) {
			StringBuilder sb= new StringBuilder(word);
			revstrings=revstrings+ sb.reverse()+" ";
		}
		return revstrings;
	}

}
