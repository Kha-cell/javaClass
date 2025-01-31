import java.util.Scanner;
public class Caculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter fisrt number :");
        int FirstNum = input.nextInt();
        System.out.print("enter second number :");
        int SecondNum = input.nextInt();
        System.out.print("enter third number :");
        int ThirdNum = input.nextInt();
        int Multiply = FirstNum * SecondNum * ThirdNum;
        System.out.println("The product of three numbers are  : "+Multiply);
    }
}