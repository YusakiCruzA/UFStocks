package quarter2.MiniPeta3;

import java.util.Scanner;

class UFStocksUniformPayment {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice = 1;

        do {
            System.out.println("\n--- UFStocksUniformPayment ---");
            System.out.println("1. Uniform Payment");
            System.out.println("2. Paymaya, Gcash, or Cash on Delivery");

            choice = input.nextInt();

            if (choice == 2) {
                System.out.println("1. Select Your Payment.");
                System.out.println("2. Pickup Or Cash on Delivery.");
                System.out.println("3. Exit.");
            }

        } while (choice != 3);

        input.close();
    }
}
