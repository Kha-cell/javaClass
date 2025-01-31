import java.util.Scanner;
public class Bmi  {
 public static void main(String[] args) {
     Scanner input  = new Scanner(System.in);
     System.out.print("Enter weight in pounds: ");
int weight = input.nextInt();
System.out.print("Enter height in inches: ");
int height = input.nextInt();
int bmi = weight*703/height*height;
System.out.print("your bmi is :  " + bmi);






 }










}
