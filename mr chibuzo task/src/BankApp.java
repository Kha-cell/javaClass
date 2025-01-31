import java.util.Scanner;
public class  BankApp {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("what is your name? :");
String name = input.nextLine();
System.out.print("hello "+ "  "+name   );
System.out.println("welcome to mario microfinance bank");
System.out.print("Enter the amount to deposit: ");
double amount = input.nextDouble();
if(amount <= 0) {
    System.out.println("You can't deposit negative amount");
}else{

    System.out.println("You have deposited $" + amount + ".");
}
System.out.print("Enter the amount to withdraw: ");
double withdraw = input.nextDouble();
if(withdraw <= 0) {
    System.out.println("You can't withdraw negative amount");
}else{
    System.out.println("You have withdrawn $" + withdraw + ".");
}





}

}
