import java.util.ArrayList;
import java.util.Scanner;

public class BrowserString {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		
		ArrayList<String> stringarray=new ArrayList<>();
		while(true) {
		
		System.out.println("enter the url");
		String s=sc.nextLine();
		
		stringarray.add(s);
		
		
		
		for(String i:stringarray) {
			int count=0;
			for(String j:stringarray) {
				if(i.equals(j)) {
				count=count+1;
				}
			}
			System.out.println(i+"##"+count);


		}

		}
	
	}
}
