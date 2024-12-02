import java.util.Scanner;

public class SumNumbers {
    public static double sumTwoNumbers(double num1, double num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();
        double sum = sumTwoNumbers(number1, number2);
        System.out.println("The sum of " + number1 + " and " + number2 + " is " + sum);

   
        scanner.close();
    }
}
