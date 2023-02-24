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
        System.out.println("<===== \uD83D\uDD25 - MagicLightening (+2) =============================>\n"
                + this.toString());

       addEquipment(player);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
