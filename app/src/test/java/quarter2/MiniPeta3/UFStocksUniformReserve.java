package quarter2.MiniPeta3;

import java.util.Scanner;

public class UFStocksUniformReserve {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UFStocksUniformReserve pickup = new UFStocksUniformReserve();
        pickup.start(scanner);
        scanner.close();
    }

    public void start(Scanner scanner) {
        int choice = 0;
        double balance = 500.0;    // User money
        double totalSpent = 0.0;  // Total money used

        // The program runs continuously until the user types 3 to Exit
        while (choice != 3) {
            System.out.println("\n=== UNIFORM RESERVE SYSTEM ===");
            System.out.println("Current Balance: $" + balance);
            System.out.println("Total Spent: $" + totalSpent);
            System.out.println("1. View and Buy Uniforms");
            System.out.println("2. Check Balance & Spent Info");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            // Input validation for numbers
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the bad input
                continue;
            }

            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("\n--- Available Uniforms ---");
                System.out.println("1. Senior Polo - $250.0");
                System.out.println("2. Senior Pants - $300.0");
                System.out.println("3. P.E. Uniform - $350.0");
                System.out.print("Choose an item number to buy: ");

                if (scanner.hasNextInt()) {
                    int itemChoice = scanner.nextInt();
                    double price = 0;
                    String itemName = "";

                    // Determine name and price based on choice
                    if (itemChoice == 1) {
                        itemName = "Senior Polo";
                        price = 250.0;
                    } else if (itemChoice == 2) {
                        itemName = "Senior Pants";
                        price = 300.0;
                    } else if (itemChoice == 3) {
                        itemName = "P.E. Uniform";
                        price = 350.0;
                    } else {
                        System.out.println("Invalid item choice!");
                        continue; // Skip back to the main menu
                    }

                    // Check if the user has enough money
                    if (balance >= price) {
                        balance = balance - price;      // Deduct money
                        totalSpent = totalSpent + price; // Track total spent
                        System.out.println("Successfully bought " + itemName + " for $" + price);
                    } else {
                        System.out.println("Insufficient balance! You need $" + (price - balance) + " more.");
                    }
                } else {
                    System.out.println("Invalid input. Returning to menu.");
                    scanner.next();
                }

            } else if (choice == 2) {
                System.out.println("\n--- Account Summary ---");
                System.out.println("Remaining Balance: $" + balance);
                System.out.println("Total Amount Spent: $" + totalSpent);

            } else if (choice == 3) {
                System.out.println("Exiting Uniform Reserve System. Thank you!");

            } else {
                System.out.println("Invalid choice. Please choose 1, 2, or 3.");
            }
        }
    }
}
