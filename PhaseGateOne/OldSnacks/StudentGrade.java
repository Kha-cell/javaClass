import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       	 System.out.print("welcome to lagbaja school\nhow many student do you have: ");
       	 int numberOfStudents = input.nextInt();
		
       	 System.out.print("how many subject do each student offer: ");
       	 int numberOfSubjects = input.nextInt(); 
		System.out.println("saving>>>>>>>>>>>>>>>>>");
		System.out.println("saved succesfully");

       	 System.out.println("Number of students: " + numberOfStudents);
       	 System.out.println("Number of subjects: " + numberOfSubjects);

        	int[][] scores = new int[numberOfStudents][numberOfSubjects];

 for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter scores for student " + (i + 1) + ":");
            for (int f = 0; f < numberOfSubjects; f++) {
                while (true) {
                    System.out.print("Subject " + (f + 1) + ": ");
                    int score = input.nextInt();
                    if (score >= 0 && score <= 100) {
                        scores[i][f] = score;
                        break;
                    } else {
                        System.out.println("Score out of range input score from 1-100." );
                    }
      
          }

      }
   }
   		System.out.println("================================================================================================================================================");

	for (int i = 0;i < numberOfSubjects;i++){
	     System.out.print("\t\t\tsub" + (i + 1));
}
	for (int i = 0;i < 1;i++){
	     System.out.print("\ttotal");
}
	for (int i = 0;i < 1;i++){
	     System.out.print("\t\t\t  average");
}	System.out.println("\n===============================================================================================================================");
	

	for (int i = 0; i <  numberOfStudents; i++) {
            int total = 0;
		System.out.print("\nstudent" + (i + 1) + ":\t\t");
            	for (int f = 0; f < numberOfStudents; f++) {
			System.out.print((scores[i][i]) + " \t\t"); 
			 total += scores[i][f];     
 }
		  float averageScore = (float) total /  numberOfStudents;
            System.out.println("  Total: " + total + "\t\t  Average: " + averageScore);
}
}

	
}
