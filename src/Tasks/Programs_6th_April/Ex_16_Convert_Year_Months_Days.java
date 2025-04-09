package Tasks.Programs_6th_April;

import java.util.Scanner;

public class Ex_16_Convert_Year_Months_Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the days : ");

        int total_days = sc.nextInt();
        /* Wrapper class */
        Integer name = total_days;

        int Years = name/365 ;
        int remaining_days = name % 365;
        int months = remaining_days/30;
        int days = remaining_days % 30;

        System.out.println("Converted Time: " + Years + " years, " + months + " months, and " + days + " days.");

        sc.close();
    }
}
