package MoshOOP;

public class LearningOOP {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.setHourlyrate(20);

        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}
