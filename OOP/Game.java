package OOP;

class Character {
    String name;
    int health;
    int attackPower;

    Character(String name, int attackPower, int health) {
        this.name = name;
        this.attackPower = attackPower;
        this.health = health;
    }

    void attack() {
        System.out.println(name + " attacks with " + attackPower + " power!");
    }
}

class Warrior extends Character {
    int strength;

    Warrior(String name, int attackPower, int health) {
        super(name, attackPower, health);
    }

    @Override
    void attack() {
        System.out.println(name + " swings a sword for " + attackPower + " damage!");
    }
}

class Mage extends Character {
    int mana;

    Mage(String name, int attackPower, int health) {
        super(name, attackPower, health);
    }

    @Override
    void attack() {
        System.out.println(name + " casts a spell for " + attackPower + " damage!");
    }
}

public class Game {
    public static void main(String[] args) {
        Character character = new Character("Sage", 100, 0);
        character.attack();

        Warrior warrior = new Warrior("Emzy", 55, 0);
        warrior.attack();

        Mage mage = new Mage("Jemimah", 100, 0);
        mage.attack();

    }

}
