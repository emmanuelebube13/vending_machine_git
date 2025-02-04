import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
            Pseudocode:
            Accepts users input
            match the user price with the product price.
            if the user amount is greater or equal to the product price: hence generate change.
            if the user amount is less than product price: an input statement requesting more money, till the price is complete.
            then display end message and change.
            end.
         */

        double[] vend = {0.0, 1.25, 0.75, 0.90, 0.75, 1.50, 0.75}; // Product prices
        System.out.println("Available Products:");
        for (int i = 1; i < vend.length; i++) {
            System.out.printf("Product %d - $%.2f\n", i, vend[i]);
        }
        System.out.println();

        Scanner vending = new Scanner(System.in);
        System.out.print("Enter Product and price: ");
        // stating the user's price and product
        int product = vending.nextInt();
        float price = vending.nextFloat();
        double amount = vend[product];
        double change = price - amount;

        if (change >= 0) {
            System.out.printf("Thank you for buying item %d. Your change is $%.2f", product, change);
        } else {
            change = change * -1;
            System.out.printf("Please insert another $%.2f\n", change);

            // Keep prompting the user for more money until the full amount is met
            while (price < amount) {
                System.out.print("Insert additional amount: ");
                price += vending.nextFloat();
                change = price - amount;
            }

            // Display final thank-you message with the remaining change
            System.out.printf("Thank you for buying item %d. Your change is $%.2f", product, change);
        } // else statement
    } // main
} // Main
