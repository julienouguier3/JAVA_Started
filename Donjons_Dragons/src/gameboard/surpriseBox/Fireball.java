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
        System.out.println("<===== \uD83D\uDD25 - " + this.getName() + " (+7) ===========================>\n"
                + "-> current spell : " + player.getOffensiveEquipment()
                + "\n-> propose equipment :" + this.getName()
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
