// Import scanner so that user can input 
import java.util.Scanner;

class LabActivity1EmployeeInformationSystem {
    public static void main(String[] args) {
    
    // Setting the scanner
    Scanner input = new Scanner(System.in);
    
    // Declaration of variables
    String firstName, lastName;
    int age;
    float hoursWorked, hourlyWage, result;
    double roundUpResult;

        System.out.print("Enter your first name : ");
        firstName = input.nextLine();

        System.out.print("Enter your last name : ");
        lastName = input.nextLine();

        System.out.print("Enter your age : ");
        age = input.nextInt();

        System.out.print("Enter hours worked : ");
        hoursWorked = input.nextFloat();

        System.out.print("Enter hourly wage : ");
        hourlyWage = input.nextFloat();

        // Calculation of daily salary, used the Math.round so only 2 decimals
        result = hoursWorked * hourlyWage;
        roundUpResult = Math.round(result * 100.00) / 100.00;

        System.out.println("Employee Information");
        System.out.println("--------------------");
        System.out.println("Employee Name : " + firstName + " " + lastName);
        System.out.println("Age : " + age + " years old");
        System.out.println("Daily salary: PHP " + roundUpResult);
    }
}
