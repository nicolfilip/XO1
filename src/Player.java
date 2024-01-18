public abstract class Player {
    private Game game;
    private Game.Type playerType;

    public Player (Game.Type playerType){
        this.playerType= playerType;
    }
//    public boolean checkThePlayerTurn(){
//        if (playerType== playerType.X){
//            return true;
//        }
//        return false;
//    }
    public abstract boolean checkTurn();
}
