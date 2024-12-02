import java.util.Scanner;

public class SumNumbers {
    public static int sumTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        int sum = sumTwoNumbers(number1, number2);
        System.out.println("The sum of " + number1 + " and " + number2 + " is " + sum);

   
        scanner.close();
    }
}
