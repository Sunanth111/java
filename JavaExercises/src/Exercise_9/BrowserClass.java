package Exercise_9;

import java.util.ArrayList;
import java.util.Iterator;


public  class BrowserClass {

static ArrayList<String> History = new ArrayList<>();
Iterator itr = History.iterator();

public void addHistory(String urls) {
	History.add(urls);
}

 public void dispaly() {
	
	while (itr.hasNext()){
		System.out.println(itr.next());
	}
}
 public void delete() {
	//int i=0;
	//synchronized (History) {
		
	
	int p=History.size();
	for(int i=0;i<p;i++) {
		History.remove(0);
		System.out.println(History);
	}
	
	
}

}
