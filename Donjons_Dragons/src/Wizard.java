import equipment.DefensiveEquipment;
import equipment.OffensiveEquipment;

public class Wizard extends Player {

    public Wizard(String name, int life, int attack, String type, DefensiveEquipment defensiveEquipment, OffensiveEquipment offensiveEquipment){
        super(name, life, attack, type, defensiveEquipment, offensiveEquipment);
    }

}