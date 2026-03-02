package OOP;

public class House {
    private String name;
    private int roomsNumber;

    public House(String name, int roomsNumber) {
        this.name = name;
        this.roomsNumber = roomsNumber;
    }

    public void description() {
        System.out.println("I live in a " + name + " with " + roomsNumber + " rooms");
    }
}
