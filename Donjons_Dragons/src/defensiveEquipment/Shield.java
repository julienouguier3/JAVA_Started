package defensiveEquipment;

import equipment.DefensiveEquipment;
import gameboard.cases.Case;
import personnages.Player;

public class Shield extends DefensiveEquipment implements Case {

    public Shield(String name, int level){
        //Call the constructor of the parent class DefensiveEquipment
        super(name, level);
    }

    @Override
    public void startAction(Player player) {

    }
}
