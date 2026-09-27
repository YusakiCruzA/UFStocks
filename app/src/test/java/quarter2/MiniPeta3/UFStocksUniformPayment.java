package quarter2.MiniPeta3;

import java.util.Scanner;

public class UFStocksUniformPayment {

    // 1. Regular execution point if you run this class directly
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UFStocksUniformPayment paymentSystem = new UFStocksUniformPayment();
        paymentSystem.start(scanner);
        scanner.close();
    }
    public void start(Scanner scanner) {
        int choice = 0; // Fixed: Declared the choice variable

        do {
            System.out.println("\n--- UFStocksUniformPayment ---");
            System.out.println("1. Uniform Payment");
            System.out.println("2. Paymaya, Gcash, or Cash on Delivery");
            System.out.println("3. Exit"); // Added Exit to the main list for clarity
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("\n[PAYMENT] Processing your Uniform Payment...");
            } else if (choice == 2) {
                System.out.println("\n--- Payment Options ---");
                System.out.println("1. Select Your Payment.");
                System.out.println("2. Pickup Or Cash on Delivery.");
                System.out.println("3. Back to Menu.");
                System.out.print("Enter payment option: ");

                int subChoice = scanner.nextInt();
                System.out.println("Option " + subChoice + " selected.");
            } else if (choice == 3) {
                System.out.println("\nExiting Payment System.");
            } else {
                System.out.println("\nInvalid option. Please try again.");
            }

        } while (choice != 3);
    }
}