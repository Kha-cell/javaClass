import java.util.Scanner;
 public class GuessingGameLoop{
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);
     
     int number;
      int random ;
 do {
     System.out.print("Enter a number from 0-100 :");
      number = .nextInt();
      random =  30;
    if (number == random ){
       System.out.print("Congratulation you are correct");
}else if (number > random){
     System.out.print("Too high try again!!!");
}else if(number < random){
     System.out.print("Too low try again!!!");
}   

}  while(number != random);


}






}