package gameboard.enemies;

import gameboard.cases.Case;
import personnages.Player;

public class Dragon extends Enemies implements Case {
    public Dragon(int attack, int life) {
        super(attack, life);
    }


    @Override
    public void startAction(Player player) {
        int pAttack = player.getAttack();
        if (player.getOffensiveEquipment().getName().equals("Bow")){
            player.setAttack(pAttack+2);
        }
        startFighting(player);
        player.setAttack(pAttack);
    }

    @Override
    public String toString() {
        return "\n||============ Dragon" +"\uD83D\uDC09" + " ===========||\n"
                + super.toString()
                ;
    }
}
