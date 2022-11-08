package week4.boxinggame;

public class Fighter {
    private final String name;
    private final int damage;
    private int health;
    private final int weight;
    private final double dodge;

    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(Fighter fighter) {
        System.out.println("------------");
        System.out.println(this.name + " => " + fighter.name + " dealt damage: " + this.damage);

        if (fighter.canDodge()) {
            System.out.println(fighter.name + " dodged the attack.");
            return fighter.health;
        }

        if (fighter.health - this.damage < 0)
            return 0;

        return fighter.health - this.damage;
    }

    public boolean canDodge() {
        double randomValue = Math.random() * 100;
        return randomValue <= this.dodge;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getWeight() {
        return weight;
    }

    public double getDodge() {
        return dodge;
    }
}
