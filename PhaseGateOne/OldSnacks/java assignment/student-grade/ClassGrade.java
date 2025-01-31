import java.util.Scanner;
public class ClassGrade {
public static void Main(String[]  args) {
Scanner input = new Scanner(System.in);
int total = 0;
int gradeCount = 1;


while  (gradeCounter <= 10) {
 System.out.print("enter grade");
int grade = input.nextInt();
 total = total + grade;
gradeCounter  = gradeCounter + 1;
 }
int average = total / 10;

System.out.printf("%nTotal of all 10 grade is %d%n", total);
System.out.printf("Class average is %d%n", average);























}



















}