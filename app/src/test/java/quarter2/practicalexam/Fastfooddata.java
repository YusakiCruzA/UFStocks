package quarter2.practicalexam;

import java.util.Scanner;

public class Fastfooddata {

    public void start(Scanner scanner) {
        double price = 0;

        while (true) {
            int choice = scanner.nextInt();

            if (choice == 1) {
                price = 50;
                System.out.println("Order selected: $95");
            }
            else if (choice == 2) {
                double payment = scanner.nextDouble();
                if (payment < price) {
                    System.out.println("The payment is insufficient.");
                } else {
                    System.out.println("Payment is sufficient! Change: $" + (payment - price));
                    price = 0;
                }
            }
            else if (choice == 3) {
                System.out.println("Exiting the Data");
                break;
            }
        }
    }
}