package Exercise6;
import java.util.ArrayList;
import java.util.Scanner;
class InvalidURLException extends Exception{
	
	public InvalidURLException(String str) {
		
		super(str);
		
	}
}

class NoHistoryFoundException extends Exception{
	public NoHistoryFoundException(String str) {
		super(str);
	}
}

class  InvalidPositionException extends Exception{
	public  InvalidPositionException (String str) {
		super(str);
	}
}

class BrowserHistory{
	

ArrayList<String>urlsList=new ArrayList<String>();
	void vist(String url) {
		
		try {
			if(url.endsWith(".com")||url.endsWith(".in")||url.endsWith(".org")){
				urlsList.add(url);
			}
			
			else {
				throw new InvalidURLException("Invalid url extension");
			}
			}catch(InvalidURLException e) {
				System.out.println(e);
			}
	}
	String back(int steps) {
		try {
			if(steps<=urlsList.size()) {
				System.out.println(urlsList.get(steps));
			}
			else {
				throw new NoHistoryFoundException("No History Found");
			}
			}catch(NoHistoryFoundException e) {
				System.out.println(e);
		}
		
		return null;
		
	}
	
	String forward(int steps) {
		
		try {
			if(steps<=urlsList.size()) {
				System.out.println(urlsList.get(steps));
			}
			else {
				throw new NoHistoryFoundException("No History Found");
			}
		}catch(NoHistoryFoundException e) {
			System.out.println(e);
		}
		return(null
				);
		
	}
	
	String get(int position) {
		try {
			if(position>urlsList.size()||position<0) {
				 throw new InvalidPositionException("Provide only positive values");
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch(InvalidPositionException e) {
			System.out.println(e);
		}
		return null;
		
	}
	
	
	
	
	
	
}
public class Exercise6 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		BrowserHistory obj=new BrowserHistory();
		
		 
		while(true) {
		
		System.out.println("1:visit the url");
		System.out.println("2:step back");
		System.out.println("3:step forward");
		System.out.println("4:get the url");
		System.out.println("5:Exit");
		System.out.println("choose the operation");
		
		int choice=sc.nextInt();
		
		switch(choice) {
		
		case 1:
			System.out.println("enter the url");
			String url=sc.next();
			obj.vist(url);
			
			continue;
			
			
		case 2:
			System.out.println("enter the step");
			int step=sc.nextInt();
			obj.back(step);
			continue;
			
			
		case 3:
			System.out.println("enter the step");
			int steps =sc.nextInt();
			obj.forward(steps);
			continue;
			
		case 4:
			System.out.println("enter the position");
			int position =sc.nextInt();
			obj.forward(position);
			continue;
			
		case 5:
			break;
			
		}
		break;
		

	}
	}

}
