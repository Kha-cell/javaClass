import java.util.Scanner;
public class Equality {
public static void main(String[]  args) {
Scanner input = new Scanner (System.in);
System.out.println("enter three numbers:");
int num1 = input.nextInt();
int num2 = input.nextInt();
int num3 = input.nextInt();
 if(num1 == num2) {
System.out.println("num are equal");
}
else if(num1 == num3) {
System.out.println("num are equal");
}
 else if(num2 == num1) {
System.out.println("num are equal");
}
 else  if(num2 == num1)  {
 System.out.println("num are  equal");
   }
else if(num2 == num3)  {
System.out.println("num are  equal");
}
else if(num1 != num2) {
System.out.println("num are not equal");
}
else if(num1 != num3) {
System.out.println("num are not equal");
}
else if(num2 != num1) {
System.out.println("num are not equal");
}
else if(num2 != num3) {
System.out.println("num are not equal");
}
else if(num3 != num1) {
System.out.println("num are not equal");
}
else if(num3 != num2) {
System.out.println("num are not equal");
}
  }
}