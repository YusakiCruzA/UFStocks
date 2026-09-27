package quarter2.practicalexam;

import java.util.Scanner;

public class BernabeGym {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BernabeGym gymSystem = new BernabeGym();
        gymSystem.start(scanner);
        scanner.close();
    }
    public void start(Scanner scanner) {
        boolean running = true;

        while (running) {
            System.out.println("===== GYM SYSTEM =====");
            System.out.println("[1] Enter Gym");
            System.out.println("[2] Hire Trainer");
            System.out.println("[3] Exit System");
            System.out.print("Choose an option: ");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                    System.out.println("\nYou entered the gym!\n");

                } else if (choice == 2) {
                    System.out.println("\n--- Hire Trainer ---");
                    System.out.print("Enter membership tier level (1 or 2): ");

                    if (scanner.hasNextInt()) {
                        int level = scanner.nextInt();
                        scanner.nextLine();

                        if (level == 1) {
                            System.out.println("\nVIP Membership — Level 1");
                            System.out.println("Trainer Assigned! Welcome VIP Member!\n");
                        } else if (level == 2) {
                            System.out.println("\nBasic Membership");
                            System.out.println("Upgrade Required — Level 2 trainers not available.\n");
                        } else {
                            System.out.println("\nInvalid level!\n");
                        }
                    } else {
                        System.out.println("\nInvalid input!\n");
                        scanner.nextLine();
                    }

                } else if (choice == 3) {
                    System.out.println("\nExiting system... Goodbye!");
                    running = false;

                } else {
                    System.out.println("\nInvalid choice! Please enter a number from 1 to 3.\n");
                }

            } else {
                System.out.println("\nInvalid input! Please enter a valid number.\n");
                scanner.nextLine();
            }
        }
    }
}