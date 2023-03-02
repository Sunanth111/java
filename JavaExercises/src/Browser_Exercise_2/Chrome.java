package Browser_Exercise_2;

import java.util.Scanner;

public class Chrome extends NewBrowser {
	
	
	boolean isLocationAccessible;
	boolean isCameraAccessible ;
	boolean isMicrophoneAccessible;
	
	final double versionNumber=1.0;
	
	public Chrome() {}
	
	public Chrome(String[] chrome) {
		//System.out.println("this ");
	super(chrome);
	}
	
	public void whoAMI() {
		System.out.println("I am GoogleChrome");
		
	}
	
	
	public void VersionNumber() {
		System.out.println("The version number of chrome is "+versionNumber);
	}
	
	
	
	
	public void permissions(boolean a,boolean b,boolean c) {
		
		isLocationAccessible=a;
		isCameraAccessible=b;
		isMicrophoneAccessible=c;
		
		System.out.println("The location access is:"+a);
		System.out.println("The Camera access is:"+b);
		System.out.println("The microphone access is:"+c);
		
	}
	
	public void permissions(boolean a) {
		Scanner sc =new Scanner(System.in);
		System.out.println("1: set the location");
		System.out.println("2: set the cammera");
		System.out.println("3: set the microphone");
		System.out.println("choose the option");
		int choice=sc.nextInt();
		
		switch(choice) {
		
		case 1:
			isLocationAccessible=a;
			System.out.println("The location access is:"+a);
			
			break;
			
		case 2:
			isCameraAccessible=a;
			System.out.println("The Camera access is:"+a);
			
			break;
			
		case 3:
			isMicrophoneAccessible=a;
			System.out.println("The microphone access is:"+a);
		}
			
	}

}
