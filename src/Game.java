import java.util.ArrayList;
import java.util.List;

public  abstract class Game {
    private char [][] gameBoard = new char[5][5];
    private Type playerType;
    private Cell cell;
    public void printBoard(){
        for (int i = 0; i<5 ; i++ ){
            for (int j = 0; j<5; j++){
                System.out.println(gameBoard[i][j]+ " ");
            }
            System.out.println();
        }
    }
    enum Type {
        X , O
    }

    public Type getTurn (){
        return playerType;
    }

    public List <Cell> getFreeCells(){
        List<Cell> freeCells= new ArrayList<>();
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                if (gameBoard[i][j]==0){
                    freeCells.add(new Cell(i,j));
                }
            }
        }
        return freeCells;
    }
    public abstract boolean isBoardFull();

    public void setGameBoard(char[][] gameBoard) {
        this.gameBoard = gameBoard;
    }

    public Type getPlayerType() {
        return playerType;
    }

    public void setPlayerType(Type playerType) {
        this.playerType = playerType;
    }

    public char[][] getGameBoard() {
        return gameBoard;
    }
    public void  makeCell(Cell cell, Type playerType){
        gameBoard[cell.getRow()][cell.getCol()]= (playerType== playerType.X) ? 'X' : 'O';
    }
                }




