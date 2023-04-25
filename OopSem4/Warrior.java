package OopSem4;

import java.util.Random;

public abstract class Warrior {
    private String name;

    private Weapon weapon;

    private int healthPoint;

    public Warrior(String name, Weapon weapon, int healthPoint) {
        this.name = name;
        this.weapon = weapon;
        this.healthPoint = healthPoint;
    }

    @Override
    public String toString() {
        return String.format("Name %s, weapon %s, healthPoint %d", name, weapon, healthPoint);
    }

    public int hit() {
        Random random = new Random();
        return random.nextInt(weapon.damage());
    }
}
