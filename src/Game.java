public abstract  class Game {
    private  String [][] gameBoard = new String[5][5];
    private Type playerType;
    private void printBoard (){
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

    private Type getTurn (){
        return playerType;
    }

    private void getFreeCells(){
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                if (gameBoard[i][j]==null){
                    System.out.println("("+i+","+j+")\n");
                }
            }
        }
    }

    public void setGameBoard(String[][] gameBoard) {
        this.gameBoard = gameBoard;
    }

    public Type getPlayerType() {
        return playerType;
    }

    public void setPlayerType(Type playerType) {
        this.playerType = playerType;
    }

    public String[][] getGameBoard() {
        return gameBoard;
    }

}


