import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose game version:");
        System.out.println("Option 1: Independent computer game");
        System.out.println("Option 2: User vs. Computer");
        int choice = scanner.nextInt();

        Game game;
        Player player1, player2;

        if (choice == 1) {
            game= new SelfGame();
            player1 = new SelfPlayer('X', game);
            player2 = new SelfPlayer('O', game);
        } else {
            game = new UserGame();
            player1 = new UserPlayer('X', scanner);
            player1.chooseGame(game);
            player2 = new SelfPlayer('O', game);
        }

        Thread player1Thread = new Thread((Runnable) player1);
        Thread player2Thread = new Thread((Runnable) player2);

        player1Thread.start();
        player2Thread.start();


        try {
            player1Thread.join();
            player2Thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        scanner.close();

}
    }
