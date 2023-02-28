package gameboard.surpriseBox;

import gameboard.cases.Case;
import gameboard.cases.CasesList;
import offensiveEquipment.Weapon;
import personnages.Player;

public class Bow extends Weapon implements Case {
    private CasesList dragonCase;

    public Bow(String name, int attackLevel) {
        super(name, attackLevel);
    }

    @Override
    public void startAction(Player player) {
        System.out.println("<===== \uD83C\uDFF9 - Bow =============================>\n"
                + "-> current equipment : " + player.getOffensiveEquipment()
                + "\n-> propose equipment :"
                + this.toString());
        if (player.getArchetype().equals("Warrior")) {
            addEquipment(player);


        }

    }


    @Override
    public String toString() {
        return "Bow " +
                super.toString();
    }
}
