// Name: Smit Patel
// Student ID: 100846414
// Date: December 12th, 2022
// Java Lab 4



import java.time.LocalDate;


// Main file

public class Java_Lab_4 {


    public static void main(String[] args) {


        try {

            SalariedEmployees se1 = new SalariedEmployees("Smit Patel", LocalDate.of(1995, 12, 21), "29062002", 100000);
            System.out.println("Salary : $" + se1.getSalary());
            se1.setSalary(120000);
            System.out.println("Salary : $" + se1.getSalary());

            HourlyWorkers hw1 = new HourlyWorkers("Yesha Patel", LocalDate.of(1998, 10, 11), "22062003", 17, 48);
            System.out.println("Hours Worked: " + hw1.getHoursWorked());
            System.out.println("Hourly wages: " + hw1.getHourlyRate());
            hw1.setHourlyRate(21);
            hw1.setHoursWorked(45);

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        }



        try {


            Employee e[] = new Employee[5];
            e[0] = new SalariedEmployees("Hemika Patel", LocalDate.of(1998, 10, 11), "18112000", 150000);
            e[1] = new SalariedEmployees("Devika Patel", LocalDate.of(1998, 11, 18), "14011978", 120000);
            e[2] = new HourlyWorkers("Krish Patel", LocalDate.of(1998, 11, 18), "23072006", 22, 27);
            e[3] = new HourlyWorkers("Neel Patel", LocalDate.of(1997, 10, 12), "20012001", 25, 35);
            e[4] = new HourlyWorkers("Jeet Patel", LocalDate.of(1994, 4, 18), "12122022", 34, 47);

            double total = 0;


            for (int i = 0; i < 5; i++) {
                System.out.println(e[i]);
                total += e[i].calculatePayDay();

            }


            System.out.println("Overall paid amount: $"+String.format("%.2f", total));

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        }

    }

}