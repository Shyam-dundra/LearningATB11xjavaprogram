package ex_14_Loops.For_Loops;

import java.util.Scanner;

public class ex_11_Calculate_Factorial_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num ; i++) {

            factorial *= i;
        }
        System.out.println("Factorial of " + num + "is : " + factorial);

    }
}
