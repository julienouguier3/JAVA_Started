package gameboard.enemies;

import gameboard.cases.Case;
import gameboard.cases.CasesList;
import personnages.Player;

abstract public class Enemies {

    private int attack;
    private int life;


    public Enemies(int attack, int life) {
        this.attack = attack;
        this.life = life;
    }

    public void attack(Player player) {
        player.setLife(player.getLife() - this.getAttack());

    }

    public void startFighting(Player player) {
        System.out.println("||============ Player ==============||\n"
                + "||-> life : " + player.getLife()
                + " -> attack : " + player.getAttack() + "       ||"
                + "\n"
        +this);//acts on the intanciated class

        player.attack(this);
        if (this.life <= 0) {
            System.out.println("Won Battle");
        } else {
            this.attack(player);
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

