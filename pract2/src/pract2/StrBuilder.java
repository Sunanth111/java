package pract2;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StrBuilder {
	
	public static void main(String args[]) {
		
		StringBuilder s1=new StringBuilder("hello");
		StringBuilder s2=new StringBuilder("world");
		StringBuilder s=s1.append(s2);
		
		System.out.println(s.toString());
		
		
		
		
		//using format() method
		
		  String s3 = new String("Hello");    //String 1  
	      String s4 = new String(" World");    //String 2  
	      String p = String.format("%s%s",s3,s4);   //String 3 to store the result  
          System.out.println(p.toString());  //Displays result 
          
          
          
          
          
        //using join()  method
          
          String s5 = new String("Hello");    //String 1  
          String s6 = new String(" Zoho");    //String 2  
          String q = String.join("",s5,s6);   //String 3 to store the result  
              System.out.println(q.toString());  //Displays result 
              
              
              
              
         //concatanation using string joiner class
              
              StringJoiner r = new StringJoiner(" ");   //StringeJoiner object  
              r.add("Welcome to");    //String 1   
              r.add("Ooty");    //String 2  
              System.out.println(r.toString());  //Displays result  
              
              
              
              // String concatenation using Collectors.joining() method 
              
              List<String> liststr = Arrays.asList("abc", "pqr", "xyz"); //List of String array  
              String str = liststr.stream().collect(Collectors.joining(", ")); //performs joining operation  
                  System.out.println(str.toString());  //Displays result  
	}

}
