package Game;

import java.util.Scanner;


public class Menu {
    static Scanner clavier = new Scanner(System.in);

    public void init() {
        //
        String namePerso = answerUser(" => Enter your name : ");
        String typePerso = answerUser(" => Enter your type : ");
        Perso player = new Perso(namePerso, typePerso); //creation of the character

        System.out.print(player);//display method "toString" of the class Perso

        //Exit
        clavier.close();

    }

    /**
     * user's message
     * @param message
     * @return
     */
    private String answerUser(String message ) {
        System.out.println(message);
        return clavier.nextLine();
    }

    public String toString(){
        return "//------------Menu------------//";
    }
}
