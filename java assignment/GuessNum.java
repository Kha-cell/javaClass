import java.util.Random;
import java.util.Scanner;

public class  GuessNum {
    public static void main(String[] args) {
    Random random = new Random();
     int randomNumber = random.nextInt();
      Scanner Scanner = new Scanner(System.in);
       int attempts = 0;
     
       
       

        System.out.println("Guess a number between 1 and 100");

       
            System.out.print("Enter your guess number: ");
            int userGuess = Scanner.nextInt();
            

            if (userGuess < 30) {
                System.out.println("Too low, try next time");
            } else if (userGuess > 30) {
                System.out.println("Too high, try next time");
            } else {
                System.out.println("correct");
                
            }
        

    
    }
}