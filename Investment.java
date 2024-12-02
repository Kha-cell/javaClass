import java.util.Scanner;
public class Investment  {
public static void main(String[]  args){
Scanner input = new Scanner(System.in);
System.out.print("enter investment amount:");
double investment = input.nextDouble();
System.out.print("enter annual interest rate:");
double interest = input.nextDouble();
System.out.print("enter number of year:");
int year = input.nextInt();

double FutureInvestmentValue$ = investment * ( 1 + interest ),math.power * 12;
System.out.printf("%f", FutureInvestmentValue$ );


   }
}