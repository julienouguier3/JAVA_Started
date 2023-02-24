package gameboard.enemies;

import gameboard.cases.Case;
import personnages.Player;

public class Witch extends Enemies implements Case {

    public Witch(int attack, int life) {
        super(attack, life);
    }

    @Override
    public void startAction(Player player) {
        startFighting(player);
    }

    @Override
    public String toString() {
        return "\n||============ Witch ===============||\n"
                + super.toString();
    }
}
