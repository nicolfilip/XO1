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
