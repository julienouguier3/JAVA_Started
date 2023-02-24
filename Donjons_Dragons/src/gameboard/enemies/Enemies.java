package gameboard.enemies;

import gameboard.cases.CasesList;
import personnages.Player;

import java.util.Scanner;

abstract public class Enemies {

    private int attack;
    private int life;
    private final Scanner scanner;


    public Enemies(int attack, int life) {
        this.attack = attack;
        this.life = life;
        this.scanner = new Scanner(System.in);

    }

    public void attack(Player player) {
        player.setLife(player.getLife() - this.getAttack());
    }

    public void startFighting(Player player) {
        System.out.println("||============ Player ==============||\n"
                + "||-> life : " + player.getLife()
                + " -> attack : " + player.getAttack() + "       ||"
                + "\n"
                + this);//acts on the intanciated class
        player.attack(this);
        if (this.getLife() <= 0) {
            System.out.println("Won battle");
        } else {
            this.attack(player);
            this.choiceOfFight(player);
        }
    }

    public void choiceOfFight(Player player) {
        System.out.println("\nChoice : 1) Escape or 2) Attack");
        int input = scanner.nextInt();

        while (input < 1 || input > 2) {
            System.out.println("\nChoice : 1) Escape or 2) Attack");
            input = scanner.nextInt();
        }
        if (input == 1) {
            player.move(-2);
        } else if (input == 2){
            startFighting(player);

        }

    }


    /**
     * getter and setter
     *
     * @return attack, life
     */
    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }


    @Override
    public String toString() {
        return "||-> life : " + life
                + " -> attack : " + attack + "        ||";


    }
}

