import java.util.Scanner;
//link for git- https://github.com/nicolfilip/XO1
//Nicol Filipchuk 206637985 and Yuval Malka 315402669
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice= 0;
        Game game;
        Player player1, player2;
        while (choice!=3){
            System.out.println("Choose game version:");
            System.out.println("Option 1: Independent computer game");
            System.out.println("Option 2: User vs. Computer");
            System.out.println("Option 3: Exit");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    game= new SelfGame();
                    player1 = new SelfPlayer('X', game);
                    player2 = new SelfPlayer('O', game);
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
                    break;
                case 2:
                    game = new UserGame();
                    player1 = new UserPlayer('X', scanner);
                    player1.chooseGame(game);
                    player2 = new SelfPlayer('O', game);
                    player1Thread = new Thread((Runnable) player1);
                    player2Thread = new Thread((Runnable) player2);
                    player1Thread.start();
                    player2Thread.start();
                    try {
                        player1Thread.join();
                        player2Thread.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.println("see you next time :)");
                    break;
                default:
                    System.out.println("invalid choice");
            }
        }
        
        scanner.close();

}
    }
