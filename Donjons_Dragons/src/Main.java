

import java.util.Scanner;

public class Main {

    /**
     * Starting point of my project
     * instantiation of the classes to simplify the relations
     */
    public static void main(String[] args) {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(game, scanner);
        menu.run();

        /*do {
            gameState = game.nextTurn(player, scanner);
        } while(gameState.equels("IN_PROGRESS"));*/

    }
}

