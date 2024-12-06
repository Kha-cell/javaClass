import java.util.Scanner;

public class Checkout {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] items = {"math-set in all kind ", "notebook", "school bags"};
        double[] prices = {100.0, 500.5, 700.5};
        double totalAmount = 0.0;

        System.out.println("Welcome to mario shopping complex\n what did you want please select from my items below :");

        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ". " + items[i] + " - $" + prices[i]);
        }

        boolean shopping = true;

        while (shopping) {
            System.out.print("Enter the item number to add to your cart (or 0 to finish): ");
            int itemNumber = input.nextInt();

            if (itemNumber == 0) {
                shopping = false;
            } else if (itemNumber > 0 && itemNumber <= items.length) {
                totalAmount += prices[itemNumber - 1];
                System.out.println(items[itemNumber - 1] + " added to your cart.");
            } else {
                System.out.println(" our complex is still a small scale business dont have that yet!!!..");
            }
        }

        System.out.println("Thank you! This is the amount you are paying\n cash or transfer account detail\n  7012732020\n  mario shopping complex and mall\n  kindly send screenshot to the email in front of the staff that caculating you goods thank you\n if it is cash give it to the staff also good bye see you another time: $" + totalAmount);
       
    }
}
