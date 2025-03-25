package Tasks;

import java.util.Scanner;

public class Task002_Grade_calculator {
    public static void main(String[] args) {

    int score = 85;

    char grade;
    if (score >=90 && score < 100) {
        grade = 'A';
    }else if (score >= 80 && score < 89) {
        grade = 'B';
    } else if (score >= 70 && score < 79) {
        grade = 'C';
    } else if (score >= 60 && score < 69) {
        grade = 'D';
    }else
        grade='F';
    System.out.println( " The grade for the score is : " + grade);



    //Practice code for user input
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the first score ");
//        int score1 = scanner.nextInt();
//        System.out.println("Enter the second score ");
//        int score2 = scanner.nextInt();
//        System.out.println("Enter the third score  ");
//        int score3 = scanner.nextInt();
//        double average = (score1 + score2 + score3) / 3.0;
//        char grade;
//
//        if (average >= 90) {
//            grade = 'A';
//        } else if (average >= 80) {
//            grade = 'B';
//        } else if (average >= 70) {
//            grade = 'C';
//        } else if (average >= 60) {
//            grade = 'D';
//        } else
//            grade = 'E';
//        System.out.println("average " + average);
//        System.out.println("Grade" + grade);
    }
}