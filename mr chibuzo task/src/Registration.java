import java.util.Scanner;
public class Registration {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your first name: ");
    String firstName = input.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = input.nextLine();
    System.out.print("Enter your email: ");
    String email = input.nextLine();
    System.out.print("Enter your password: ");
    String password = input.nextLine();
    System.out.print("Enter your password again to confirm the password you just entered!!");
    String confirmPassword = input.nextLine();
    System.out.print("Enter your confirm password: ");
    String confirmPassword2 = input.nextLine();
    System.out.print("Enter your phone number: ");
    int phoneNumber = input.nextInt();
    if (phoneNumber != 11 ) {
    System.out.println("Invalid phone number!");
    }

    System.out.print("hi   " + firstName + " " + lastName);
    System.out.print("dear Customer  you have just registered to Audiomack kindly upgrade to Audiomack+      ");
    System.out.print("Kindly listen to understand  by omah lay : ");
        if (confirmPassword.equals(password)) {
            System.out.println("You have successfully registered to Audiomack");

        } else {
            System.out.println("inconsistent password");
        }
        if (phoneNumber == 11) {
            System.out.println("Your number have been confirmed kindly check your phone sms code as been sent to your email");
        }
        else if (phoneNumber != 11) {
            System.out.print("kindly check the number you input i don't know what you are doing. the number is not correct: ");
        }
        System.out.println("Thank you for registering your Audiomack");

}


}

