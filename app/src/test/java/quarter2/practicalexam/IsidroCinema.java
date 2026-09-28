package quarter2.practicalexam;

import java.util.Scanner;

public class IsidroCinema {

    public void start(Scanner scanner) {
        boolean running = true;

        while (running) {
            System.out.println("\n--- CINEMA SYSTEM ---");
            System.out.println("1. Buy Ticket");
            System.out.println("2. Buy Snacks");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            if (!scanner.hasNextInt()) {
                break;
            }
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clears the buffer newline character

            switch (choice) {
                case 1:
                    handleTicketPurchase(scanner);
                    break;
                case 2:
                    handleSnackPurchase();
                    break;
                case 3:
                    System.out.println("Exiting system. Thank you!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    private void handleTicketPurchase(Scanner scanner) {
        System.out.print("Enter your age: ");
        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            scanner.nextLine();

            // Age boundary validation logic
            if (age < 18) {
                System.out.println("Access Denied: You must be 18 or older to buy a ticket.");
            } else {
                System.out.println("Success: Ticket Printed!");
            }
        }
    }

    private void handleSnackPurchase() {
        System.out.println("Snack Menu Opened: Popcorn and drinks added to your order!");
    }
}