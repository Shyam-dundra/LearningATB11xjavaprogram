package Tasks.Programs_6th_April;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex_15_Senior_Citizen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age : ");

        try {
            int age = sc.nextInt();

            if (age >= 0 && age <= 12) {
                System.out.println("Age belongs to Child");
            } else if (age >= 13 && age <= 19) {
                System.out.println("Age belongs to Teenager");
            } else if (age >= 20 && age <= 64) {
                System.out.println("Age belongs to Adult");
            } else {
                System.out.println("Age belongs to Senior Citizen");
            }
        }catch(java.util.InputMismatchException e){
            System.out.println("Error: Invalid input! Please enter a valid integer for age.");
        }
        sc.close();
    }
}
