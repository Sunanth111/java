package pract2;

	//Example of an abstract class that has abstract and non-abstract methods  
	 abstract class Bikes{  
		 
	   Bikes(){System.out.println("bike is created");}  
	   
	   abstract void run();  
	   
	   void changeGear(){System.out.println("gear changed");}  
	 }  
	 
	//Creating a Child class which inherits Abstract class  
	 class Hondas extends Bikes{  
		 
	 void run(){System.out.println("running safely..");}  
	 }  
	 
	//Creating a Test class which calls abstract and non-abstract methods  
	 class TestAbstraction2{  
		 
	 public static void main(String args[]){  
		 
	  Hondas obj = new Hondas();  
	  obj.run();  
	  obj.changeGear();  
	 }  
}  


