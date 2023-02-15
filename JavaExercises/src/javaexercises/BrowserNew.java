package javaexercises;

import java.util.Scanner;


public class BrowserNew {
	private static String[] visitedURLs=new String[10];
	public BrowserNew() {}
	
	public BrowserNew(String[] URLs) {
		int j=0;
		for(int i=0;i<visitedURLs.length;i++) {
			if (j==URLs.length) break;
			if(visitedURLs[i]==null){
				visitedURLs[i]=URLs[j];
				j++;
			}
		}
	}
	public void addURLs(int x) {
		String[] addedsites= new String[x];
		System.out.println("enter the urls");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<addedsites.length;i++) {
			addedsites[i]=sc.nextLine();
		}
		BrowserNew added =new BrowserNew(addedsites);
		//added.display();
		
		
	}
		
	public void delURLs(int x) {
		for(int i=0;i<visitedURLs.length;i++) {
			if(i==x) {
				visitedURLs[i]=null;
			}
		}
	}
	
	public void serURLs(int x) {
		String spot = null;
		for(int i=0;i<visitedURLs.length;i++) {
			if(i==x) {
				spot=visitedURLs[i];
			}	
		}
		System.out.println(spot);
	}
	
	public void seridx(String x) {
		int idx;
		for(int i=0;i<visitedURLs.length;i++) {
			if(visitedURLs[i].equals(x)) {
				idx=i;
				System.out.println(idx);
			}
			//else if(i==visitedURLs.length) {
				//System.out.println("not found");
			
		}
		
	}
		

	public void display() {
		for(int i=0;i<visitedURLs.length;i++) {
			System.out.println(visitedURLs[i]);
		}
	}
	
class MyURLs{
	public static void main(String[] args) {
		
		String[] sites= new String[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<sites.length;i++) {
			sites[i]=sc.nextLine();
		}
		BrowserNew mybrow=new BrowserNew(sites);
		mybrow.display();
		
		
		while(true) {
		System.out.println("select the operation to be performed");
		System.out.println("choose 1 for addition");
		System.out.println("choose 2 for deletion");
		System.out.println("3 for spotting");
		System.out.println("4 for finding the index of url");
		int p;
		p=sc.nextInt();
		int m;
		int n;
		int l;
		String o;
		if(p>=1 & p<=4) {
			if(p==1) {
				System.out.println("add the number of urls");
				m=sc.nextInt();
				BrowserNew obj=new BrowserNew();
				obj.addURLs(m);
				obj.display();
			}
		
			else if(p==2) {
				System.out.println("enter the index of the url to be deleted");
				n=sc.nextInt();
				BrowserNew objdel=new BrowserNew();
				objdel.delURLs(n);
				objdel.display();
			}
			else if(p==3) {
				System.out.println("enter the index of the url to be spotted");
				l=sc.nextInt();
				BrowserNew objser=new BrowserNew();
				objser.serURLs(l);
			}
			else if(p==4) {
				System.out.println("enter the url, to spot the index position");
				o=sc.next();
				BrowserNew objidx=new BrowserNew();
				objidx.seridx(o);
			}
			else {
				System.out.println("chosen the wrong command");
			}
		}
	}
}
}
}


	



