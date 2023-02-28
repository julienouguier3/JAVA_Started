package equipment;

import offensiveEquipment.Weapon;
import personnages.Player;
import personnages.Warrior;
import personnages.Wizard;

import java.util.Objects;
import java.util.Scanner;

/**
 * Model for offensive equipment
 * When equipped by a player it provides an attack bonus in fight
 */
public abstract class OffensiveEquipment {

    /**
     * Name of the equipment
     */
    private final String name;

    /**
     * Protection level provided
     */
    private final int attackLevel;
    private Scanner scanner;


    public OffensiveEquipment(String name, int attackLevel) {
        this.name = name;
        this.attackLevel = attackLevel;
        this.scanner = new Scanner(System.in);

    }

    public void addEquipment(Player player) {
        System.out.println("1 - Take || 2 - Leave");
        int input = scanner.nextInt();

        switch (input) {
            case 1 -> {
                player.setAttack(player.getAttack() + this.getAttackLevel());
                System.out.println("-> new offensive equipment : " + this.getName());
                player.setOffensiveEquipment(this);

            }

            case 2 -> System.out.println("Keep the current equipment ");
        }

    }


    /*
    Getter and setter
     */
    public String getName() {
        return name;
    }

    public int getAttackLevel() {
        return attackLevel;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OffensiveEquipment that = (OffensiveEquipment) o;
        return attackLevel == that.attackLevel && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, attackLevel);
    }


}