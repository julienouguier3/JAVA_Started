package gameboard.enemies;

import gameboard.Enemies;
import gameboard.cases.Case;
import personnages.Player;

public class Dragon extends Enemies implements Case {
    public Dragon(int attack, int life) {
        super(attack, life);
    }


    @Override
    public void startAction(Player player) {
        System.out.println("<===== Player =============================>\n" + "life : "
                + player.getLife() + "  attack : "
                + player.getAttack()
        );
    }

    @Override
    public String toString() {
        return "<========== Dragon ==========>\n" + "life : " + getLife() + "  attack : " + getAttack();
    }
}
