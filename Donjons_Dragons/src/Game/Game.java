package Game;


import java.util.Random;

/**
 * contains the game's internal logic
 */
public class Game {
    private Perso warrior;
    private Perso wizard;
    private int gameBoard;
    /**
     * Use the "Random" class of the standard Java library.
     */
    private Random nbrRandom;
    /**
     * Generates a random integer between 0 and 6 inclusive
     */
    private int randomNum;

    /**
     * At each turn the virtual die is rolled and the character moves from square to square until he reaches the end of the board.
     * until it reaches the end of the board.
     */

    public Game() {
        this.warrior = new Perso();
        this.wizard = new Perso();
        this.gameBoard = 64;
        this.nbrRandom = new Random();
        this.randomNum = nbrRandom.nextInt(7);
    }

    public void players() {


    }


    /**
     * Getters and setters are public methods that allow us to access the contents of a variable
     * @return attribute warrior
     */

    public Perso getWarrior() {
        return warrior;
    }

    public void setWarrior(Perso warrior) {
        this.warrior = warrior;
    }

    public Perso getWizard() {
        return wizard;
    }

    public void setWizard(Perso wizard) {
        this.wizard = wizard;
    }

    public int getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(int gameBoard) {
        this.gameBoard = gameBoard;
    }

    public Random getNbrRandom() {
        return nbrRandom;
    }

    public void setNbrRandom(Random nbrRandom) {
        this.nbrRandom = nbrRandom;
    }

    public int getRandomNum() {
        return randomNum;
    }

    public void setRandomNum(int randomNum) {
        this.randomNum = randomNum;
    }





    @Override
    public String toString() {
        return "Game{}";
    }
}
