package gameboard.enemies;

import gameboard.Enemies;
import gameboard.cases.Case;
import personnages.Player;

public class Goblin extends Enemies implements Case {

    public Goblin(int attack, int life) {
        super(attack, life);
    }

    @Override
    public void startAction(Player player) {

        System.out.println("Player : " + "life :  "+player.getLife() + " attack : "+player.getAttack() );
    }

    @Override
    public String toString() {
        return "<===== Goblin =====>\n" + "life : " + getLife() + "  attack : " + getAttack();
    }
}
