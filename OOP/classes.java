package OOP;

public class classes {
    public static void main(String[] args) {
        // House myhouse = new House("Semi-detached Duplex", 3);
        // myhouse.description();

        // Car myCar = new Car("Mercedes Benz", 2019);
        // myCar.info();

        Employee employee = new Employee("Evans", 500000);
        employee.setSalary(-2000); // rejected
        employee.output();
    }
}
