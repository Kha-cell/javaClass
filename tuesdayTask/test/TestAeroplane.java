import java.util.Scanner;
public class TestAeroplane {
    public static void main(String[] args) {
        System.out.println("hello world");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the name of your Aeroplane");

        String name = scanner.nextLine();
        System.out.println("this Aeroplane is " + name);


    }
}