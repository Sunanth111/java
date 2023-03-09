package Exercise5;


 interface shortcut{
	
	 void Scut(); 
		 	
}


class browser{
	
static String history="www.fb.com";
	
	static class innerclass{
		void history() {
			System.out.println("History:"+ history);
		}
	}
	String[] str=new String[10];
	
	class bookmark{
		
		void newbookmark() {
			System.out.println("add a bookmark");
		}	
	}
}
 


