package equipment;

import java.util.Objects;

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


    public OffensiveEquipment(String name, int attackLevel) {
        this.name = name;
        this.attackLevel = attackLevel;
    }

    public String getName() {
        return name;
    }

    public int getAttackLevel() {
        return attackLevel;
    }

    @Override
    public String toString() {
        return name +
                ", attackLevel == " + attackLevel;

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