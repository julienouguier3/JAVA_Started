package defensiveEquipment;

import equipment.DefensiveEquipment;
import gameboard.cases.Case;
import personnages.Player;

public class Philter extends DefensiveEquipment {

    public Philter(String name, int level) {
        //Call the constructor of the parent class DefensiveEquipment
        super(name, level);
    }

    @Override
    public String toString() {
        return "[ "+super.getName()+ ", level : +"+ super.getLevel();
    }
}
