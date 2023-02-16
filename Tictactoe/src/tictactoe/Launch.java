package tictactoe;

import java.util.Scanner;


class tictac{
	static  char[][] board;
	
	public tictac() {
		board=new char[3][3];
		initBoard();
	}
	void initBoard() {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board.length;j++) {
				board[i][j]=' ';
			}
		}
	}
	void displayBoard() 
	{
		System.out.println("-------------");
		for(int i=0;i<board.length;i++) {
			System.out.print("| ");
		
			for(int j=0;j<board.length;j++)
			{
				System.out.print(board[i][j] + " | ");
				
			}
			System.out.println(); 
			System.out.println("-------------");
	}
}

	static void placeMark(int row,int col,char mark) {
		if(row>=0 && row<=2 && col>=0 && col<=2) {
			board[row][col]=mark;
		}
		else {
			System.out.println("Invalid Input");
		}
		
	}

	boolean checkColWin(){
		for(int j=0;j<board.length;j++) {
			if(board[0][j] !=' ' && board[0][j]==board[1][j] && board[1][j]==board[2][j]) {
				return true;	 
			}
		}
		return false;
	}
	
	
	boolean checkRowWin(){

		for(int i=0;i<board.length;i++) {
			if(board[i][0] !=' ' && board[i][0]==board[i][0] && board[i][0]==board[i][0]) {
				return true;	 
			}
		}
		return false;
	}

	boolean checkDiagWin() {
		if(board[0][0 ] !=' ' && board[0][0]==board[1][1] && board[1][1]==board[2][2] || board[0][2] !=' ' && board[0][2]==board[1][1] && board[1][1]==board[2][0]) {
			return true;	 
		}
		else {
			return false;
		}
	}

		
	
 }



class HumanPlayer{
	String name;
	char mark;
	
	HumanPlayer(String name,char mark){
		this.name=name;
		this.mark=mark;
	}
	
	void makeMove() {
		
		Scanner scan=new Scanner(System.in);
		int row;
		int col;
		do {
			System.out.println("Enter the row and the coloum");
			 row=scan.nextInt();
			 col=scan.nextInt();
		}while(!isValidMove(row,col));
		
		tictac.placeMark(row, col, mark);
		
	}
	
	boolean isValidMove(int row,int col) {
		if(row<=0 && row>=2 && col<=0 && col>=2) {
			if(tictac.board[row][col]==' ') {
				return true;
			}
		}
		return false;

}










public class Launch {
	public static void main(String[] args) {
		tictac T=new tictac();
		
		HumanPlayer p1=new HumanPlayer("bob",'X');
		
	}

}
}