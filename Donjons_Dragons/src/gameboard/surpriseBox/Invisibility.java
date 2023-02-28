package gameboard.surpriseBox;

import gameboard.cases.Case;
import offensiveEquipment.Spell;
import personnages.Player;

public class Invisibility extends Spell implements Case {
    private Case spiritCase;

    public Invisibility(String name, int attackLevel) {
        super(name, attackLevel);
    }

    public void startAction(Player player) {
        System.out.println("<=====  - Invisibility =============================>\n"
                + "-> current equipment : " + player.getOffensiveEquipment()
                + "\n-> propose equipment :"
                + this);
        if (player.getArchetype().equals("Wizard")) {
            addEquipment(player);
            System.out.println(this);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
