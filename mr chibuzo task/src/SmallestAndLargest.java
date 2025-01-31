import java.util.Scanner;
public class SmallestAndLargest {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter fisrt number: ");
      int firstNum = input.nextInt();
      System.out.print("Enter second number: ");
      int secondNum = input.nextInt();
      System.out.print("enter third number: ");
      int thirdNum = input.nextInt();
      int sum = firstNum + secondNum + thirdNum;
      int product = firstNum * secondNum * thirdNum;
      int average = sum / 3;
      System.out.println("Sum: " + sum);
      System.out.println("Average: " + average);
      System.out.println("Product: " + product);


  }






}
