abstract class Employee {
    private int employeeId;
    private String employeeName;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    abstract double calculateSalary();

    void displayEmployeeInfo() {
        System.out.println(employeeId + " " + employeeName);
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class EmployeePayroll {
    public static void main(String[] args) {
        FullTimeEmployee f = new FullTimeEmployee();
        f.setEmployeeId(1);
        f.setEmployeeName("Rahul");
        f.setMonthlySalary(50000);

        PartTimeEmployee p = new PartTimeEmployee();
        p.setEmployeeId(2);
        p.setEmployeeName("Aman");
        p.setHoursWorked(20);
        p.setHourlyRate(500);

        f.displayEmployeeInfo();
        System.out.println("Salary: " + f.calculateSalary());

        p.displayEmployeeInfo();
        System.out.println("Salary: " + p.calculateSalary());
    }
}