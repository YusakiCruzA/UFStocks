package quarter2.MiniPeta3;

import java.util.Scanner;

public class UFStocksMainMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=================================");
            System.out.println("      Welcome to UF Stocks!      ");
            System.out.println("=================================");
            System.out.println("Check available uniform stocks and");
            System.out.println("reserve them for school pick-up.");
            System.out.println("---------------------------------");
            System.out.println("1. RESERVE now!");
            System.out.println("2. Contact Us");
            System.out.println("3. News");
            System.out.println("4. About");
            System.out.println("5. Credits");
            System.out.println("6. Account (Log In / Sign Up)");
            System.out.println("7. Exit");
            System.out.println("=================================");
            System.out.print("Enter choice: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n[RESERVE] Checking uniform stocks and processing reservation...");
                    break;
                case 2:
                    System.out.println("\n[CONTACT US] Email: support@ufstocks.edu | Phone: (02) 8123-4567");
                    break;
                case 3:
                    System.out.println("\n[NEWS] Latest Update: New stock for physical education uniforms has arrived!");
                    break;
                case 4:
                    System.out.println("\n[ABOUT] UF Stocks allows students to reserve uniforms and pick them up at school.");
                    break;
                case 5:
                    System.out.println("\n[CREDITS] Developed for MiniPeta3.");
                    break;
                case 6:
                    showAccountMenu(input);
                    break;
                case 7:
                    System.out.println("\nExiting UF Stocks. Goodbye!");
                    break;
                default:
                    System.out.println("\nInvalid option. Please try again.");
            }

        } while (choice != 7);

        input.close();
    }

    // Sub-menu for the Account option shown in the UI
    public static void showAccountMenu(Scanner input) {
        System.out.println("\n--- UF Stocks Account ---");
        System.out.println("1. Sign up with Google");
        System.out.println("2. Sign up with Facebook");
        System.out.println("3. Sign up with Email");
        System.out.println("4. Already have an account? Log in");
        System.out.println("5. Back to Main Menu");
        System.out.print("Enter choice: ");

        int accountChoice = input.nextInt();

        switch (accountChoice) {
            case 1:
                System.out.println("Signing up with Google...");
                break;
            case 2:
                System.out.println("Signing up with Facebook...");
                break;
            case 3:
                System.out.println("Signing up with Email...");
                break;
            case 4:
                System.out.println("Please enter your login details.");
                break;
            case 5:
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}