import java.util.Scanner;
public class Multiple {
public static void main(String[]  args)  {
Scanner scan = new Scanner (System.in);
Boolean repeat = true;
while(repeat) {
System.out.Print("enter an integer");
int num = Scan.mextInt();


if(num % 5 == 0) {
System.out.Print(num + "is a multiple of 5");
}else{
System.out.print(num + "is not a  multiple of 5");
} 
System.out.println(do you still wan to check?(y/n):");
 char response = scan.next().charAt(0);
if(response =='n'|| response == 'N'){
repeat = false;
}
}
}