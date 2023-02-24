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
    public void playTurn() {
        try {
            System.out.println("\n<===== Round " + number++ + " =====>");
            System.out.println(this.toString());
            System.out.println(" You launch the dice \uD83C\uDFB2");
            int moves = this.dice.throwDice();
            // and advance is player accordingly
            System.out.printf(" You move %d cases forward\n", moves);
            this.playerPosition += moves;
            infoPlayer();
            isFinished();
            System.out.println(this.toString());
            Case cases = gameboard.getList().get(playerPosition);
            cases.startAction(this.player);
        } catch (PersonnageHorsPlateauException e) {
            this.playerPosition = NB_CASE;
            System.out.println("\n"+"<===== GG ! You Win ! =====>");
        }
    }


    public void infoPlayer() {
        String input = scanner.nextLine();
        while (!input.equals("")){
            if (input.equals("h")){
                System.out.println(getPlayer());
            }
            input = scanner.nextLine();
        }

    }

    public boolean hasPlayer() {
        return this.player != null;
    }

    public void unsetPlayer() {
        this.player = null;
    }

    public void isFinished() throws PersonnageHorsPlateauException {
        if (this.playerPosition >= NB_CASE) {
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
        return "\nPlayer's position : [ " + playerPosition + "/" + NB_CASE + " ] " + "\n" + getGameboard();
    }

    public int getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }
}