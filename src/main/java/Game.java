// Amrit Gill
// February 12, 2024
// Period 5
// TTT with 2D arrays

public class Game{

  private static final int ROWS = 3;
  private static final int COLS = 3;
  private static final int WIN_STATE = 3;
  private static final int EMPTY = 0;
  private static final int PLAYER_1 = 1;
  private static final int PLAYER_2 = 2;
  private int[][] board;
  private int currentPlayer;
  private int moves;
  
  public Game(){
    board = new int[ROWS][COLS];
    currentPlayer = PLAYER_1;
    moves = 0;
  }

  public void play(){
  
  }

  public static final String[][] STATE = {
      { "X", "O", "X" },
      { "O", "X", "O"},
      { "X", "O", "X" }
  };

  public void printBoard(){
    for(int i = 0; i < STATE.length; i++){
      for(int j = 0; j < STATE.length; j++){
        if(STATE[i][j] == "X"){
          System.out.print("X ");
        }
        else if (STATE[i][j] == "O"){
          System.out.print("O ");
        }
        else{
          System.out.print("  ");
        }
        System.out.println();
      }
    }
  }
}