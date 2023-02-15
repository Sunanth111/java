package pract2;
class Adder{
	static int add(int a,int b) {return a+b;}
	static double add(double a,double b) {return a+b;}
}
public class overloading {

	public static void main(String[] args) {
		System.out.println(Adder.add(11,20));
		System.out.println(Adder.add(2.5,7.9));
	}

}
