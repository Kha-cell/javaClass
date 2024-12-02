import java.util.Scanner;

public class Temperature  {
public static void main(String[]  args)  {

Scanner input = new Scanner(System.in);
System.out.print("enter a temperature level you wants to check: ");
int temperature = input.nextInt();
 if (temperature == 10)  {
   System.out.print("temperature is cold currently");
 }
 else if (temperature > 10)  {
 System.out.print("temperature is hot currently");
  }
else if (temperature > 25)  {
 System.out.print("temperature is hot currently");
}
}
}