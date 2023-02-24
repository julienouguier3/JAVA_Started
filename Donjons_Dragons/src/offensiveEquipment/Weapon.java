package offensiveEquipment;

import equipment.OffensiveEquipment;
import personnages.Player;
import personnages.Warrior;


public class Weapon extends OffensiveEquipment {


    public Weapon(String name, int attackLevel) {
        //Call the constructor of the parent class OffensiveEquipment
        super(name, attackLevel);

    }

    /**
     * character is compatible with this equipment and the current equipment is less advantageous than the new one.
     * @param player : retrieve info from the Player class
     */
    public void addEquipment(Player player){

        if (player instanceof Warrior){
            if (this.getAttackLevel() > player.getOffensiveEquipment().getAttackLevel()){
                player.setAttack(player.getAttack()+this.getAttackLevel());
                System.out.println("-> new offensive equipment : " + this.getName());
                player.setOffensiveEquipment(this);

            } else {
                System.out.println(this);
            }


    }

    }


    @Override
    public String toString() {
        return "[ "+ this.getName()
                +", attack level : " + this.getAttackLevel() + " ]";

    }
}
