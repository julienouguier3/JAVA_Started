package gameboard;

import gameboard.enemies.Dragon;
import gameboard.enemies.Goblin;
import gameboard.enemies.Witch;
import offensiveEquipment.Weapon;

import java.util.ArrayList;

public class CasesList {

    private final int nbrCases;

    private ArrayList<Case> list = new ArrayList<Case>();

    /**
     * method: create the different squares of the board
     */
    public CasesList() {
        this.nbrCases = 64;
        list.add(new Weapon("sword",5));
        list.add(new Dragon(4,15));
        list.add(new Goblin(1,6));
        list.add(new Witch(2,9));
        list.add(new EmptyBox());
        list.add(new SurpriseBox());

    }

    /**
     * getter and setter
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
        return "CasesList{" +
                " nbrCases /" + nbrCases + "\""+
                ", list=" + list +
                '}';
    }
}
