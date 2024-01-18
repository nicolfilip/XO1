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
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            if (game.getPlayerTypeTurn()== getPlayerType()){
                List <Cell> freeCells= game.getFreeCells();
                if (!freeCells.isEmpty()){
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
