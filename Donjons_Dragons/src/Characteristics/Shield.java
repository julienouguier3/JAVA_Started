package Characteristics;

/**
 * The attributes of the object are defined
 */
public class Shield {

 private int defenceLevel;
 private String name;

    /**Constructor
     * The characteristics of the object's attributes are defined
     */
    public Shield (){
        this.name = "potion";
        this.defenceLevel = 15;
    }

    public int getAttackForce() {
        return defenceLevel;
    }

    public void setAttackForce(int defenceLevel) {
        this.defenceLevel = defenceLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
