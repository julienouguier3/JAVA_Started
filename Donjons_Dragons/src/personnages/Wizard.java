package personnages;

import equipment.DefensiveEquipment;
import equipment.OffensiveEquipment;
import gameboard.Case;

public class Wizard extends Player  {

    public Wizard(String name, int life, int attack, String type, DefensiveEquipment defensiveEquipment, OffensiveEquipment offensiveEquipment){
        super(name, life, attack, type, defensiveEquipment, offensiveEquipment);
    }

}
