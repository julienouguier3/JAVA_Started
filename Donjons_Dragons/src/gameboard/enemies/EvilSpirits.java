package gameboard.enemies;

import gameboard.cases.Case;
import personnages.Player;
import personnages.Warrior;

public class EvilSpirits extends Enemies implements Case {

    public EvilSpirits(int attack, int life) {
        super(attack, life);
    }

    @Override
    public void startAction(Player player) {
        int pAttack = player.getAttack();//stock attack of player
        if (player.getOffensiveEquipment().getName().equals("Invisibility")){
            player.setAttack(pAttack+3);
        }
        startFighting(player);
        player.setAttack(pAttack);//restores the player's initial attack
    }

    @Override
    public String toString() {
        return "\n||========== Evils Spirit "+ "\uD83D\uDC7B"+ " ===========||\n"
                + super.toString();
    }


}
