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

	System.out.println("this is the class summary for lagbaja high school");
		for (int i = 0; i < numberOfStudents; i++) {
            int totalScore = 0;
            System.out.print("Scores for student " + (i + 1) + ": ");
            for (int f = 0; f < numberOfSubjects; f++) {
                System.out.print(scores[i][f] + " ");
                totalScore += scores[i][f];
            }
	     float aveScore = (float)  totalScore / numberOfSubjects;
		System.out.println(" | Total: " + totalScore + " | Average: " + aveScore);
        }






       }
}
