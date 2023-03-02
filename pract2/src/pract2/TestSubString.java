package pract2;

import java.util.Arrays;

public class TestSubString {

	public static void main(String[] args) {
		
		String s = "SachinTendulkar";
		System.out.println("orginal string:"+s);
		System.out.println("Substring starting from index 6: " +s.substring(6));//Tendulkar    
		System.out.println("Substring starting from index 0 to 6: "+s.substring(0,6)); //Sachin  
		
		
		
		
		//Using String.split() method:
		
		String text= new String("Hello, My name is Sachin");  
        /* Splits the sentence by the delimeter passed as an argument */  
        String[] sentences = text.split(",");  
        System.out.println(Arrays.toString(sentences));  
		
		

	}

}
