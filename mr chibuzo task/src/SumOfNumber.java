import java.util.Scanner;
public class SumOfNumber        {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int number = input.nextInt();
    int sum = number+ number;
    System.out.println("The sum the number you input is "   + sum);
    System.out.print("did you wish to continue ( press 1 to continue -1 to exit):");
     if (input.nextInt() == 1) {
         System.out.println("enter an integer");


     }else{
         System.out.println("program exited");
     }

    }
}
