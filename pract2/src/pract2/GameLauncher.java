package pract2;
class GuessGame{
	void startGame() {
		player p1=new player();
		player p2=new player();
		player p3=new player();
		
		int guessp1;
		int guessp2;
		int guessp3;
		
		int targetNumber=(int) (Math.random()*10);
		
		while(true) {
			System.out.println("Number to guess is"+ targetNumber);
			
			p1.guess();
			p2.guess();
			p3.guess();
			
			guessp1=p1.number;
			System.out.println("player 1 guessed"+ guessp1);
			guessp2=p2.number;
			System.out.println("player 2 guessed"+ guessp2);
			guessp3=p3.number;
			System.out.println("player 3 guessed"+ guessp3);
			
			boolean p1isRight = false;
			boolean p2isRight = false;
			boolean p3isRight = false;
			
			if (guessp1 == targetNumber) {
				p1isRight = true;
			}
			if (guessp2 == targetNumber) {
				p2isRight = true;
			}
			if (guessp3 == targetNumber) {
				p3isRight = true;
			}
				
			if (p1isRight || p2isRight || p3isRight) {
				System.out.println("We have a winner!");
				System.out.println("Player one got it right? " + p1isRight);
				System.out.println("Player two got it right? " + p2isRight);
				System.out.println("Player three got it right? " + p3isRight);
				System.out.println("Game is over.");
				break;
				// game over, so break out of the loop
			} 
			else {
				// we must keep going because nobody got it right!
				System.out.println("Players will have to try again.");
				}
	
		
	}
	
}
}
class player{
	int number;
	public void guess() {
		
		number=(int)( Math.random()*10);
		System.out.println("i am guessin"+ number);
	}
	
}
public class GameLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuessGame game=new GuessGame();
		game.startGame();
		

	}
}


