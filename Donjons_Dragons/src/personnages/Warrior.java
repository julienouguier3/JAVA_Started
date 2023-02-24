package personnages;

import equipment.DefensiveEquipment;
import equipment.OffensiveEquipment;


public class Warrior extends Player {


    public Warrior(String name, int life, int attack, String type, DefensiveEquipment defensiveEquipment, OffensiveEquipment offensiveEquipment, int playerPosition) {
        super(name, life, attack, type, defensiveEquipment, offensiveEquipment, playerPosition);
    }


    @Override
    public String toString() {
        return "\n======== " + this.getArchetype() + " \uD83E\uDD77"
                + " ========================================================="
                + super.toString();
    }
}
