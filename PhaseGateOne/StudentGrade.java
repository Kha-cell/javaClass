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

       	 for (int i = 0; i < numberOfStudents; i++) {
           	 System.out.println("Enter scores for student " + (i + 1) + ":");
          	  for (int f = 0; f < numberOfSubjects; f++) {
            	System.out.print("scores for subject " + (f + 1) + ": ");
   		scores[i][f] = input.nextInt();
	}
     
      }
	System.out.println("\nStudent Scores: ");
	for(int i = 0; i < numberOfStudents; i++) {
		System.out.println("Scores for student " + (i +1) + ":");
		for(int f = 0; f < numberOfSubjects; f++)  {
	System.out.println("Subject " + (f + 1) + ":" + scores[i][f]);
    	System.out.println("==============================================================================================================================================");
 }

}









 }
}