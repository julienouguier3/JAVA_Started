import exceptions.PersonnageHorsPlateauException;
import gameboard.cases.Case;
import gameboard.cases.CasesList;
import gameboard.Dice;
import personnages.Player;

import java.util.Scanner;

public class Game {

    public static final int NB_CASE = 64;
    private Player player;

    private final Dice dice;

    private int playerPosition;
    private CasesList gameboard;
    private final Scanner scanner;
    private int number;

    public Game() {
        this.player = null;
        this.playerPosition = 0;
        this.dice = new Dice();
        this.gameboard = new CasesList();
        this.scanner = new Scanner(System.in);
        this.number = 1;

    }

    /**
     * playTurn throw the dice and move of numbers of cases
     *
     * @throws PersonnageHorsPlateauException
     */
    public void playTurn() throws PersonnageHorsPlateauException {

        System.out.println("<===== Round " + number++ + " =====>");
        this.isFinished();
        System.out.println(this.toString());
        System.out.println(" You launch the dice [°]");
        int moves = this.dice.throwDice();
        // and advance is player accordingly
        infoPlayer();
        System.out.printf(" You move %d cases forward", moves);
        System.out.println();
        this.playerPosition += moves;
        System.out.printf(this.toString());
        Case cases = gameboard.getList().get(playerPosition);
        cases.startAction(this.player);

    }


    public void infoPlayer() {
        if (scanner.nextLine().equals("h")) {
            System.out.println(getPlayer());
        } else {
            scanner.nextLine();
        }
    }

    public boolean hasPlayer() {
        return this.player != null;
    }

    public void unsetPlayer() {
        this.player = null;
    }

    public void isFinished() throws PersonnageHorsPlateauException {
        if (this.playerPosition > NB_CASE) {
            throw new PersonnageHorsPlateauException();
        }
    }

    /**
     * getter and setter
     *
     * @return player
     */
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public CasesList getGameboard() {
        return gameboard;
    }

    public void setGameboard(CasesList gameboard) {
        this.gameboard = gameboard;
    }


    @Override
    public String toString() {
        return "\n---- Player's position : [" + playerPosition + "/" + NB_CASE + " ] ----"+"\n" + getGameboard();
    }
}