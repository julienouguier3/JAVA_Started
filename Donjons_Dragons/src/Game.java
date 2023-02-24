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

      private CasesList gameboard;
    private final Scanner scanner;
    private int number;

    public Game() {
        this.player = null;
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
        try { //display string + throw dice
            System.out.println("\n{{----------Round " + number++ + " ----------}}");
            System.out.println(this.toString());
            System.out.println(" You launch the dice \uD83C\uDFB2");
            int moves = this.dice.throwDice();
            //move player
            System.out.printf(" You move %d cases forward\n", moves);
           player.move(moves);
            //exception
            infoPlayer();
            isFinished();
            System.out.println(this.toString());
            //retrieves player position + run method
            Case cases = gameboard.getList().get(player.getPlayerPosition());
            cases.startAction(this.player);
        } catch (PersonnageHorsPlateauException e) {
            this.player.setPlayerPosition(NB_CASE);
            System.out.println("\n"+"<===== \uD83C\uDFF0  ! You Win ! =====>");
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
        if (this.player.getPlayerPosition() >= NB_CASE) {
            throw new PersonnageHorsPlateauException();
        }
    }

    /**
     * getter and setter
     *
     * @return player, gameboard
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
        return "\nPlayer's position : [ " + this.player.getPlayerPosition() + "/" + NB_CASE + " ] " + "\n" + getGameboard();
    }


}