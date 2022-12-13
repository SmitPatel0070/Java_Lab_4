// Name: Smit Patel
// Student ID: 100846414
// Date: December 12th, 2022
// Java Lab 4


import java.time.LocalDate;


// Employee class

public abstract class Employee extends Person {


    private final String employeeID;

    public Employee(String fullName, LocalDate birthDate, String employeeID) {
        super(fullName, birthDate);

        if (employeeID.length() != 8) {
            throw new IllegalArgumentException("Employee ID must be 8 charcters");
        }

        this.employeeID = employeeID;

    }


    public String getEmployeeID() {
        return employeeID;

    }


    public abstract double calculatePayDay();


    @Override
    public String toString() {
        return super.getName() + ", amount : $" + calculatePayDay();

    }


}