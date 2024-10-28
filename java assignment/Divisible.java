import java.util.Scanner;
public class Divisible  {
public static void main(String[]  args)  {
Scanner scan = new Scanner (System.in);
System.out.print("enter an integer:");
int num = scan.nextInt();
 
 if(num % 5 == 0 && num % 11 == 0) {
System.out.println(num +  "is  divisible by 5 and 11");
}else{
 System.out.println(num +  "is not divisible by 5 and 11");
} 
}
}