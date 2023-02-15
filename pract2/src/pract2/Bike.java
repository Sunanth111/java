	package pract2;

public class Bike { 
		  final void run(){System.out.println("running");}  
		}  
		     
		class Honda extends Bike{  
		   void run(){System.out.println("running safely with 100kmph");}  //cannot override final method
		     
		   public static void main(String args[]){  
		   Honda honda= new Honda();  
		   honda.run();  
		   }  
		}  

	
//final class cannot be extended
//final variable cannot be modified
