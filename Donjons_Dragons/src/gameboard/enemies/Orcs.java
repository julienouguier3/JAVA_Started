package gameboard.enemies;

import gameboard.cases.Case;
import personnages.Player;

public class Orcs extends Enemies implements Case {
    public Orcs(int attack, int life) {
        super(attack, life);
    }

    @Override
    public void startAction(Player player) {
        if (player.getArchetype().equals("Warrior")){
            this.startFighting(player);
        }
    }

    @Override
    public String toString() {
        return "\n||============ Orcs "+ "\uD83E\uDDCC"+ " =============||\n"
                + super.toString();
    }
}
