package Exercise7;

import java.util.*;


public class Test {

	public static void main(String[] args) {
		
		BrowserHistory tab = new BrowserHistory();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Choose the Option \n"
						+"1:Visit \n"
						+"2:Sort \n"
						+"3:Delete \n"
						+"4:DeleteUrl \n"
						+"5:Search \n"
						+"6:Show History \n"
						+"7:show size \n"
						+"8:Update History \n"
						+"9:Use exit to quit \n"
						);
			
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("enter the url to vist");
				String url = sc.next();
				tab.visit(url);
				continue;
				
			case 2:
				//System.out.println("want to sorth the urls yes/no?");
				//String sort = sc.next();
				//if(sort=="yes") {
				tab.sort();
				//}
				continue;
				
			case 3:
				System.out.println("enter the index to delete");
				int idx = sc.nextInt();
				tab.delete(idx);
				continue;
				
			case 4:
				System.out.println("enter the url to delete");
				String site = sc.next();
				tab.deleteurl(site);
				continue;
				
				
			case 5:
				System.out.println("enter the String exension");
				String ext = sc.next();
				tab.search(ext);
				continue;
				
			case 6:
				System.out.println("Show History yes/no?");
				String history = sc.next();
				if(history=="yes") {
					tab.fetchHistory();
				}
				continue;
				
			case 7:
				System.out.println("want the size ");
				tab.size();
				continue;
				
			case 8:
				System.out.println("enter the index to update");
				int indx = sc.nextInt();
				System.out.println("enter the String to update");
				String stri = sc.next();
				tab.updateHistory(indx, stri);
				continue;
				
			case 9:
				break;
				
			default:
				System.out.println("inavild entry");
				
				continue;
		
			}
			
			break;
		}

	}

}
