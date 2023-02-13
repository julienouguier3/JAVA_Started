package Test;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        // Affiche "Ecrire un nombre: "
        System.out.print("Ecrire un nombre: ");

        //Lit l'entier écrit par l'utilisateur et l'affecte
        // à  la variable nombre du programme
        int nombre = clavier.nextInt();

        // Affiche le nombre saisit par l'utilisateur
        System.out.println(nombre);
    }
}