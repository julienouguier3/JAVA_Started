package personnages;

import defensiveEquipment.Shield;
import equipment.DefensiveEquipment;
import equipment.OffensiveEquipment;
import gameboard.cases.Case;
import gameboard.cases.CasesList;
import gameboard.enemies.Enemies;
import offensiveEquipment.Weapon;


import java.awt.*;
import java.util.Objects;

/**
 * Model for a player
 * Hold details information about the player
 */
abstract public class Player {

    /**
     * Name of the player
     */
    private String name;
    private String archetype;
    private int life;
    private int attack;

    private DefensiveEquipment defensiveEquipment;

    private OffensiveEquipment offensiveEquipment;


    /**
     * Create a new player using default parameters
     */
    public Player() {
        this.name = "Gandalf";
        this.archetype = " wizard";
        this.life = 6;
        this.attack = 1;
        //Instance Child Class Shield and Weapon
        this.defensiveEquipment = new Shield("Cloak", 1);
        this.offensiveEquipment = new Weapon("Staff", 1);

    }

    /**
     * Create a new player using given parameters
     *
     * @param name               name of the player
     * @param life               life point of the player
     * @param attack             attack level
     * @param type               archetype of the player (warrior or wizard)
     * @param defensiveEquipment defensive equipment the player is equipped with
     * @param offensiveEquipment offensive equipment the player is equipped with
     */
    public Player(String name, int life, int attack, String type, DefensiveEquipment defensiveEquipment, OffensiveEquipment offensiveEquipment) {
        this.name = name;
        this.archetype = type;
        this.life = life;
        this.attack = attack;
        this.defensiveEquipment = defensiveEquipment;
        this.offensiveEquipment = offensiveEquipment;

    }

    /**
     * Adds life to the player (potions)
     *
     * @param life determine the number to add
     */
    public void addLife(int life) {
        System.out.println("-> life before : " + this.life);
        this.life += life;
        System.out.println("-> life after : " + this.life);

    }

    public void attack(Enemies enemies) {
        enemies.setLife(this.getAttack()-enemies.getLife());

    }


    /**
     * getter and setter
     *
     * @return name, life, attack, archetype, defensive equipment and offensive equipment
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getArchetype() {
        return archetype;
    }

    public void setArchetype(String archetype) {
        this.archetype = archetype;
    }

    public DefensiveEquipment getDefensiveEquipment() {
        return defensiveEquipment;
    }

    public void setDefensiveEquipment(DefensiveEquipment defensiveEquipment) {
        this.defensiveEquipment = defensiveEquipment;
    }

    public OffensiveEquipment getOffensiveEquipment() {
        return offensiveEquipment;
    }

    public void setOffensiveEquipment(OffensiveEquipment offensiveEquipment) {
        this.offensiveEquipment = offensiveEquipment;
    }


    @Override
    public String toString() {
        return "\n======== Player ====================================================  " +
                "\n[ Name : " + name + " ]" +
                "\n[ Life : " + life + " ]" +
                "\n[ Attack : " + attack + " ]" +
                "\n[ Archetype : " + archetype + " ]" +
                "\n[ Defensive Equipment : " + defensiveEquipment + " ]" +
                "\n[ Offensive Equipment : " + offensiveEquipment + " ]" + "\n" +
                "=====================================================================";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return life == player.life && attack == player.attack && Objects.equals(name, player.name) && Objects.equals(archetype, player.archetype) && Objects.equals(defensiveEquipment, player.defensiveEquipment) && Objects.equals(offensiveEquipment, player.offensiveEquipment);
    }

    /**
     * we come to overwrite data
     *
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, life, attack, archetype, defensiveEquipment, offensiveEquipment);
    }
}