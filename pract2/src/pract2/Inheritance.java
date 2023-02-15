package pract2;
class Base{
	int x;
	static int y;
	private int z;
	void method(){
		System.out.println("Hello Mace");
	}
	static void staticmethod() {
		System.out.println("hey,This is static  ");
	}
}
class Derived extends Base{
	
}
public class Inheritance {

	public static void main(String[] args) {
		Derived der=new Derived();
		der.method();
		der.staticmethod();

	}

}
