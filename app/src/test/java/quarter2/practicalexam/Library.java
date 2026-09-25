package quarter2.practicalexam;

import java.util.Scanner;

    public class Library {
        public void start(Scanner scanner) {
            int choice = -1;

            while (choice != 0) {
                System.out.println("\n--- Library System ---");
                System.out.println("1. Add book");
                System.out.println("2. Pay fine");
                System.out.println("3. Exit");
                System.out.print("Enter choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Adding a book...");
                        break;
                    case 2:
                        System.out.print("The fine is 10. Enter payment amount: ");
                        int payment = scanner.nextInt();
                        if (payment < 10) {
                            System.out.println("Insufficient balance.");
                        } else {
                            System.out.println("Fine paid! Change: " + (payment - 10));
                        }
                        break;
                    case 3:
                    case 0:
                        System.out.println("Exiting...");
                        choice = 0; // Ensures loop terminates
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        }
    }