package Game;

import java.util.Scanner;


public class Menu {
    protected Scanner clavier;//Instancier un lecteur

    private Game game;

    public Menu() {
        this.clavier = new Scanner(System.in);
        // New Game
        Game game = new Game();

    }

    public void init() {
        //
        String namePlayer = answerUser(" => Enter your name : ");
        String typePlayer = answerUser(" => Enter your type : ");
        Perso player = new Perso(namePlayer, typePlayer); //creation of the character
        // set game player
        player.setName(namePlayer);
        player.setType(typePlayer);
        player.setOffensive();
        player.setDefensive();
        //start game
        int start = startGame();




        System.out.print(player);//display method "toString" of the class Perso
    }


    /**
     * @param message define the message to display
     * @return The message to reply to in the user
     */
    private String answerUser(String message) {
        System.out.println(message);
        return clavier.nextLine();
    }

    private int startGame() {
        System.out.println("Start (1) or Exit (2)");
        int choice = clavier.nextInt();

        if (choice == 1) {
            System.out.println("Start");
            // game.start
        } else if (choice == 2) {
            System.out.println("Exit");
            return 0;
        } else {
            System.out.println("Not valid");
        }
        return choice;

    }

    public String toString() {

        return "\n//------------Menu------------//\n"
                + "\n";
    }
}
