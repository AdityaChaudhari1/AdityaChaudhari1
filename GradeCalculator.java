import java.util.*;
public class GradeCalculator{
    public static void main(String args[]) {
     Scanner sc=new Scanner (System.in);
      System.out.println("Welcome to the Student Grade Calculator!");
      System.out.print("Enter the number of subjects: ");
     int totlSubjects=sc.nextInt();
     float totlScore=0;
     for(int i=1;i<=totlSubjects; i++){
         System.out.print("Enter the score for subject " + i + ": ");
        double totlSubScr =sc.nextDouble();
         totlScore +=totlSubScr;
        System.out.println(totlScore);
         }
         float avrageGrade= ((float)totlScore / totlSubjects) *100;
           avrageGrade= avrageGrade/100;
           System.out.println("Average Percantage: " + avrageGrade +" %");
        System.out.println("Letter Grade: " + calculateLetterGrade(avrageGrade));

        sc.close();
        }
         private static char calculateLetterGrade(double averageScore) {
        if (averageScore >= 90) {
            return 'A';
        } else if (averageScore >= 80) {
            return 'B';
        } else if (averageScore >= 70) {
            return 'C';
        } else if (averageScore >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}

