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
        System.out.println("================ " + "\uD83D\uDDE1️ " + this.getName() + " (+5) =========================\n"
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
