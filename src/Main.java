import java.util.ArrayList;

abstract class DigitalMonster {
    String name;
    int level;
    String element;

    public DigitalMonster(String name, int level, String element) {
        this.name = name;
        this.level = level;
        this.element = element;
    }

    public abstract void performAttack();
}

interface Flyable {
    public void fly();
}

interface Electric {
    public void shock();
}

class FlameMonster extends DigitalMonster implements Flyable {
    public FlameMonster(String name, int level) {
        super(name, level, "Fire");
    }

    @Override
    public void performAttack() {
        System.out.println(name + " uses Fire Blast! Level: " + level
                + ", Element: " + element);
    }
    @Override
    public void fly() {
        System.out.println(name + " is flying! ");
    }
}

class AquaMonster extends DigitalMonster implements Electric {
    public AquaMonster(String name, int level) {
        super(name, level, "Water");
    }

    @Override
    public void performAttack() {
        System.out.println(name + " uses Water Splash! Level: " + level
                + ", Element: " + element);
    }
    @Override
    public void shock() {
        System.out.println(name + " uses Electric Shock!");
    }
}

class StormBird extends DigitalMonster implements Flyable, Electric {
    public StormBird(String name, int level) {
        super(name, level, "Electric");
    }

    @Override
    public void performAttack() {
        System.out.println(name + " uses Thunder Strike! Level: " + level);
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying!");
    }

    @Override
    public void shock() {
        System.out.println(name + " uses Electric Shock!");
    }
}

class RockMonster extends DigitalMonster {
    public RockMonster(String name, int level) {
        super(name, level, "Earth");
    }

    @Override
    public void performAttack() {
        System.out.println(name + " uses Rock Smash! Level: " + level);
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<DigitalMonster> monsters = new ArrayList<>();

        monsters.add(new FlameMonster("Flamie", 10));
        monsters.add(new AquaMonster("Aqua", 8));
        monsters.add(new StormBird("Stormy", 12));
        monsters.add(new RockMonster("Rocky", 7));

        for (DigitalMonster monster : monsters) {
            monster.performAttack();
        }
    }
}
