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
        System.out.println("<================ \uD83D\uDD28 " + this.getName() + " (+5) =========================>\n"
                + "-> current equipment : " + player.getOffensiveEquipment()
                + "\n-> propose equipment :"
                + this
        );
        if (player.getArchetype().equals("Warrior")) {
            addEquipment(player);
        } else {
            System.out.println("It's an equipment of Warrior");
        }


    }

    @Override
    public String toString() {
        return super.toString();


    }
}
