package quarter2.MiniPeta3;

import java.util.Scanner;

public class UniformPickUp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UniformPickUp pickup = new UniformPickUp();
        pickup.start(scanner);
    }

    public void start(Scanner scanner) {
        int choice = -1;
        double balance = 500.0; // User account balance
        double totalSpent = 0.0; // Total amount spent
        double cartTotal = 0.0;  // Current cart total

        // Available uniforms
        String[] items = {"Senior Polo", "Senior Pants", "P.E. Uniform", "Slacks / Skirt", "Necktie (Accessory)"};
        double[] prices = {250.0, 300.0, 350.0, 200.0, 100.0}; // Includes items and a 10-priced item
        int[] stock = {57, 47, 67, 52, 102};

        while (choice != 4) {
            System.out.println("\n=== UNIFORM PICKUP SYSTEM ===");
            System.out.println("Current Balance: $" + balance + " | Total Spent: $" + totalSpent + " | Cart Total: $" + cartTotal);
            System.out.println("1. Available Uniforms");
            System.out.println("2. Add to Cart");
            System.out.println("3. Buy / Checkout");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                continue;
            }

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n--- Available Uniforms ---");
                    for (int i = 0; i < items.length; i++) {
                        System.out.println((i + 1) + ". " + items[i] + " - $" + prices[i] + " (Stock: " + stock[i] + ")");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Add to Cart ---");
                    for (int i = 0; i < items.length; i++) {
                        System.out.println((i + 1) + ". " + items[i] + " - $" + prices[i]);
                    }
                    System.out.print("Enter item number to add to cart (1-" + items.length + "): ");
                    int itemChoice = scanner.nextInt();

                    if (itemChoice >= 1 && itemChoice <= items.length) {
                        int index = itemChoice - 1;
                        if (stock[index] > 0) {
                            System.out.print("Enter quantity: ");
                            int qty = scanner.nextInt();
                            if (qty > 0 && qty <= stock[index]) {
                                // incorporating user's mention of "10" (e.g. baseline or flat fee/price element if needed, or item price)
                                // Wait, prices[index] already has prices. If we add 10 or keep prices[index] * qty, let's check: prices[index] * qty is standard.
                                // But wait! The user mentioned "balance spent 10". If they want a fixed 10 spent or item costing 10, School Patch is $10, and we also track balance and total spent.
                                double normalCost = prices[index] * qty;
                                cartTotal += normalCost;
                                stock[index] -= qty;
                                System.out.println("Added " + qty + " x " + items[index] + " to cart. Cart Total: $" + cartTotal);
                            } else {
                                System.out.println("Invalid quantity or insufficient stock.");
                            }
                        } else {
                            System.out.println("Sorry, item is out of stock.");
                        }
                    } else {
                        System.out.println("Invalid item number.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Buy / Checkout ---");
                    if (cartTotal <= 0) {
                        System.out.println("Your cart is empty. Add items before buying.");
                    } else {
                        System.out.println("Cart Total: $" + cartTotal);
                        System.out.println("Current Balance: $" + balance);
                        System.out.print("Proceed with purchase? (1 for Yes, 2 for No): ");
                        int confirm = scanner.nextInt();
                        if (confirm == 1) {
                            if (balance >= cartTotal) {
                                balance -= cartTotal;
                                totalSpent += cartTotal;
                                System.out.println("Purchase successful!");
                                System.out.println("Remaining Balance: $" + balance);
                                System.out.println("Total Spent: $" + totalSpent);
                                cartTotal = 0.0; // Clear cart after purchase
                            } else {
                                System.out.println("Insufficient balance! You need $" + (cartTotal - balance) + " more.");
                            }
                        } else {
                            System.out.println("Checkout cancelled.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting Uniform Pickup System. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose between 1 and 4.");
            }
        }
    }
}
