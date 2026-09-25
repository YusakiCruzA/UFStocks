package quarter2.practicalexam;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Fastfood {
    @Test
    public void ffdata() {
        StringBuilder automatedInput = new StringBuilder();
        System.out.println("--- FAST FOOD DATA ---");
//  1: Choosing the order
        automatedInput.append("1\n"); // Choose the order
//  2: Testing insufficient Payments
        automatedInput.append("2\n"); // Choosing to pay the fines
        automatedInput.append("50\n"); // Entering the payment, expecting it to be wrong
//  3: Testing sufficient Payments
        automatedInput.append("2\n"); // Choosing to pay the fines
        automatedInput.append("95\n"); // Entering the payment, expecting it to be right
//  4: Exit system
        automatedInput.append("3\n"); // Exiting
        System.out.println("--- DATA FINISHED ---\n");
        ByteArrayInputStream inputStream = new ByteArrayInputStream(automatedInput.toString().getBytes());
        Scanner scanner = new Scanner(inputStream);
        Fastfooddata FFSystem = new Fastfooddata();
        FFSystem.start(scanner);
    }
}
