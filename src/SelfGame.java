import java.util.Scanner;

public class SelfGame extends Game {
    public void placePlayerTypeInCell(int row, int col, char playerTypeTurn) {
        gameBoard[row][col] = playerTypeTurn;
        if (playerTypeTurn == 'X') {
            setPlayerTypeTurn('O');
        } else {
            setPlayerTypeTurn('X');
        }
    }

    @Override
    public void printBoard() {
        System.out.println("Current board: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(gameBoard[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    @Override
    public boolean isBoardFull() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (gameBoard[i][j] == 0) {
                    return false;
                }
            }
        }
        System.out.println("Board is full, try next time :)");
        return true;
    }

    @Override
    public boolean checkifThereIsWinner() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                if (gameBoard[i][j] != 0 &&
                        gameBoard[i][j] == gameBoard[i][j + 1] &&
                        gameBoard[i][j] == gameBoard[i][j + 2] &&
                        gameBoard[i][j] == gameBoard[i][j + 3]) {
                    System.out.println("Player " + gameBoard[i][j] + " wins!");
                    return true;
                }
                if (gameBoard[j][i] != 0 &&
                        gameBoard[j][i] == gameBoard[j + 1][i] &&
                        gameBoard[j][i] == gameBoard[j + 2][i] &&
                        gameBoard[j][i] == gameBoard[j + 3][i]) {
                    System.out.println("Player " + gameBoard[j][i] + " wins!");
                    return true;
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (gameBoard[i][j] != 0 &&
                        gameBoard[i][j] == gameBoard[i + 1][j + 1] &&
                        gameBoard[i][j] == gameBoard[i + 2][j + 2] &&
                        gameBoard[i][j] == gameBoard[i + 3][j + 3]) {
                    System.out.println("Player " + gameBoard[i][j] + " wins!");
                    return true;
                }
                if (gameBoard[i][4 - j] != 0 &&
                        gameBoard[i][4 - j] == gameBoard[i + 1][3 - j] &&
                        gameBoard[i][4 - j] == gameBoard[i + 2][2 - j] &&
                        gameBoard[i][4 - j] == gameBoard[i + 3][1 - j]) {
                    System.out.println("Player " + gameBoard[i][4 - j] + " wins!");
                    return true;
                }
            }
        }

 return false;
    }


    }


