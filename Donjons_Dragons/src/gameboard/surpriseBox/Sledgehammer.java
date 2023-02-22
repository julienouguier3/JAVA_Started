package gameboard.surpriseBox;

import gameboard.cases.Case;
import offensiveEquipment.Weapon;
import personnages.Player;

public class Sledgehammer extends Weapon implements Case {
    public Sledgehammer(String name, int defenceLevel) {
        super(name, defenceLevel);
    }

    @Override
    public void startAction(Player player) {
    player.increasesAttack(3);
    }
}
