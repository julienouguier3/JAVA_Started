package gameboard.surpriseBox;

import gameboard.cases.Case;
import gameboard.cases.CasesList;

public class EmptyCase implements Case {
    private final String empty;
    private final CasesList casesList;

    public EmptyCase(String empty, CasesList casesList){
        this.empty =empty;
        this.casesList = new CasesList();
    }


}
