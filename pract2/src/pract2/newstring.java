package pract2;

public class newstring {

	public static void main(String[] args) {
		String s1="java";
		char ch[] = {'s','u','n','a','n','t','h'};
		
		String s2=new String(ch); //converting the character array to string format
		
		String s3=new String("hello"); //creating java sting by new keyword
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
