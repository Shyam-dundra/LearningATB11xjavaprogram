package Practice_Programs;

import java.util.Scanner;

public class Grade_caclulator_001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first score ");
        int score1 = scanner.nextInt();
        System.out.println("Enter the second score ");
        int  score2 = scanner.nextInt();
        System.out.println("Enter the third score  ");
        int score3 = scanner.nextInt();

        double average = (score1 + score2 + score3)/3.0 ;
        char  grade;

        if ( average >= 90){
            grade = 'A';
        }else if (average >= 80){
            grade = 'B';
        }else if (average >= 70){
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        }
        else
            grade = 'E';
        System.out.println("average " + average);
        System.out.println("Grade" +  grade);
    }
}
