package Characteristics;

/**
 * The attributes of the object are defined
 */
public class Weapon {
    private String name;
    private int attackForce;

    /**Constructor
     * The characteristics of the object's attributes are defined
     */
    public Weapon(){
        this.name = "sword";
        this.attackForce = 10;
    }

    /**
     * Constructor
     */
    public Weapon(String name) {
        this.name = name;
        this.attackForce = 10;

    }



    /**
     * Getters and setters are public methods that allow us to access the contents of a variable
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevelLife() {
        return attackForce;
    }

    public void setLevelLife(int levelLife) {
        this.attackForce = levelLife;
    }
}
