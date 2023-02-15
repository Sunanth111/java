package pract2;

class A{
	A(){
		System.out.println("print A");
	}
}
class B extends A{
	B(){
		System.out.println("print B");
	}
}
class C extends B{
	C(){
		System.out.println("print C");
	}
}
public class constructor {

	public static void main(String[] args) {
		C ref=new C();

	}

}
