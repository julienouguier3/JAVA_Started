package defensiveEquipment;

import equipment.DefensiveEquipment;
import gameboard.Case;

public class Philter extends DefensiveEquipment implements Case {

    public Philter(String name, int level) {
        //Call the constructor of the parent class DefensiveEquipment
        super(name, level);
    }
}
