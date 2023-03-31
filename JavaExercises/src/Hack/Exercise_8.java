package Hack;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Scanner;

class Hacker {
	List<String>list;
	
	
	void gethistory() {	
	 //System.out.println(BrowserHistory.historyurl);
	
	}	
	
	public void write() {
		
		try {
			FileOutputStream fout = new FileOutputStream("newHistory.txt");
		
			for(String i :BrowserHistory.historyurl) {
				byte b[] =i.getBytes();
				fout.write(b);	
			}
			System.out.println("success...");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void read() throws Exception {
		try {
		FileInputStream fin = new FileInputStream("newHistory.txt");
	    int i=0;    
        while((i=fin.read())!=-1){    
         System.out.print((char)i);    
        }    
        fin.close(); 
        System.out.println();
        System.out.println("success...");
      }catch(Exception e){System.out.println(e);}    
	}
	
	
	public void modify(String url) throws Exception {
		
		FileWriter writer = new FileWriter("newHistory.txt",true);  
		BufferedWriter buffer = new BufferedWriter(writer);  
	    buffer.append("\n"+url); 
	    BrowserHistory.historyurl.add(url);
	    buffer.flush();
	    buffer.close();
	    System.out.println("Success");  

		
	}
}
public class Exercise_8 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BrowserHistory obj = new BrowserHistory();
		Hacker obj2 = new Hacker();
		
		
		while(true) {
			
				System.out.println("Choose the Option \n"
							+"1: Visit \n"
							+"2: do file operations \n"
						
						+"3: perform file write\n"
						+"4: perform file read\n"
						+"5:perform file modification"
						);
			
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
		
				//System.out.println("enter the url");
				obj.addurl();
				continue;
				
			case 2:
				obj2.gethistory();
				continue;
			case 3:
				obj2.write();
				continue;
			case 4:
				obj2.read();
				continue;
			case 5:
				System.out.println("enter the url");
				String url = sc.next();
				obj2.modify(url);
				
				
		

		
			}
		}
	}

}
