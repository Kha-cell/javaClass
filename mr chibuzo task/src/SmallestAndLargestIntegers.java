import java.util.Scanner;

public class SmallestAndLargestIntegers {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int first = input.nextInt();

        System.out.print("Enter the second integer: ");
        int second = input.nextInt();

        System.out.print("Enter the third integer: ");
        int third = input.nextInt();

        System.out.print("Enter the fourth integer: ");
        int fourth = input.nextInt();

        System.out.print("Enter the fifth integer: ");
        int fifth = input.nextInt();

        int largest = first;
        int smallest = first;


        if (second > largest) {
            largest = second;
        }
        if (third > largest) {
            largest = third;
        }
        if (fourth > largest) {
            largest = fourth;
        }
        if (fifth > largest) {
            largest = fifth;
        }


        if (second < smallest) {
            smallest = second;
        }
        if (third < smallest) {
            smallest = third;
        }
        if (fourth < smallest) {
            smallest = fourth;
        }
        if (fifth < smallest) {
            smallest = fifth;
        }


        System.out.println("The largest integer is: " + largest);
        System.out.println("The smallest integer is: " + smallest);


    }
}
