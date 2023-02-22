package gameboard.enemies;

import gameboard.Enemies;
import gameboard.cases.Case;
import personnages.Player;

public class Witch extends Enemies implements Case {

    public Witch(int attack, int life) {
        super(attack, life);
    }

    @Override
    public void startAction(Player player) {

    }

    @Override
    public String toString() {
        return "<===== Witch =====>\n" + "life : " + getLife() + "  attack : " + getAttack();
    }
}
