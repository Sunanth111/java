package pract2;

public class Downcasting {}
	
	class cast extends Downcasting{
		static void method(Downcasting a) {
			if(a instanceof cast) {
				cast c=(cast)a;
				System.out.println("downcasting done");
				
			}
		}
		
	public static void main(String[] args) {
		Downcasting a=new cast();
		cast.method(a);
		
		
	}

}
