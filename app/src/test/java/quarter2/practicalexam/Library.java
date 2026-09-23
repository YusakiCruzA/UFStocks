package quarter2.practicalexam;

import java.util.Scanner;

public class Library {
    public void start(Scanner scanner) {
        int choice;
        while (true) {
            if (!scanner.hasNextInt()) {
                break;
            }
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Book borrowed successfully.");
            } else if (choice == 2) {
                if (scanner.hasNextDouble()) {
                    double payment = scanner.nextDouble();
                    if (payment < 15) {
                        System.out.println("Insufficient");
                    } else {
                        double change = payment - 15;
                        System.out.println("Change: " + change);
                    }
                }
            } else if (choice == 3) {
                System.out.println("Exiting system.");
                break;
            }
        }
    }
}
