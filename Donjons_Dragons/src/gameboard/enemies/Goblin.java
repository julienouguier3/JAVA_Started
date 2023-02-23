package gameboard.enemies;

import gameboard.cases.Case;
import personnages.Player;

public class Goblin extends Enemies implements Case {

    public Goblin(int attack, int life) {
        super(attack, life);
    }

    @Override
    public void startAction(Player player) {

        System.out.println("||============ Player ==============||\n"
                + "||-> life : " + player.getLife()
                + " -> attack : " + player.getAttack() + "         ||" + "\n"
                + this.toString()
        );
        this.startFighting(player);
    }

    @Override
    public String toString() {
        return "\n||============ Goblin ===============||\n"
                + super.toString();
    }
}
