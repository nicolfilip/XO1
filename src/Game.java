import java.util.ArrayList;
import java.util.List;
//Nicol Filipchuk 206637985 and Yuval Malka 315402669
public  abstract class Game {
    protected char[][] gameBoard = new char[5][5];
    protected char playerTypeTurn;

    public Game(){
        this.playerTypeTurn = 'X';
    }

    public char getPlayerTypeTurn() {
        return playerTypeTurn;
    }

    public void setPlayerTypeTurn(char playerTypeTurn) {
        this.playerTypeTurn = playerTypeTurn;
    }
    // check the free cells and put them in array
    public List <Cell> getFreeCells(){
        List <Cell> freeCells= new ArrayList<>();
        for (int i=0; i<5; i++){
            for (int j=0; j<5 ;j++){
                if (gameBoard[i][j]==0){
                    freeCells.add(new Cell(i,j));
                }
            }
        }
        return freeCells;
    }
    // check if the input is true
    public boolean checkCell(int row, int col){
        if ((row<0 || row>=5) || (col<0 ||col>=5) || gameBoard[row][col]!=0){
            return false;
        }
        return true;
    }
    public abstract void placePlayerTypeInCell(int row,int col, char playerTypeTurn);
    public abstract void printBoard();
    public abstract boolean isBoardFull();
    public abstract boolean checkifThereIsWinner();

}




