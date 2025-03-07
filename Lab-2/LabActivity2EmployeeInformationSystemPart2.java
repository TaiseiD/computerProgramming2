import java.util.Scanner;

public class LabActivity2EmployeeInformationSystemPart2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        /*Declared all of the variables that this program used. 
        Assigned the retirement age to 65, tax rate to 32%, and fixed deduction to 1500*/
        String firstName, lastName;
        int age, yrsToRetirement, absYrsToRetirement, retirementAge = 65;
        float hoursWorked, hourlyWage, dailyWage, weeklyWage, monthlyWage, grossYearlyWage;
        double netYearlyWage, taxRate = 0.32, fixedDeduction = 1500;

        //User input
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

        //Calculations in this program
        yrsToRetirement = age - retirementAge ; absYrsToRetirement = Math.abs(yrsToRetirement);
        dailyWage = hoursWorked * hourlyWage;
        weeklyWage = dailyWage * 5;
        monthlyWage = weeklyWage * 4;
        grossYearlyWage = monthlyWage * 12;
        netYearlyWage = grossYearlyWage - (taxRate* grossYearlyWage + fixedDeduction);

        /*Output, I just learned that just like python we can use "printf" for formatted output, and ".toUpperCase()" for uppercase
        Also to format the text, like "%s" for format of string, %d for whole number, %n for new line. 
        Lastly the number 25 is for padding, it's negative since we want the alignment to left.*/
        System.out.println("\nEmployee Information");
        System.out.println("--------------------");
        System.out.printf("%-25s: %s %n","Full Name: ", (lastName + ", " + firstName).toUpperCase());
        System.out.printf("%-25s: %d years old %n","Age: " ,age);
        System.out.printf("%-25s: %d years %n","Years to Retirement: ", absYrsToRetirement);
        System.out.printf("%-25s: PHP %.2f%n","Daily Salary: ", dailyWage);
        System.out.printf("%-25s: PHP %.2f%n","Weekly Salary: ", weeklyWage);
        System.out.printf("%-25s: PHP %.2f%n","Monthly Salary: ", monthlyWage);
        System.out.printf("%-25s: PHP %.2f%n","Gross Yearly Salary: ", grossYearlyWage);
        System.out.printf("%-25s: PHP %.2f%n","Net Yearly Salary: ", netYearlyWage);
    }
}
