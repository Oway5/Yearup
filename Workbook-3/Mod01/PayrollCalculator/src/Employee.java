public class Employee {
    private int employeeId;
    private String name;
    private double hoursWorked;
    private double payRate;
    public Employee(int employeeId, String name, double hoursWorked, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public String getName() {
        return name;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public double getPayRate() {
        return payRate;
    }
    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
    public double getGrossPay() {
        return hoursWorked * payRate;
    }


    @Override
    public String toString() {
        return String.format("Employee ID: %d, Name: %s, Gross Pay: %.2f", employeeId, name, getGrossPay());
    }
}

