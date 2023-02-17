package gameboard;

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
        list.add(new Enemies());
        list.add(new EmptyBox());
        list.add(new SurpriseBox());

    }
}
