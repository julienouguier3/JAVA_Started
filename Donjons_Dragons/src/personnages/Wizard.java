package personnages;

import equipment.DefensiveEquipment;
import equipment.OffensiveEquipment;

public class Wizard extends Player  {

    public Wizard(String name, int life, int attack, String type, DefensiveEquipment defensiveEquipment, OffensiveEquipment offensiveEquipment, int playerPosition){
        super(name, life, attack, type, defensiveEquipment, offensiveEquipment, playerPosition);
    }

    @Override
    public String toString() {
        return "\n======== "+this.getArchetype()
                + " \uD83E\uDDD9\uD83C\uDFFB\u200D♂️"
                +" ==================================================" + super.toString();
    }
}
