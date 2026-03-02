package JavaStudy;

class Animal {
    String name;
    String behaviour;

    Animal(String name, String behaviour) {
        this.name = name;
        this.behaviour = behaviour;
    }

    public void act() {
        System.out.println(name + " is " + behaviour);
    }
}

public class School {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Elvis", "Barking");

        animal1.act();
    }
}
