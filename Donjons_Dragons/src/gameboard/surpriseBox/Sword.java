package gameboard.surpriseBox;

import gameboard.cases.Case;
import offensiveEquipment.Weapon;
import personnages.Player;

public class Sword extends Weapon implements Case {
    public Sword(String name, int defenceLevel) {
        super(name, defenceLevel);
    }


    @Override
    public void startAction(Player player) {
        player.increasesAttack(5);
    }
}
