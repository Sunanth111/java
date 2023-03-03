package Exercise_4;

public class Test {
	
	public static void main(String args[]) {
		
		Browser browser=new Browser();
		
		browser.setHistory("www.twitter.com");
		browser.setHistory("www.fb.com");
		browser.setHistory("www.twitter.com");
		browser.setHistory("www.google.com");
		browser.setHistory("www.fb.com");
		browser.setHistory("www.fb.com");
		
		for(int i = 0 ; i< Browser.Browserhistory.length;i++) {
			
			if(Browser.Browserhistory[i] != null)
				System.out.println(Browser.Browserhistory[i]);
		}
	}
	

}
