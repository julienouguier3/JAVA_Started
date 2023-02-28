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
                + this.toString());
        if (player.getArchetype().equals("Wizard")) {
            specialEquipment(player);
            System.out.println(this);
        }
    }

    @Override
    public String toString() {
        return "Invisibility " +
                super.toString();
    }
}
