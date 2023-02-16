import equipment.DefensiveEquipment;
import equipment.OffensiveEquipment;

public class Warrior extends Player {

    public Warrior(String name, int life, int attack, String type, DefensiveEquipment defensiveEquipment, OffensiveEquipment offensiveEquipment) {
        super(name, life, attack, type, defensiveEquipment, offensiveEquipment);
    }
}
