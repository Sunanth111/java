package pract2;

import java.util.Scanner;

public class Browser {
	
	private static String[] visitedURLs=new String[10];
	public Browser() {
		
	}
	public Browser(String[] URLs) {
		int j=0;
		for(int i=0;i<visitedURLs.length;i++) {
			if (j==URLs.length) break;
			if(visitedURLs[i]==null){
				visitedURLs[i]=URLs[j];
				j++;
				continue;
					
			}
		}
	}
	public void display() {
		for(int i=0;i<visitedURLs.length;i++) {
			System.out.println(visitedURLs[i]);
		}
	}
}
class URLs{
	
	public static void main(String[] args) {
		String[] sites= new String[3];
		String[] webs= new String[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<sites.length;i++) {
			sites[i]=sc.nextLine();
		}
		for(int i=0;i<webs.length;i++) {
			webs[i]=sc.nextLine();
		}
		
		sc.close();
		Browser mybrow=new Browser(sites);
		Browser my=new Browser(webs);
		mybrow.display();
		my.display();
		
	}
}





