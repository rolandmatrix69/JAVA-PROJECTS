package JavaStudy;

class Shape {
    private double height;
    private double width;

    Shape(double h, double w) {
        this.height = h;
        this.width = w;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double h) {
        height = h;
    }

    public void setWidth(double w) {
        width = w;
    }

    public double area() {
        return height * width;
    }
}

public class Study {
    public static void main(String[] args) {
        // Animal animal = new Animal("Dog", "Barking");
        // // animal.name = "Dog";
        // // animal.action = "barking";

        // animal.behaviour();
        Shape rectangle = new Shape(0, 0);

        rectangle.setHeight(100);
        rectangle.setWidth(4);
        System.out.println(rectangle.getHeight());

        double result = rectangle.area();
        System.out.println(result);

    }

}
