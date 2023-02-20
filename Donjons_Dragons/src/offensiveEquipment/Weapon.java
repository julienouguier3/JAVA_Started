package offensiveEquipment;

import equipment.OffensiveEquipment;
import gameboard.cases.Case;

public class Weapon extends OffensiveEquipment implements Case {


    public Weapon(String name, int defenceLevel) {
        //Call the constructor of the parent class OffensiveEquipment
        super(name, defenceLevel);

    }



}
