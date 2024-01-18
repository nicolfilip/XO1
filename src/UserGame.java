public class UserGame extends Game {

    @Override
    public boolean isBoardFull() {
            return !getFreeCells().isEmpty();

    }


}
