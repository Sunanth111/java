package Exercise7;
import java.util.*;


class BrowserHistory{
	List<String>arraylisturls = new ArrayList<String>();
	List<String>linkedlisturls = new LinkedList<String>();
	
	Set<String>hashseturls = new HashSet<String>();
	Set<String>linkedhashseturls = new LinkedHashSet<String>();
	Set<String>treeseturls = new TreeSet<String>();
	

	void visit(String url) {
		
		try {
			
			if(url.endsWith(".com")||url.endsWith(".in")||url.endsWith(".org")) {
		
				arraylisturls.add(url);
				linkedlisturls.add(url);
		
				hashseturls.add(url);
				linkedhashseturls.add(url);
				treeseturls.add(url);
			}
			else {
				throw new InvalidURLException("Invalid url extension");
			}
		}catch(InvalidURLException e) {
			System.out.println(e);
		}
		
	}
	
	void sort() {
		Collections.sort(arraylisturls);
		System.out.println("Sorted Arraylist"+arraylisturls);
		Collections.sort(linkedlisturls);
		System.out.println("Sorted Linkedlist"+linkedlisturls);
		
		
		TreeSet<String>sortedset=new TreeSet<>(hashseturls);
		System.out.println("Sorted set"+sortedset);
		
		List<String>sortedLinkedhashseturls = new ArrayList<String>(linkedhashseturls);
		Collections.sort(sortedLinkedhashseturls);
		System.out.print(sortedLinkedhashseturls);
		
		System.out.println("sorted treeset");
		System.out.println(treeseturls);
		
		
	}
	
	
	void delete(int idx){
		
		try {
			String url=arraylisturls.get(idx);
		
			arraylisturls.remove(idx);
			System.out.println(arraylisturls);
		
			linkedlisturls.remove(idx);
			System.out.println(linkedlisturls);
		
			hashseturls.remove(url);
			System.out.println(hashseturls);
		
			linkedhashseturls.remove(url);
			System.out.println(linkedhashseturls);
		
			treeseturls.remove(url);
			System.out.println(treeseturls);
			
		}catch(IndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
	
	void deleteurl(String url) {
		try {
			arraylisturls.remove(url);
			System.out.println(arraylisturls);
		
			linkedlisturls.remove(url);
			System.out.println(linkedlisturls);
		
			hashseturls.remove(url);
			System.out.println(hashseturls);
		
			linkedhashseturls.remove(url);
			System.out.println(linkedhashseturls);
		
			treeseturls.remove(url);
			System.out.println(treeseturls);
		
			throw new InvalidURLException("Invalid url ");
		
		}catch(InvalidURLException e) {
			System.out.println(e);
		}
		
	}
	
	void fetchHistory() {
		Iterator<String> it = arraylisturls.iterator();
		while(it.hasNext());{
			System.out.println(it.next());
		}
		
		System.out.println(linkedlisturls);
		
		Iterator<String>itr=hashseturls.iterator();
		itr.forEachRemaining(a->
		{
		    System.out.println(a); 
		});
		
		System.out.println(linkedhashseturls);
		System.out.println(treeseturls);
				
	}
	
	void search(String extension) {
		arraylisturls.forEach(a->{
			if(a.endsWith(extension)) {
				System.out.println(a);
			}
		});
		
		linkedlisturls.forEach(a->{
			if(a.endsWith(extension)) {
				System.out.println(a);
			}
		});
		
		hashseturls.forEach(a->{
			if(a.endsWith(extension)) {
				System.out.println(a);
			}
		});
		linkedhashseturls.forEach(a->{
			if(a.endsWith(extension)) {
				System.out.println(a);
			}
		});
		treeseturls.forEach(a->{
			if(a.endsWith(extension)) {
				System.out.println(a);
			}
		});
		
		
	}
	
	void size() {
		System.out.println(arraylisturls.size());
		System.out.println(linkedlisturls.size());
		
		System.out.println(hashseturls.size());
		System.out.println(linkedhashseturls.size());
		System.out.println(treeseturls.size());
	}
	
	void updateHistory(int idx,String url) {
		
		String oldurl = linkedlisturls.get(idx);
		
		arraylisturls.set(idx, url);
		linkedlisturls.set(idx, url);
		
	String[] hasharr= hashseturls.toArray(new String[hashseturls.size()]);
	hasharr[idx]=url;
	hashseturls.clear();
	Collections.addAll(hashseturls, hasharr);
	System.out.println(hashseturls);
	
	
	linkedhashseturls.remove(oldurl);
	linkedhashseturls.add(url);
	System.out.println(linkedhashseturls);
	
	treeseturls.remove(oldurl);
	treeseturls.add(url);
	System.out.println(treeseturls);
	
	}
	
}




