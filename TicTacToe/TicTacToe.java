public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		TicTacToe spiel1 = new TicTacToe();
		
		spiel1.initialiazeBoard();
		
		spiel1.play(2, 2);
		
		spiel1.play(1,2);
		
		
		
		spiel1.play(2, 1);
		spiel1.play(1, 1);
		spiel1.play(0, 1);
		spiel1.play(2, 0);
		spiel1.play(1, 0);
		spiel1.play(0, 0);
		spiel1.play(0, 2);
		//spiel1.play(0, 2);
		
		
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
			
			if (this.isGameOver()) {
				
				throw new RuntimeException("Das Spiel ist bereits beendet!");
				
				
			} else {
			
			
				if ((ROWS <= row || row < 0) || (COLS <= col || col< 0)) {
				
					throw new RuntimeException("Dieses Feld gibt es nicht! Bitte wähle ein anderes Feld!");
				
				}
			
					if(this.board[row][col] == Player.Unknown) {
			
						if (this.currentPlayer == Player.X) {
				
				
							this.board[row][col]= this.currentPlayer;
							this.initialiazeBoard();
		        
						
							//isGameWon muss noch definiert werden!!!!
							if (this.isGameWon() == false) {
								this.currentPlayer=Player.O;
		        
							} else {
								
								//GameisOver muss gesetzt werden!!
								
							}
		      
						} else if (this.currentPlayer == Player.O){
				
				
							this.board[row][col]= this.currentPlayer;
							this.initialiazeBoard();
				
							
							
							//isGameWon muss noch definiert werden!!!!
							if (this.isGameWon() == false) {
								
								this.currentPlayer=Player.X;
		        
							} else {
								
								//GameisOver muss gesetzt werden!!
								
						
							}
			
					} else {
				
				
						throw new RuntimeException("Dieses Feld ist bereits besetzt!");

				
					}
				
					}
		
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


