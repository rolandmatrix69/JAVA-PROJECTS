package JavaStudy;

class Employee {
    private String number;
    private String name;

    public Employee(String nameIn, String numberIn) {
        this.name = nameIn;
        this.number = numberIn;
    }

    public String getNumber() {
        return number;
    }

    public String getname() {
        return name;
    }

    public void setName(String nameIn) {
        name = nameIn;
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyPay;

    PartTimeEmployee(String nameIn, String numberIn, double hourlyPayIn) {
        this.hourlyPay = hourlyPayIn;
        super(nameIn, numberIn);
    }

    public void setHourlyPay(double hourlypayIn) {
        hourlyPay = hourlypayIn;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public double calculateWeeklyPay(int noOfHoursIn) {
        return noOfHoursIn * hourlyPay;
    }
}

public class StudyOne {

}
