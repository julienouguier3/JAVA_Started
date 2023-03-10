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
        return "\n||============ Witch "+"\uD83E\uDDD9\uD83C\uDFFE\u200D♀️"+" ===============||\n"
                + super.toString();
    }
}
