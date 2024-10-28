import java.util.Scanner;

public class EnergyNeeded {

 	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("amount of water in kilogram:");
	float amount = input.nextFloat();
	System.out.print("enter initial temperature:");
	double initial = input.nextDouble();
	System.out.print("enter final temperature:");
	double temperature = input.nextDouble();
	double caculation = (initial * temperature);
	System.out.printf("%f",caculation);

	


	
    }
}