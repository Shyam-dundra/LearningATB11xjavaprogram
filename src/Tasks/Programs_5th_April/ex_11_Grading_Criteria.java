package Tasks.Programs_5th_April;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ex_11_Grading_Criteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks to find the Grade : ");
        int marks= sc.nextInt();
        if (marks > 100 || marks < 0) {
            System.out.println("❌ Error: Marks should be between 0 and 100.");
        }
        else if(marks >= 90 && marks <= 100) {
            System.out.println("A+ Grade");
        } else if (marks >= 80 && marks <=89) {
            System.out.println("A Grade");
        } else if (marks >= 70 && marks <= 79 ) {
            System.out.println("B Grade");
        } else if (marks >= 60 && marks<= 69) {
            System.out.println("C Grade");
        }else if (marks >= 50 && marks<= 59){
            System.out.println("D Grade");
        }else if (marks >= 40 && marks<= 49) {
            System.out.println("E Grade");
        }else {

            System.out.println("Below 40 Fail");
        }

        sc.close();
    }
}
