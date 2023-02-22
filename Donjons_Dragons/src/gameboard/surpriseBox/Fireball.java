package gameboard.surpriseBox;

import gameboard.cases.Case;
import offensiveEquipment.Spell;
import personnages.Player;

public class Fireball extends Spell implements Case {
    public Fireball(String name, int defenceLevel) {
        super(name, defenceLevel);
    }

    @Override
    public void startAction(Player player) {
        System.out.println("<========= Player =========>\n" + "Offensive equipment : " + player.getOffensiveEquipment());
        player.increasesAttack(7);
    }
}
