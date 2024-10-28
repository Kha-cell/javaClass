

import java.util.Scanner;

public class NumberOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        
        if (num1 < num2 && num2 < num3) {
            System.out.println("Numbers are in increasing order.");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("Numbers are in decreasing order.");
        } else {
            System.out.println("Numbers are not in increasing or decreasing order.");
        }

        
    }
}