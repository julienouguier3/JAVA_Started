package gameboard.surpriseBox;

import gameboard.cases.Case;
import gameboard.cases.CasesList;
import personnages.Player;

public class EmptyCase implements Case {
    private final String empty;


    public EmptyCase(String empty) {
        this.empty = empty;

    }

    @Override
    public String toString() {
        return empty;
    }

    @Override
    public void startAction(Player player) {
        System.out.println(this.empty);
    }
}
