package gameboard.surpriseBox;

import gameboard.cases.Case;
import offensiveEquipment.Spell;
import personnages.Player;

public class magicLightning extends Spell implements Case {
    public magicLightning(String name, int attackLevel) {
        super(name, attackLevel);
    }

    @Override
    public void startAction(Player player) {
        System.out.println("<===== ⚡ - MagicLightening (+2) =============================>\n"
                + "-> current spell : " + player.getOffensiveEquipment()
                + "-> propose equipment :" + this.getName()
                + this.toString());

        if (player.getArchetype().equals("Wizard")) {
            addEquipment(player);
        } else {
            System.out.println("It's an equipment of Wizard");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
