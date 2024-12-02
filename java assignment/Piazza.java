import java.util.Scanner;

public class PizzaWahala {

    static String[][] pizzaDetails = {
        {"Normal", "4", "2500"},
        {"Manage", "6", "2900"},
        {"Salary earner", "8", "4000"},
        {"Boss", "12", "5200"}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of people: ");
        int numPeople = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter the type  of pizza you want (Normal 4, 2500 per box, Manage 6, 2900 perbox, Salary earner 8, 4000 per box, Boss 12,5200 per box): ");
        String pizzaType = scanner.nextLine();

        int pizzaIndex = getPizzaIndex(pizzaType);

        if (pizzaIndex == -1) {
            System.out.println("Invalid pizza type!");
            return;
        }

        int slicesPerBox = Integer.parseInt(pizzaDetails[pizzaIndex][1]);
        int pricePerBox = Integer.parseInt(pizzaDetails[pizzaIndex][2]);

        int boxesNeeded = (numPeople + slicesPerBox - 1) / slicesPerBox;         int totalSlices = boxesNeeded * slicesPerBox;
        int leftoverSlices = totalSlices - numPeople;
        int totalPrice = boxesNeeded * pricePerBox;

        System.out.println("\nNumber of boxes of pizza to buy = " + boxesNeeded + " boxes");
        System.out.println("Number of leftover slices after serving = " + leftoverSlices + " slices");
        System.out.println("Total price = " + totalPrice + " naira");
    }

    public static int getPizzaIndex(String pizzaType) {
        for (int i = 0; i < pizzaDetails.length; i++) {
            if (pizzaDetails[i][0].equalsIgnoreCase(pizzaType)) {
                return i;
            }
        }
        return -1;     }
}
