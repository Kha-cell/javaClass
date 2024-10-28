import java.util.Scanner;

public class Sum{
 public static void main(String[] args){
 
Scanner input = new Scanner(System.in);
System.out.print("Enter integer  ");
 int number = input.nextInt();
 
 int num1 = (number/100);
 int num2 = (number%100)/10;
 int num3 = number % 10;

int sum = num1 + num2 + num3;

System.out.print("Sum of the digit in the integer " + sum );


  }
}