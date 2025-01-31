import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.print("Enter first  number: ");
     int firstNumber = input.nextInt();
     System.out.print("Enter second number: ");
     int secondNumber = input.nextInt();
     int  squareOne = firstNumber*firstNumber;
     int squareTwo = secondNumber*secondNumber;
     int sumOfSquare = squareOne + squareTwo;
     int  differenceOfSquare = squareOne  - squareTwo;
     System.out.print("Sum of SquaresOne is :" + squareOne);
        System.out.println("The sum of the squares is :" + sumOfSquare);
     System.out.print("Sum of SquaresTwo is :" + squareTwo);
     System.out.println("The difference of the squares is : " + differenceOfSquare);






    }





}
