package Browser_Exercise_2;

import java.util.ArrayList;

public class Firefox extends NewBrowser implements MultipleAccountContainers {
	static ArrayList<String> container=new ArrayList<>();
	//String[] container=new String[10];
	//String[] updatedcontainer=new String[container.length-1];
	
	
	public Firefox() {}
	
	public Firefox(String[] fox) {
		super(fox);
		}
	
	public void whoAMI() {
		System.out.println("I am Firefox");
		
	}

	public void addcontainer(String x) {
		
			container.add(x);
		}
		



	public void leavecontainer(String y) {
		
		container.remove(y);
			}
		
		
	

	public ArrayList<String> viewAllContainers() {
		return(container);
		}
	}
	
	

