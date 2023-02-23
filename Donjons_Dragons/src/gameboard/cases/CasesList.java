package gameboard.cases;

import gameboard.enemies.Dragon;
import gameboard.enemies.Goblin;
import gameboard.enemies.Witch;
import gameboard.surpriseBox.*;

import java.util.ArrayList;

public class CasesList {

    private int nbrCases;

    private ArrayList<Case> list = new ArrayList<Case>();


    /**
     * method: create the different squares of the board
     */
    public CasesList() {
        this.nbrCases = 64;


        for (int i = 0; i < nbrCases; i++) {
            switch (i) {
                case 1, 3, 13, 31 -> {
                    list.add(new Sword("Sword", 5));
                }
                case 15, 24, 36, 54 -> {
                    list.add(new Witch(2, 9));

                }
                case 38, 43, 62 -> {
                    list.add(new Dragon(4, 15));
                }
                case 2, 14, 28, 41-> {
                    list.add(new Fireball("Fireball", 7));
                }
                case 6, 32, 46,52, 61-> {
                    list.add(new SmallPotion("SmallPotion", 2));
                }
                case 4, 12, 25, 49, 60 -> {
                    list.add(new BigPotion("BigPotion", 5));
                }
                case 5, 19, 26,30, 47 -> {
                    list.add(new Sledgehammer("Sledgehammer"));

                }
                case 7, 22, 45, 56 -> {
                    list.add(new Goblin(1, 6));

                }
                case 17, 29, 37, 68 -> {
                    list.add(new magicLightning("magicLightning", 2));

                }
                default -> list.add(new EmptyCase());

            }
        }
    }


    /**
     * getter and setter
     *
     * @return array list
     */
    public ArrayList<Case> getList() {
        return list;
    }

    public void setList(ArrayList<Case> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "";

    }
}
