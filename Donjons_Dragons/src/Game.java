public class Game {

    public static final int NB_CASE = 64;
    private Player player;

    private Dice dice;

    private int playerPosition;

    public Game() {
        this.player = null;
        this.playerPosition = 0;
        this.dice = new Dice();
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void playTurn() throws PersonnageHorsPlateauException {
        // The player throw the dice
        this.isFinished();
        System.out.println("You launch the dice....");
        int moves = this.dice.throwDice();
        // and advance is player accordingly
        System.out.printf("You move %d cases forward...",moves);
        System.out.println();
        this.playerPosition += moves;
        System.out.println(playerPosition);
    }

    public boolean hasPlayer() {
        return this.player != null;
    }

    public void unsetPlayer() {
        this.player = null;
    }

    public void isFinished() throws PersonnageHorsPlateauException {
        if (this.playerPosition > NB_CASE){
            throw new PersonnageHorsPlateauException();
        }
    }
}