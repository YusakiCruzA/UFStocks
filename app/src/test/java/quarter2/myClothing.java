package quarter2.MiniPeta3;

import org.junit.Test;

public class myClothing {
    @Test
    public void myclothing() {
        int choice = 1;
        do {
            String c1 = "G. Nursery-3 Clothing";
            String c2 = "G. 4-6 Clothing";
            String c3 = "G. 7-10 Clothing";
            String c4 = "G. 11-12 Clothing";

            System.out.println("Available for MCSIANS!");
            System.out.println("Please select a specific Grade level you are in, in order to find what you need for your uniforms/clothing.");
            System.out.println("- Go to: " + c1 + "?");
            System.out.println("- Go to: " + c2 + "?");
            System.out.println("- Go to: " + c3 + "?");
            System.out.println("- Go to: " + c4 + "?");
            break;
        } while (choice == 1);
    }
}
