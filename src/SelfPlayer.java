import java.util.ArrayList;
import java.util.List;
import java.util.Random;
//Nicol Filipchuk 206637985 and Yuval Malka 315402669
public class SelfPlayer extends Player implements Runnable {
    private Game game;
    public SelfPlayer(char playerType, Game game){
        super(playerType);
        this.game=game;
    }

    @Override
    public void run() {
        while (!game.isBoardFull() && !game.checkifThereIsWinner()){
            try {
                Thread.sleep(500); //sleep
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            if (game.getPlayerTypeTurn()== getPlayerType()){ // if it's the player's turn
                List <Cell> freeCells= game.getFreeCells(); //put in a new array list the free cells
                if (!freeCells.isEmpty()){ //if we have free cells then put the player's type in a random cell
                    Random random= new Random();
                    Cell selectCell= freeCells.get(random.nextInt(freeCells.size()));
                    game.placePlayerTypeInCell(selectCell.getRow(), selectCell.getCol(), getPlayerType());
                    game.printBoard();
                }
            }
        }
    }
    public void chooseGame(Game game){}
}
