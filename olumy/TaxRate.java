import java.util.Scanner;
public class TaxRate   {
public static void main(String[]  args)  {
Scanner input = new Scanner(System.in);
System.out.print("enter your annual:");
 int annual = input.nextInt();
if(annual <= 1000)  {
 System.out.print("your tax is\n 10%");
 }
 else if (annual <= 4000)  {
 System.out.print("your tax is\n 12%");
 }
else if (annual <= 8500)  {
 System.out.print("your tax is\n 22%");
 }

else if(annual <= 10000)  {
 System.out.print("your tax is\n 24%");
 }
}
}






