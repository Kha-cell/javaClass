import java.util.Scanner;
   
   public class VoteElegibility {
      public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
 
      System.out.print("Enter your age:");
      int age = input.nextInt();

    if (age  == 16 ) {
      System.out.println("you can drive");
}

     else if(age  == 18 ) {
      System.out.println("you can vote!!");
}

     else if(age  >= 21 ) {
      System.out.println("you can drink\nbuh drink responsibly");
}

  }
}

