package pract2;

public class Tape {
	boolean canRecord = false;
	
	void playTape() {
		System.out.println("tape playing");
	}
	void recordTape() {
		System.out.println("tape recording");
		}
}
class TapeDeckTestDrive {
	public static void main(String [] args) {
		Tape t=new Tape();
		t.canRecord = true;
		t.playTape();
		if (t.canRecord == true) {
		t.recordTape();
		}
	}
}

	

