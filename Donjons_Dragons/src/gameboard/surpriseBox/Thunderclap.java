package gameboard.surpriseBox;

import defensiveEquipment.Philter;
import gameboard.cases.Case;
import personnages.Player;

public class Thunderclap extends Philter implements Case {
    public Thunderclap(String name, int level) {
        super(name, level);
    }

    @Override
    public void startAction(Player player) {
        System.out.println("<===== \uD83D\uDD0B x2 - " + this.getName() + " ===========================>\n"
        );
        player.setBuff(true);//Player drunk the potion
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Thunderclap : power x2 for the next battle";
    }
}
