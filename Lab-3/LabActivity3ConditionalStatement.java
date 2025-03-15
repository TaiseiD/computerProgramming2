import java.util.Scanner;

public class LabActivity3ConditionalStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String firstName, lastName, name;
        String position = "";
        int employeesAge, employeesJobRole, yearsToRetirement;
        double dailySalary, weeklySalary, monthlySalary, grossYearlySalary, netYearlySalary;
        float numberOfHoursWorked, hourlyWage;

        //For user input
        System.out.print("Enter your first name : ");
        firstName = input.nextLine(); 
        System.out.print("Enter your last name : ");
        lastName = input.nextLine();
        System.out.print("Enter your age : ");
        employeesAge = input.nextInt();
        
            //Age checking
             if (employeesAge < 18) 
                {
                    System.out.println("Minors are not allowed");
                    System.exit(0);
                }
            else if (employeesAge >= 65) 
                {
                    System.out.println("Senior Citizens are not allowed");
                    System.exit(0);
                }
                else
                {
                    //Just to make it more readable
                }

        System.out.print("Enter hours worked : ");
        numberOfHoursWorked = input.nextFloat();
        System.out.print("Enter hourly wage : ");
        hourlyWage = input.nextFloat();
        System.out.print("Enter role code (1-Manager, 2-Supervisor, 3-Staff, 4-Intern) : ");
        employeesJobRole = input.nextInt();


        //Formulas, even though i can just put it in the printf, I just want to make it more readable
        name = (lastName + ", " + firstName).toUpperCase();
        yearsToRetirement = 65 - employeesAge;
        dailySalary = numberOfHoursWorked * hourlyWage;
        weeklySalary = dailySalary * 5;
        monthlySalary = weeklySalary * 4;
        grossYearlySalary = monthlySalary * 12;
        
            //For tax
            if (grossYearlySalary > 250000)
            {
                netYearlySalary = grossYearlySalary - (0.32 * grossYearlySalary + 1500);
            } 
            else
            {
                netYearlySalary = grossYearlySalary - 1500;
            }

        //To check if Number of hours worked is valid
        if (numberOfHoursWorked > 24)
        {
            System.out.print("Number of hours worked cannot exceed 24 hours");
            System.exit(0);
        }

        else if (numberOfHoursWorked <= 0)
        {
            System.out.print("Wrong input on daily work hours");
        }

        else
        {
            //For job role, It's much cleaner than if else. This goes first to handle the error before printing out.
            switch (employeesJobRole) {
                case 1 -> position = "Manager";
                case 2 -> position = "Supervisor";
                case 3 -> position = "Staff";
                case 4 -> position = "Intern";
                default -> {
                    System.out.println("Invalid input");
                    System.exit(0);
                }
            }

        /*
        For output, I just found out that you can integrate formula in printf
        I copied the formula and the way the format to lab act 2. 
        I just added the job role and the years to retirement
        */

        System.out.println("\nEmployee Information");
        System.out.println("--------------------");
        System.out.printf("%-25s %s %n","Full Name: ", name);
        System.out.printf("%-25s %d years %n","Age: " ,employeesAge);
        System.out.printf("%-25s %s %n", "Position: ", position);
        System.out.printf("%-25s %d years old %n" , "Years To Retirement : ", yearsToRetirement);
        System.out.printf("%-25s PHP %.2f%n","Daily Salary: ", dailySalary);
        System.out.printf("%-25s PHP %.2f%n","Weekly Salary: ", weeklySalary);
        System.out.printf("%-25s PHP %.2f%n","Monthly Salary: ", monthlySalary);
        System.out.printf("%-25s PHP %.2f%n","Gross Yearly Salary: ", grossYearlySalary);
        System.out.printf("%-25s PHP %.2f%n","Net Yearly Salary: ", netYearlySalary);
        }
    }
}
