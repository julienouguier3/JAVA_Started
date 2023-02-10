package Game;

/**
 * The attributes of the object are defined
 */
public class Perso {

      private  String type;
      private  String offensive;
      private  String defensive;
      private  String name;
      private  int levelLife;
      private  int attackForce;

    /**Constructor
     * The characteristics of the object's attributes are defined
     */
    public Perso (){
//        this("Einar","warrior");
        this.name ="Einar";
        this.type ="warrior";
        this.offensive = "weapon";
        this.defensive = "shield";
        this.levelLife = 10;
        this.attackForce = 10;


    }

    /**
     * Constructor
     * @param name
     * @param type
     */
    public Perso (String name, String type){
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

    public void setDefensive(String defensive) {
        this.defensive = defensive;
    }

    public void setOffensive(String offensive) {
        this.offensive = offensive;
    }


    /*
   The toString() method returns the String representation of the object.
     */
    public String toString(){
        return "//------------Personage------------//\n " +
                "(\\_/)\n" +
                "( •,•)\n" +
                "(\")_(\") " +
                "\n[ Name : " + this.name + " ]" + "\n[ Type : " + this.type + " ]" + "\n[ OffensiveEquipment : " + this.offensive + " ]"+ "\n[ DefensiveEquipment : " + this.defensive
                + " ]"+ "\n[ levelLife : " + this.levelLife + " ]" + "\n[ AttackForce : " + this.attackForce + " ]";
    }


}

