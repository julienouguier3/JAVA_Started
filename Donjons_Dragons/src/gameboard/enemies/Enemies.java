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
        player.setLife(this.getAttack()-player.getLife());

    }
    public void startFighting(Player player) {
        player.attack(this);
        if (this.life == 0) {
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
                + " -> attack : " + attack + "         ||";



    }
}

