//Nicol Filipchuk 206637985 and Yuval Malka 315402669

public abstract class Player {
    private char playerType;

    public Player(char playerType){
        this.playerType= playerType;
    }

    public char getPlayerType() {
        return playerType;
    }
    public abstract void chooseGame(Game game);

}
