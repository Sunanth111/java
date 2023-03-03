package Exercise_4;

import java.util.StringTokenizer;

public class Browser {
	
	public static String[] Browserhistory=new String[10];

	public void setHistory(String urls) {
		
		for(int i=0;i<Browserhistory.length;i++) {
			
			if(Browserhistory[i]==null) 
				continue;
			
			
			StringTokenizer st=new StringTokenizer(Browserhistory[i]," ## ");
			
			String site=st.nextToken();
			
			if(site.equals(urls)) {
				String freq = st.nextToken();									// here freq contains the number of visits 
				int frequency = Integer.parseInt(freq);
				frequency++;
				Browserhistory[i] = site + " ## " + frequency;
				return;
			}
		}
		
		for (int i = 0; i < Browserhistory.length; i++) {
			
			if(Browserhistory[i] == null) {
				Browserhistory[i] = urls + " ## " + 1;
				break;
			}
			
			
		}
		
		
	}

}
