package gameboard.enemies;

import gameboard.cases.Case;
import personnages.Player;
import personnages.Warrior;

public class EvilSpirits extends Enemies implements Case {

    public EvilSpirits(int attack, int life) {
        super(attack, life);
    }

    @Override
    public void startAction(Player player) {
        if (player.getArchetype().equals("Wizard")){
            this.startFighting(player);
        }
    }

    @Override
    public String toString() {
        return "\n||============ Evils Spirit "+ "\uD83D\uDC7B"+ " =============||\n"
                + super.toString();
    }


}
