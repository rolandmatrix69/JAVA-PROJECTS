package OOP;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) return; // reject negative values
        this.salary = salary;
    }

    public void output() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}
