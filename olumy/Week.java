import java.util.Scanner;
public class Week {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
 System.out.println("1\n2\n3\n4\n5\n6\n7");
   int number = input.nextInt();

   switch(number) {
  case 1:
     System.out.println("Monday");
   break;
  case 2:
     System.out.println("Tuesday");
   break;
  case 3:
     System.out.println("Wenesday");
   break;
  case 4:
     System.out.println("Thursday");
    break;
  case 5:
     System.out.println("Friday");
    break;
  case 6:
     System.out.println("Saturday");
    break;
  case 7:
     System.out.println("Sunday");
    break;
}
}
}