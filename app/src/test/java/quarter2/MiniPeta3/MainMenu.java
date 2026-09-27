package quarter2.MiniPeta3;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class MainMenu {
    @Test
    public void testCompleteSystemFlow() {
        /*
         * 1. THE VIRTUAL KEYBOARD
         * A 'StringBuilder' acts as our virtual keyboard.
         */
        StringBuilder simulatedUserInput = new StringBuilder();

        System.out.println("--- GENERATING SIMULATED USER INPUTS ---");

        /*
         * PART 1: Simulating Inputs for UFStocksMainMenu (First System Now)
         * These are the inputs that UFStocksMainMenu will consume first.
         */
        System.out.println("Generating inputs for UFStocksMainMenu...");
        simulatedUserInput.append("2\n");    // Option 2: Contact Us
        simulatedUserInput.append("3\n");    // Option 3: News
        simulatedUserInput.append("6\n");    // Option 6: Open Account Menu
        simulatedUserInput.append("1\n");    // Account sub-menu option 1: Sign up with Google
        simulatedUserInput.append("7\n");    // Option 7: Exit UF Stocks completely (Moves to next system)

        /*
         * PART 2: Simulating Repetitive Tasks for UniformPickUp (Second System Now)
         * Once UFStocksMainMenu exits, UniformPickUp takes over and reads these inputs.
         */
        int interactionCount = 1;
        while (interactionCount <= 3) {
            System.out.println("Generating inputs for interaction #" + interactionCount);

            if (interactionCount == 1) {
                simulatedUserInput.append("1\n");
            } else if (interactionCount == 2) {
                simulatedUserInput.append("2\n");
                simulatedUserInput.append("300\n");
            } else {
                simulatedUserInput.append("2\n");
                simulatedUserInput.append("5000\n");
            }
            interactionCount++;
        }

        /*
         * PART 3: Simulating Sub-Menus or Specific Features for UniformPickUp
         */
        System.out.println("Generating inputs for specific features...");
        simulatedUserInput.append("3\n");    // E.g., Enter a specific sub-menu
        simulatedUserInput.append("1\n");    // E.g., Choose an option inside that sub-menu
        simulatedUserInput.append("9999\n"); // E.g., Type a specific value
        simulatedUserInput.append("3\n");    // E.g., Go back to the Main Menu

        /*
         * PART 4: Simulating the Exit Command for UniformPickUp
         * CRITICAL: Stop the final loop so the JUnit test finishes cleanly.
         */
        System.out.println("Generating input to Exit the second system...");
        simulatedUserInput.append("4\n"); // Exit option for UniformPickUp

        System.out.println("--- INPUT GENERATION COMPLETE ---\n");

        /*
         * 2. THE MAGIC CONVERSION
         * Convert our ordered inputs into a system stream.
         */
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedUserInput.toString().getBytes());

        /*
         * 3. THE AUTOMATED SCANNER
         */
        Scanner scanner = new Scanner(inputStream);

        UFStocksMainMenu mainSystem = new UFStocksMainMenu();
        mainSystem.start(scanner);

        UFStocksUniformReserve secondSystem = new UFStocksUniformReserve();
        secondSystem.start(scanner);

        UFStocksUniformPayment thirdSystem = new UFStocksUniformPayment();
        thirdSystem.start(scanner);

        scanner.close();
    }
}