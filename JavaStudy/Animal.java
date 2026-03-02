package JavaStudy;

public class Animal {
    private String name;
    private String action;

    Animal(String name, String action) {
        this.name = name;
        this.action = action;
    }

    void behaviour() {
        System.out.println(name + " is " + action);
    }

}
