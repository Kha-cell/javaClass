import java.util.Scanner;

public class MbtiTest{
  public static void main(String[] args) {

     String[][] number = new String[20][2];
    int[] answers = new int[20];
    Scanner input = new Scanner(System.in);
        
   number[0] = new String[]{"expend energy, enjoy groups", "conserve energy, enjoy one-on-one"};
   number[1] = new String[]{"interpret literally", "look for meaning and possibilities"};
   number[2] = new String[]{"logical, thinking, questioning", "empathetic, feeling, accommodating"};
  number[3] = new String[]{"organized, orderly", "flexible, adaptable"};
        number[4] = new String[]{"more outgoing, think out loud", "more reserved, think to yourself"};
        number[5] = new String[]{"practical, realistic, experiential", "imaginative, innovative, theoretical"};
        number[6] = new String[]{"candid, straight forward, frank", "tactful, kind, encouraging"};
        number[7] = new String[]{"plan, schedule", "unplanned, spontaneous"};
        number[8] = new String[]{"seek many tasks, public activities, interaction with others", "seek private, solitary activities with quiet to concentrate"};
        number[9] = new String[]{"standard, usual, conventional", "different, novel, unique"};
        number[10] = new String[]{"firm, tend to criticize, hold the line", "gentle, tend to appreciate, conciliate"};
        number[11] = new String[]{"regulated, structured", "easygoing, 'live' and 'let live'"};
        number[12] = new String[]{"external, communicative, express yourself", "internal, reticent, keep to yourself"};
        number[13] = new String[]{"focus on here-and-now", "look to the future, global perspective, 'big picture'"};
        number[14] = new String[]{"tough-minded, just", "tender-hearted, merciful"};
        number[15] = new String[]{"preparation, plan ahead", "go with the flow, adapt as you go"};
        number[16] = new String[]{"active, initiate", "reflective, deliberate"};
        number[17] = new String[]{"facts, things, 'what is'", "ideas, dreams, 'what could be,' philosophical"};
        number[18] = new String[]{"matter of fact, issue-oriented", "sensitive, people-oriented, compassionate"};
        number[19] = new String[]{"control, govern", "latitude, freedom"};
        
        System.out.println("Welcome to mbti Test");
        System.out.println("Press 0 for option (A)\nPress 1 for option (B)");
for(int index = 0; index < 20; index++) {
   System.out.println("\nnumber " + (index + 1));
   System.out.println("A: " + number[index][0]);
   System.out.println("B: " + number[index][1]);
   System.out.print("Your answer (0/1): ");
   answers[index] = input.nextInt();
        }

int E = 0;   
int S = 0;  
int T = 0;          
int J = 0; 
int I = 0;
int N = 0;
int F = 0;
int P = 0;
      
 if(answers[0] == 0) E++; 
 else I++;
 if(answers[4] == 0) E++; 
 else I++;
 if(answers[8] == 0) E++; 
 else I++;
 if(answers[12] == 0) E++;
 else I++;
 if(answers[16] == 0) E++;
 else I++;        
 if(answers[1] == 0) S++;
 else N++;
 if(answers[5] == 0) S++;
 else N++;
 if(answers[9] == 0) S++; 
 else N++;
 if(answers[13] == 0) S++;
 else N++;
 if(answers[17] == 0) S++;
 else N++;     
 if(answers[2] == 0) T++;
 else F++;
 if(answers[6] == 0) T++;
 else F++;
 if(answers[10] == 0) T++;
 else F++;
 if(answers[14] == 0) T++;
 else F++;
 if(answers[18] == 0) T++;
 else F++;       
 if(answers[3] == 0) J++;
 else P++;
 if(answers[7] == 0) J++;
 else P++;
 if(answers[11] == 0) J++;
 else P++;
 if(answers[15] == 0) J++; 
 else P++;
 if(answers[19] == 0) J++; 
 else P++;
        
  String type = "";
        
        
        if(E > I)
            type += "E";
        else
            type += "I";
            
        if(S > N)
            type += "S";
        else
            type += "N";
            
        if(T > F)
            type += "T";
        else
            type += "F";
            
        if(J > P)
            type += "I";
        else
            type += "P";
           
        System.out.println("\nScores for each Number:");
        System.out.println("E: " + E + " vs I: " + I);
        System.out.println("S: " + S + " vs N: " + N);
        System.out.println("T: " + T + " vs F: " + F);
        System.out.println("I: " + I + " vs P: " + P);

	System.out.println("\nYour personality type is: " + type);


}
}