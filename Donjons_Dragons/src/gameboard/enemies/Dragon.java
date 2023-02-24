package gameboard.enemies;

import gameboard.cases.Case;
import personnages.Player;

public class Dragon extends Enemies implements Case {
    public Dragon(int attack, int life) {
        super(attack, life);
    }


    @Override
    public void startAction(Player player) {
        startFighting(player);
    }

    @Override
    public String toString() {
        return "\n||============ Dragon ==============||\n"
                + super.toString()
                ;
    }
}
