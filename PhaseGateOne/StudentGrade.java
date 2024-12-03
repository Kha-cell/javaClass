import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       	 System.out.print("how many student do you have: ");
       	 int numberOfStudents = input.nextInt();
		System.out.println("saving>>>>>>>>>>>>>>>>>");
		System.out.println("saved succesfully ");
       	 System.out.print("how many subject do each student offer: ");
       	 int numberOfSubjects = input.nextInt(); 
		System.out.println("saving>>>>>>>>>>>>>>>>>");
		System.out.println("saved succesfully");

       	 System.out.println("Number of students: " + numberOfStudents);
       	 System.out.println("Number of subjects: " + numberOfSubjects);

        	int[][] scores = new int[numberOfStudents][numberOfSubjects];

 for (int i = 0; i < numberofstudent; i++) {
            System.out.println("Enter scores for student " + (i + 1) + ":");
            for (int j = 0; j < numberofsubject; j++) {
                while (true) {
                    System.out.print("Subject " + (j + 1) + ": ");
                    int score = input.nextInt();
                    if (score >= 0 && score <= 100) {
                        scores[i][j] = score;
                        break;
                    } else {
                        System.out.println("Score must be between 0 and 100. Please enter again.");
                    }
      
          }

      }
    }
  }
}
