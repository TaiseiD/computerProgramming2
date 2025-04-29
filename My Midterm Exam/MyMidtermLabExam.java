import java.util.Scanner;

public class MyMidtermLabExam {

    static final int Max_Ticket = 5;
    static String[] issue = new String[Max_Ticket];
    static String[] urgency = new String[Max_Ticket];
    static String[] status = new String[Max_Ticket];
    static int ticketCount = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            System.out.println("\n===== IT Ticket System =====");
            System.out.println("1. Add Ticket");
            System.out.println("2. Update Ticket Status");
            System.out.println("3. Show All Tickets");
            System.out.println("4. Generate Report");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            if (input.hasNextInt()) {
                choice = input.nextInt();
                input.nextLine(); // clear the newline
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.next(); // skip invalid input
                continue;
            }

            switch (choice) {
                case 1 -> addTicket(input);
                case 2 -> updateTicketStatus(input);
                case 3 -> showAllTickets();
                case 4 -> generateReport();
                case 5 -> System.out.println("Exiting the program. Goodbye!");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }

        input.close();
    }

    static void addTicket(Scanner input) {
        if (ticketCount < Max_Ticket) {
            System.out.print("Enter issue description: ");
            issue[ticketCount] = input.nextLine();

            System.out.print("Enter urgency (Low / Medium / High): ");
            urgency[ticketCount] = input.nextLine();

            status[ticketCount] = "Pending";
            ticketCount++;

            System.out.println("Ticket added successfully.");
        } else {
            System.out.println("Maximum number of tickets reached.");
        }
    }

    static void updateTicketStatus(Scanner input) {
        if (ticketCount == 0) {
            System.out.println("No tickets to update.");
            return;
        }
        
        
        System.out.println("\n--- All Tickets ---");
        for (int i = 0; i < ticketCount; i++) {
            System.out.println((i + 1) + ". [" + urgency[i] + "] " + issue[i] + " - Status: " + status[i]);
        }

        System.out.print("Enter ticket number to update status: ");
        if (input.hasNextInt()) {
            int ticketNumber = input.nextInt();
            input.nextLine(); // clear newline
            int index = ticketNumber - 1;

            if (index >= 0 && index < ticketCount) {
                System.out.print("Enter new status (In Progress / Resolved): ");
                String newStatus = input.nextLine();
                status[index] = newStatus;
                System.out.println("Ticket status updated.");
            } else {
                System.out.println("Invalid ticket number.");
            }
        } else {
            System.out.println("Invalid input.");
            input.next(); // skip invalid input
        }
    }

    static void showAllTickets() {
        if (ticketCount == 0) {
            System.out.println("No tickets available.");
            return;
        }

        System.out.println("\n--- All Tickets ---");
        for (int i = 0; i < ticketCount; i++) {
            System.out.println((i + 1) + ". [" + urgency[i] + "] " + issue[i] + " - Status: " + status[i]);
        }
    }

    static void generateReport() {
        int pendingCount = 0;
        int inProgressCount = 0;
        int resolvedCount = 0;

        for (int i = 0; i < ticketCount; i++) {
            if (status[i].equalsIgnoreCase("Pending")) {
                pendingCount++;
                inProgressCount++;
            } else if (status[i].equalsIgnoreCase("Resolved")) {
                resolvedCount++;
            }
        }

        System.out.println("\n--- Ticket Report ---");
        System.out.println("Total Tickets: " + ticketCount);
        System.out.println("Pending: " + pendingCount);
        System.out.println("Resolved: " + resolvedCount);
    }
}
