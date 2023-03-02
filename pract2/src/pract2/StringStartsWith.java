package pract2;

public class StringStartsWith {

	public static void main(String[] args) {  
		 String s="Sachin";    
		 System.out.println(s.startsWith("Sach"));//true    
		 System.out.println(s.endsWith("in"));//true    
		  

	
	
	
	//Java String charAt() Method
	
		String p="Sachin";    
		System.out.println(p.charAt(0));//S    
		System.out.println(p.charAt(3));//h  
		
		
		
		//Java String length() Method
		
		String q="Sunanth";
		System.out.println(q.length());

		
		
		//Java String valueOf() Method
		
		int a=10;
		String r=String.valueOf(a);
		System.out.println(1+2+r+10);
		
		
		
		//Java String replace() Method

		String s1="Java is a programming language. Java is a platform. Java is an Island.";      
		String replaceString=s1.replace("Java","Kava");//replaces all occurrences of "Java" to "Kava"      
		System.out.println(replaceString);   
		
		
		
	}
}
