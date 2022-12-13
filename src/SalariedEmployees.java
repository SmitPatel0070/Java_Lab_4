// Name: Smit Patel
// Student ID: 100846414
// Date: December 12th, 2022
// Java Lab 4



import java.time.LocalDate;

// SalariedEmployees class

public class SalariedEmployees extends Employee {

    private double salary;


    public SalariedEmployees(String fullName, LocalDate birthDate, String employeeID, double salary) {
        super(fullName, birthDate, employeeID);

        setSalary(salary);

    }

    public double getSalary() {
        return salary;

    }

    public void setSalary(double salary) {
        if (salary >= 0)
            this.salary = salary;
    }

    @Override
    public double calculatePayDay() {
        double pay = salary / 52;

        return Double.parseDouble(String.format("%.2f", pay));

    }



    public String toString() {
        return super.toString();

    }

}