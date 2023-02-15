package pract2;

class Bank {
	int GetIntrest() {return(0);
		
	}
}

class SBI extends Bank{
	int GetIntrest() {return(7);}
}

class ICCI extends Bank{
	int GetIntrest() {return(8);}
}

class BOB extends Bank{
	int GetIntrest() {return(5);}
}
public class BankRate {

	public static void main(String[] args) {
		SBI s=new SBI();
		ICCI i=new ICCI();
		BOB b=new BOB();
		System.out.println("SBI rate of intrest is "+s.GetIntrest());
		System.out.println("ICCI rate of intrest is "+i.GetIntrest());
		System.out.println("BOB rate of intrest is "+b.GetIntrest());
	}

}
