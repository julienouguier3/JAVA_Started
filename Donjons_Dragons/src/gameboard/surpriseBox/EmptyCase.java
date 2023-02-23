package gameboard.surpriseBox;

import gameboard.cases.Case;
import gameboard.cases.CasesList;
import personnages.Player;

public class EmptyCase implements Case {
    private final String empty;


    public EmptyCase() {
        this.empty = " (づ｡◕‿‿◕｡)づ ";

    }

    @Override
    public void startAction(Player player) {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "EmptyCase : " +
                empty;
    }
}
