
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

public class Main {
    public static void main(String[] args) {
        FlameMonster flame = new FlameMonster("Flamie", 10);
        AquaMonster aqua = new AquaMonster("Aqua", 8);

        flame.performAttack();
        flame.fly();

        aqua.performAttack();
        aqua.shock();
    }
}
