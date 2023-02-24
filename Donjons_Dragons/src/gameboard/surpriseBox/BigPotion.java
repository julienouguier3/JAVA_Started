package gameboard.surpriseBox;

import defensiveEquipment.Philter;
import gameboard.cases.Case;
import personnages.Player;

public class BigPotion extends Philter implements Case {
    public BigPotion(String name, int level) {
        super(name, level);
    }


    @Override
    public void startAction(Player player) {
        System.out.println("======= Surprise - Big Potion (+5) =======\n"
    +this.toString());
    player.addLife(5);
    }

    @Override
    public String toString() {
        return "\n"+super.toString();
    }
}
