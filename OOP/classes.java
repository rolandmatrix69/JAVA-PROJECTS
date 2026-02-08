package OOP;

// class House {
//     String name;
//     int roomsNumber;

//     public void description() {
//         System.out.println("I live in a " + name + " with " + roomsNumber + " rooms");
//     }
// }
// class Car {
//     String brand;
//     int year;

//     Car(String brand, int year) {
//         this.brand = brand;
//         this.year = year;
//     }

//     public void info() {
//         System.out.println("Brand: " + brand + ", Year: " + year);
//     }
// }

class Employee {
    private String name;
    private double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        if (salary <= 0)
            throw new IllegalArgumentException("Salary can't be less than 0");
        this.salary = salary;
    }

    public String getName(String name) {
        return name;
    }

    public double getSalary(double salary) {
        return salary;
    }

    public void output() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

public class classes {

    public static void main(String[] args) {
        // Car myCar = new Car("Mercedez Benz", 2019);
        // myCar.info();
        // Car mycar2 = new Car("BMW", 2024);
        // mycar2.info();

        // House myhouse = new House();

        // myhouse.name = "Semi-detached Duplex";
        // myhouse.roomsNumber = 3;

        // myhouse.description();

        Employee employee = new Employee("Evans", 500000);
        employee.setSalary(-2000);
        System.out.println(employee.getSalary());

    }

}
