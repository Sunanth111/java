package Exercise_9;

import java.util.Scanner;

class ourThread extends Thread {

public void run() {
	BrowserClass dis = new BrowserClass();
	synchronized (dis) {
	dis.dispaly();
	}
}

}

class MyThread extends Thread{
	public void run() {
		BrowserClass del = new BrowserClass();
		synchronized (del) {
			
		del.delete();
		}
		
	}
}

		


public class Exercise_9 {

	
	public static void main(String[] args) throws InterruptedException {
		BrowserClass obj = new BrowserClass();
		ourThread t1 = new ourThread();
		MyThread t2 = new MyThread();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("1:add the urls \n"
				+ "2:Perform thread operations");
		
		
		int Choice = sc.nextInt();
		switch(Choice) {
		
		case 1:
				String url = sc.next();
				obj.addHistory(url);
				continue;
			
		case 2:
			
		    t1.start();
			t1.join();
			t2.start();
			
		}
	  }
	}

}
