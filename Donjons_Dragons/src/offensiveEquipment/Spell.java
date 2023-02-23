package offensiveEquipment;

import equipment.OffensiveEquipment;
import gameboard.cases.Case;
import personnages.Player;
import personnages.Warrior;
import personnages.Wizard;

public class Spell extends OffensiveEquipment  {

    public Spell(String name, int attackLevel) {
        //Call the constructor of the parent class OffensiveEquipment
        super(name, attackLevel);

    }

    public void addEquipment(Player player){

        if (player instanceof Wizard){
            if (this.getAttackLevel() > player.getOffensiveEquipment().getAttackLevel()){
                player.setAttack(player.getAttack()+this.getAttackLevel());
                player.setOffensiveEquipment(this);
            } else {
                System.out.println(this);
            }


        }

    }

    @Override
    public String toString() {
        return "Spell name : "+ this.getName()
                + ", attack level : "+ this.getAttackLevel();
    }
}
