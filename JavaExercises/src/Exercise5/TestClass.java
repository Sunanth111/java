package Exercise5;

//import Exercise5.browser.bookmark;

public class TestClass {

	public static void main(String[] args) {
		

		browser outerobj=new browser();
		browser.bookmark innerobj =outerobj.new bookmark();
		innerobj.newbookmark();
		
		
		
		shortcut obj =new shortcut() {
			@Override
			
			public void Scut() {
				System.out.println("this is the shortcut");
			}
		
		};
		obj.Scut(); 
		
		
		browser.innerclass staticinner=new browser.innerclass();
		staticinner.history();
		

	}

	

}
