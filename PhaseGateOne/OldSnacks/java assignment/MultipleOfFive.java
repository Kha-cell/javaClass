


import java.util.Scanner;

public class MultipleOfFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        
        if (num % 5 == 0) {
            System.out.println(num + " is a multiple of 5.");
        } else {
            System.out.println(num + " is not a multiple of 5.");
        }

        
    }
}

