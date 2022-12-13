// Name: Smit Patel
// Student ID: 100846414
// Date: December 12th, 2022
// Java Lab 4



import java.time.LocalDate;

// HourlyWorkers class

public class HourlyWorkers extends Employee {

    private double hourlyRate;

    private int hoursWorked;


    public HourlyWorkers(String fullName, LocalDate birthDate, String employeeID, double hourlyRate, int hoursWorked) {
        super(fullName, birthDate, employeeID);

        this.hourlyRate = hourlyRate;

        this.hoursWorked = hoursWorked;

    }


    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate >= 16.0)
            this.hourlyRate = hourlyRate;
        else {
            this.hourlyRate = 16.0;
        }
    }

    public int getHoursWorked() {
        return hoursWorked;

    }


    public void setHoursWorked(int hoursWorked) {
        if (hoursWorked > 48) {
            this.hoursWorked = 48;

        } else {
            this.hoursWorked = hoursWorked;

        }

    }


    @Override
    public double calculatePayDay() {
        double pay = hourlyRate * hoursWorked;

        return Double.parseDouble(String.format("%.2f", pay));

    }



    public String toString() {
        return super.toString();

    }



}