  import java.util.Scanner;
   public class Maximum {
     public static void main(String[] args) {
     Scanner Scanner = new Scanner(System.in);
   
     System.out.println("Enter 3 number");
     int number1 = Scanner.nextInt();
     int number2 = Scanner.nextInt();
     int number3 = Scanner.nextInt();
     int maxnumber = number1;

     if (number2 > number1) {
     maxnumber = number2;
}
     if (number3 > number2) {
     maxnumber = number3;
}
     
     System.out.printf("The max number is %d", maxnumber);
    

     }
}