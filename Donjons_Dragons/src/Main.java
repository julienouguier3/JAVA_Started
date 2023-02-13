import Game.Menu;//Import the Menu class into the Game folder

public class Main { //Declare the Main class

    /**
     *
     * public = access specifier : makes it globally available
     * static = keyword making it a class-related method.
     * void =  method doesn’t return anything
     * main = starting point of the java program
     */
    public static void main(String[] args) {
        Menu menu = new Menu(); //Instancie new object of the Menu class
        menu.init();//call method init of the Menu class

    }
}

