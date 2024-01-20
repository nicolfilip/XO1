import java.util.List;
import java.util.Random;
import java.util.Scanner;
//Nicol Filipchuk 206637985 and Yuval Malka 315402669
public class UserPlayer extends Player implements Runnable {

    public Scanner scanner;
    private Game game;

    public UserPlayer(char playerType, Scanner scanner) {
        super(playerType);
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        try {
            Thread.sleep(500); //sleep
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        do {
            if (game.getPlayerTypeTurn() == getPlayerType()) {
                System.out.println("Player: " + getPlayerType());
                System.out.println("Enter row between 0-4:");
                int row = scanner.nextInt();
                System.out.println("Enter column between 0-4: ");
                int col = scanner.nextInt();
                if (game.checkCell(row, col)) { //if the choice of the cell is correct then
                    game.placePlayerTypeInCell(row, col, getPlayerType()); // put the player's type in the cell that the user choose
                    game.printBoard();
                } else {
                    System.out.println("Invalid move, please try again :)");
                }
            }
        } while (!game.isBoardFull() && !game.checkifThereIsWinner());
    }


    public void chooseGame(Game game) {
        this.game= game;



    }
}
