package gameboard.surpriseBox;

import gameboard.cases.Case;
import offensiveEquipment.Weapon;
import personnages.Player;

public class Sledgehammer extends Weapon implements Case {
    public Sledgehammer(String name) {
        super(name, 3);
    }

    @Override
    public void startAction(Player player) {
        System.out.println("<================ " + this.getName() + " (+5) =========================>\n"
                + "-> current equipment : " + player.getOffensiveEquipment()
                + "\n" + this.toString()
        );
        addEquipment(player);


    }

    @Override
    public String toString() {
        return "-> proposed weapon : " +
                super.toString()

                ;
    }
}
