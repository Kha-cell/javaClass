import java.util.Scanner;

  public class Rank {
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
System.out.print("1 2 3 4:");
  int rank = input.nextInt();
  switch(rank) {
   case 1:
     System.out.println("Gold Medal");
   break;
   case 2:
     System.out.println("Sliver Medal");
   break;
   case 3:
     System.out.println("Bronze Medal");
   break;
   case 4:
     System.out.println("Participant Ribbon");
   break;
}
}
}