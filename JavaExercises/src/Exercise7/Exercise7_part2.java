package Exercise7;

import java.util.*;

class BrowserHistoryMap {
	Map<String,List<String>> hashMap= new HashMap<>();
	Map<String,List<String>> linkedhashMap= new LinkedHashMap<>();
	Map<String,List<String>> treeMap= new TreeMap<>();
	
	void Mapurls(String urls) {
		
		
		StringTokenizer tokens = new StringTokenizer(urls,".");
		String extension=tokens.nextToken();
		while(tokens.hasMoreTokens()) {
			 extension=tokens.nextToken();
		}
		addtoMap(extension,urls,hashMap);
		addtoMap(extension, urls, linkedhashMap);
		addtoMap(extension, urls, treeMap);
		
	}
	
	
	private void addtoMap(String extension, String urls, Map<String, List<String>> map) {
		
		if(!map.containsKey(extension)) {
			map.put(extension, new ArrayList<String>());
		}
		map.get(extension).add(urls);
		
	}


	void deleteHistory(String delextension) {
		
		hashMap.remove(delextension);
		linkedhashMap.remove(delextension);
		treeMap.remove(delextension);
		
	}
	
	void size(String sizeExtension) {
		System.out.println(hashMap.get(sizeExtension).size());
	}
	
	
	void search(String search) {
		Set keyset= hashMap.entrySet();
		for (Map.Entry<String,List<String>> m:hashMap.entrySet()){
			//ArrayList<String> list = new ArrayList<>(m.getValue());
		
			for(String n:(m.getValue())) {

				if(n.contains(search))	;
		
				System.out.println(n);
			}
		
		
		}
	}
	
}
public  class Exercise7_part2 {
	

	public static void main(String[] args) {
		
		BrowserHistoryMap tab = new BrowserHistoryMap();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Choose the option \n"
					+"1:visit the urls to add to map \n"
					+"2:delete any key \n"
					+"3:size of the url list \n"
					+"4:search the url"
					);
		
			int Choose = sc.nextInt();
		
			switch(Choose) {
		
			case 1:
				System.out.println("enter the url");
				String url = sc.next();
				tab.Mapurls(url);
			
				continue;
			
			case 2:
				System.out.println("enter the extension to delete");
				String ext =sc.next();
				tab.deleteHistory(ext);
			
				continue;
			case 3:
				System.out.println("enter the extension to get size of the urls present");
				String size = sc.next();
				tab.size(size);
				
				continue;
			
			case 4:
				System.out.println("enter a word to search in the url");
				String search = sc.next();
				tab.search(search);
				
				continue;
				
			default:
				System.out.println("invalid input");
				continue;
			}
		
			
			
		}
		
	}

}

