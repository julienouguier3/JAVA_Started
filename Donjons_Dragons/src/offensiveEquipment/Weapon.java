package offensiveEquipment;

import equipment.OffensiveEquipment;
import personnages.Player;
import personnages.Warrior;
import personnages.Wizard;

import java.util.Scanner;


public class Weapon extends OffensiveEquipment {



    public Weapon(String name, int attackLevel) {
        //Call the constructor of the parent class OffensiveEquipment
        super(name, attackLevel);


    }

    /**
     * character is compatible with this equipment and the current equipment is less advantageous than the new one.
     */


        @Override
        public String toString () {
            return "[ " + this.getName()
                    + ", attack level : " + this.getAttackLevel() + " ]";

        }
    }
