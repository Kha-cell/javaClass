import java.util.Scanner;
   public class MyAge {
      public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
 
      System.out.print("Enter your age:");
      int age = input.nextInt();
 
      if (age  <= 12) {
      System.out.println("still a child");
}
      else if(age  <= 17 ) {
      System.out.println("still a Teenager");
}
      else if (age  <= 64 ) {  
      System.out.println("you look like an adult");
}
       else if(age == 65) {
       System.out.println("senior agba");
}

  }
}
   