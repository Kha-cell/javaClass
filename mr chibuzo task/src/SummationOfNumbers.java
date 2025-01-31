import java.util.Scanner;
public class SummationOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String counter = " ";
        do {
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            int sum = number + number;
            System.out.println("The sum of  the number you input is " + sum);
            System.out.print("did you want to continue this program ? if yes enter 1 and if no enter Stop :");
            input.nextLine();
            counter = input.nextLine();
        }while (!counter.equalsIgnoreCase(   "stop"));



    }


}


