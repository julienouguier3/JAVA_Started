package gameboard.surpriseBox;

import defensiveEquipment.Philter;
import gameboard.cases.Case;
import personnages.Player;

import java.awt.*;

public class SmallPotion extends Philter implements Case {
    public SmallPotion(String name, int level) {
        super(name, level);
    }


    /**
     * add life to player
     *
     * @param player
     */
    @Override
    public void startAction(Player player) {
        System.out.println("======= 🧪 - " + this.getName() +"(+2) =======\n" +
                this.toString());
        player.addLife(2);
    }

    @Override
    public String toString() {
        return "\n"+super.toString();
    }
}
