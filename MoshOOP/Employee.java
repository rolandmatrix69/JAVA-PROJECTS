package MoshOOP;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary can't be 0 or less than 0");
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary(int baseSalary) {
        return baseSalary;
    }

    public void setHourlyrate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate can't be 0 or less");
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyrate(int hourlyRate) {
        return hourlyRate;
    }
}