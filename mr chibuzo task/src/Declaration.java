import java.util.Scanner;
public class Declaration {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("enter the fisrt integer:");
    int X = input.nextInt();
    System.out.print("enter the second integer:");
    int  Y = input.nextInt();
    System.out.print("enter the third integer:");
    int Z = input.nextInt();
    int multiply = X * Y * Z;
    System.out.println("Product is  = " + multiply);

}


}


