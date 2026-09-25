import java.util.Scanner;

public class Gym {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        start(scanner);
    }

    public static void start(Scanner scanner) {
        boolean running = true;

        while (running) {
            System.out.println("===== GYM SYSTEM =====");
            System.out.println("[1] Enter Gym");
            System.out.println("[2] VIP Membership (Level 1)");
            System.out.println("[3] Basic Membership");
            System.out.println("[4] Exit System");
            System.out.print("Choose an option: ");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                    System.out.println("\nYou entered the gym!\n");

                } else if (choice == 2) {
                    System.out.println("\nVIP Membership — Level 1");
                    System.out.println("Trainer Assigned! Welcome VIP Member!\n");

                } else if (choice == 3) {
                    System.out.println("\nBasic Membership");
                    System.out.println("Upgrade Required — Level 2 trainers not available.\n");

                } else if (choice == 4) {
                    System.out.println("\nExiting system... Goodbye!");
                    running = false;

                } else {
                    System.out.println("\nInvalid choice! Please enter a number from 1 to 4.\n");
                }

            } else {
                System.out.println("\nInvalid input! Please enter a valid number.\n");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}