package Tasks.Programs_5th_April;

import java.util.Scanner;

public class ex_09_Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year : ");
        int year = sc.nextInt();

        if (year% 400 == 0){
            System.out.println(year + " is a Leap year");
        } else if (year % 100 == 0 ) {
            System.out.println(year + " is not a Leap Year");
        }else if (year % 4 == 0){
            System.out.println(year + " is a Leap Year ");
        }else {
            System.out.println(year + " is not a Leap Year");
        }
        sc.close();
    }
}
