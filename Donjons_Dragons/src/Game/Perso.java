package Game;

/**
 * The attributes of the object are defined
 * private = making attribute only accessible within the declared class
 */
public class Perso {

    private String type;
    private String offensive;
    private String defensive;
    private String name;
    private int levelLife;
    private int attackForce;

    /**
     * defines a constructor for a class called "Personal"
     * initializes the "name" and "offensive" properties of the created object
     */
    public Perso() {
//        this("Einar","warrior");
        this.name = "Einar";
        this.type = "warrior";
        this.offensive = "weapon";
        this.defensive = "shield";
        this.levelLife = 10;
        this.attackForce = 10;


    }

    /**
     * @param name used to initialize the corresponding properties of the created object
     *"this" is used to refer to the object being created.
     */
    public Perso(String name, String type) {
        this.name = name;
        this.type = type;
        this.offensive = "weapon";
        this.defensive = "shield";
        this.levelLife = 10;
        this.attackForce = 10;


    }

    /**
     * Getters and setters are public methods that allow us to access the contents of a variable
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevelLife() {
        return levelLife;
    }

    public void setLevelLife(int levelLife) {
        this.levelLife = levelLife;
    }

    public int getAttackForce() {
        return attackForce;
    }

    public void setAttackForce(int attackForce) {
        this.attackForce = attackForce;
    }

    public String getOffensive() {
        return offensive;
    }

    public String getDefensive() {
        return defensive;
    }

    public void setDefensive() {
        this.defensive = defensive;
    }

    public void setOffensive() {
        this.offensive = offensive;
    }


    /*
   The toString() method returns the String representation of the object.
     */
    public String toString() {
        String resultat = "\n//------------Personage------------//\n";
        resultat += "(\\_/)\n";
        resultat += "( •,•)\n";
        resultat += "(\")_(\") ";
        resultat += "\n[ Name : " + this.name + " ]";
        resultat += "\n[ Type : " + this.type + " ]";
        resultat += "\n[ Offensive : " + this.offensive + " ]";
        resultat += "\n[ Defensive : " + this.defensive + " ]";
        resultat += "\n[ Level Life : " + this.levelLife + " ]";
        resultat += "\n[ Attack Force : " + this.attackForce + " ]";
        return resultat;


    }
}
