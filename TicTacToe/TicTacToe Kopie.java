public class TicTacToe {

	public static void main(String[] args) {
		

		TicTacToe spiel1 = new TicTacToe();
		
		spiel1.initialiazeBoard();
		
		spiel1.play(2, 2);
		
		spiel1.play(1,2);
		
		
	}
	
		
	
		
		private int ROWS = 3;
		private int COLS = 3;
		
		public Player[][] board;
		
		public enum Player {
		Unknown, X, O 
		}
		
		private Player currentPlayer;
		private Player winner;
		
		
		
		public TicTacToe() {
			
		this.board = new Player[ROWS][COLS];

	
			for(int i = 0; i < ROWS; i++)
			{
			    for(int j = 0; j < COLS; j++)
			    	
			     {
			     
			    	this.board[i][j]= Player.Unknown;
			    	    
			     }
			    
			}
			
			currentPlayer = Player.X;
			winner = null;
			
		
		}
		
		
	
		public void initialiazeBoard() {
			
			for(int i = 0; i < ROWS; i++)
			{
			    for(int j = 0; j < COLS; j++)
			     {
					    
			    	System.out.print(this.board[i][j]+" ");
			    	
			     }
			    
			    System.out.println();
			    
			}	
			
			System.out.println("");
		}
		
		
		
		public void play(int row, int col) {
			
			
			if (this.currentPlayer == Player.X) {
				
				
		        this.board[row][col]= this.currentPlayer; 
		        this.initialiazeBoard();
		        
		        this.currentPlayer=Player.O;
		        
		      
			} else if (this.currentPlayer == Player.O){
				
				
		        this.board[row][col]= this.currentPlayer;
		        this.initialiazeBoard();
				
				this.currentPlayer=Player.X;
				
			}
			
		}
		
		
		
		
		public boolean isBoardEmpty() {
			
			
			return false;
		}
		public boolean isGameWon() {
			
			
			
			
			
			return false;
		}
		public boolean isDraw() {
			
			return false;
		}
		public boolean isGameOver() {
			
			return false;
		}
		public Player getCurrentPlayer() {
			
			return this.currentPlayer;
		}
		public Player getWinner() {
			
			return Player.Unknown;
		}
	

}
