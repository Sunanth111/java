package Browser_Exercise_2;

import java.util.ArrayList;
import java.util.Scanner;


public class NewBrowser {
	private static String[] visitedURLs=new String[10];
	
	public NewBrowser() {}
	
	public NewBrowser(String[] URLs) {
		int j=0;
		for(int i=0;i<visitedURLs.length;i++) {
			if (j==URLs.length) break;
			if(visitedURLs[i]==null){
				visitedURLs[i]=URLs[j];
				j++;
			}
		}
	}
	
	public void whoAMI() {
		//System.out.println("show the browser true/false");
		Scanner sc=new Scanner(System.in);
		 //boolean b=sc.nextBoolean();
		 System.out.println("1 :choose browser one");
		 System.out.println("2 :choose browser two");
		 int choice=sc.nextInt();
		 switch (choice) {
		case 1:
			NewBrowser firstBrow=new Chrome();
			firstBrow.whoAMI();
			break;

		case 2:
			NewBrowser secondBrow=new Firefox();
			secondBrow.whoAMI();
		}
		 
		
		
		;

		
	}
	
	public void displayVersionNumber() {
		
		Chrome chromeBrow=new Chrome();
		chromeBrow.VersionNumber();
		
		
	}
	
	
	public void SetPermissions() {
		Scanner sc=new Scanner(System.in);
		Chrome Setchrome=new Chrome();
		System.out.println("set all the permission true/false");
		boolean m=sc.nextBoolean();
		if(m) {
			System.out.println("set location accessible true /fasle");
			boolean x=sc.nextBoolean();
			
			System.out.println("set camera accessible true /fasle");
			boolean y=sc.nextBoolean();
			
			System.out.println("set microphone accessible true /fasle");
			boolean z=sc.nextBoolean();
			
		Setchrome.permissions(x,y,z);
		}
		else {
				System.out.println("set the permission true/false");
				boolean l=sc.nextBoolean();
				Setchrome.permissions(l);
				
		}
	}
	
	private void display() {
		for(int i=0;i<visitedURLs.length;i++) {
			if(visitedURLs[i] != null) {
			System.out.println(visitedURLs[i]);
			}
		}
	}
		
	public void whoAMI1() {
		System.out.println("I am a Browser");	
	}
		
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	private void newbrow() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
				
		System.out.println("enter the number of urls");
		Scanner sc=new Scanner(System.in);
		int y=sc.nextInt();
		String[] sites= new String[y];
		System.out.println(sites.length);
		sc.nextLine();
		for(int i=0;i<sites.length;i++) {
			sites[i]=sc.nextLine();
			//System.out.println(i);
		}
		NewBrowser mybrow=new NewBrowser(sites);
		//BrowserNew ourbrow=new Firefox(sites);
		mybrow.display();

		System.out.println("wanna know who am i? true/false");
		boolean d=sc.nextBoolean();
		if(d) {
			mybrow.whoAMI1();
		}
		
		System.out.println("To see the Browser true/false ");
		boolean c=sc.nextBoolean();
		if(c) {
			mybrow.whoAMI();
		}
		
		
		System.out.println("To see the Version number of chrome true/false");
		boolean x=sc.nextBoolean();
		if(x) {
			mybrow.displayVersionNumber();
		}
		
		
		System.out.println("To set Permissions true/false");
		boolean h=sc.nextBoolean();
		if(h) {
			mybrow.SetPermissions();
		}
		
		
		
		NewBrowser tabOne = new Chrome(); 
		NewBrowser tabTwo = new Firefox();
		NewBrowser tabThree = new Firefox(); 
		NewBrowser tabFour = new Chrome(); 
		NewBrowser tabFive = new Chrome();
		NewBrowser[] allBrowsers = new NewBrowser[] {tabOne,tabTwo,tabThree,tabFour,tabFive};
		
		int i=0;
		int count=0;
		for(i=0;i<allBrowsers.length;i++) {
			if(allBrowsers[i] instanceof Chrome) {
				 count++;
			}
			
		}
		System.out.println("no of chrome tabs is:"+count);
		
		
		
		
		 Firefox browser= new Firefox();
		 browser.addcontainer("facebookcontainer");
		 browser.addcontainer("Mails");
		 browser.addcontainer("PrivateBrowsing");
		 ArrayList<String>containers =new ArrayList<>();
		 System.out.println("to view the container true /false");
		 boolean z=sc.nextBoolean();
		 if(z) {
		 containers = browser.viewAllContainers(); 
		 for (String s:containers) {
			 System.out.println(s);
		 }
		 }
		 System.out.println("delete an element true /false");	
		 boolean o=sc.nextBoolean();
		 if(o) {
		 browser.leavecontainer("PrivateBrowsing"); //delete given container
		 System.out.println("deleted");
		 }
		 System.out.println("view the updated the container true/false");
		 boolean w=sc.nextBoolean();
		 if(w) {
		 containers = browser.viewAllContainers(); 
		  for (String s:containers) {
				 System.out.println(s);
		  }
		  }
		  
		 
		
	}
	
		
	


}
