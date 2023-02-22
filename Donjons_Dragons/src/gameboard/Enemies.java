package gameboard;

import gameboard.cases.Case;
import personnages.Player;

abstract public class Enemies  {

 private int attack;
 private int life;

    public Enemies(int attack, int life){
     this.attack = attack;
     this.life = life;
 }



    /**
     * getter and setter
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



}

