
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

class FlameMonster extends DigitalMonster {
    public FlameMonster(String name, int level) {
        super(name, level, "Fire");
    }

    @Override
    public void performAttack() {
        System.out.println(name + " uses Fire Blast! Level: " + level
                + ", Element: " + element);
    }
}

class AquaMonster extends DigitalMonster {
    public AquaMonster(String name, int level) {
        super(name, level, "Water");
    }

    @Override
    public void performAttack() {
        System.out.println(name + " uses Water Splash! Level: " + level
                + ", Element: " + element);
    }
}

public class Main {
    static void main() {
        System.out.println("Hello World!");
    public static void main(String[] args) {
        FlameMonster flame = new FlameMonster("Flamie", 10);
        AquaMonster aqua = new AquaMonster("Aqua", 8);

        flame.performAttack();
        aqua.performAttack();
    }
}
