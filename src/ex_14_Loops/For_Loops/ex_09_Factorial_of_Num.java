package ex_14_Loops.For_Loops;

import java.util.Scanner;
public class ex_09_Factorial_of_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <=num ; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + "is : " + factorial);
    }
}
