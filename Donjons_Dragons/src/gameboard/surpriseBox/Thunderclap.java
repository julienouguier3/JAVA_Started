package gameboard.surpriseBox;

import defensiveEquipment.Philter;
import gameboard.cases.Case;
import personnages.Player;

public class Thunderclap extends Philter implements Case {
    public Thunderclap(String name, int level) {
        super(name, level);
    }

    @Override
    public void startAction(Player player) {
       player.setBuff(true);//Player drunk the potion
    }
}
