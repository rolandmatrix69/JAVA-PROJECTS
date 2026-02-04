package OOP;

class House {
    String name;
    int roomsNumber;

    public void description() {
        System.out.println("I live in a " + name + " with " + roomsNumber + " rooms");
    }
}

public class classes {

    public static void main(String[] args) {

        House myhouse = new House();

        myhouse.name = "Semi-detached Duplex";
        myhouse.roomsNumber = 3;

        myhouse.description();

    }

}
