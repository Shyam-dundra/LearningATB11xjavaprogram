package ex_04_Arrays;

import java.util.Scanner;

public class ex_05_right_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of pattern : ");
        int n = sc.nextInt();
        for (int i = 0; i <n ; i++) {
            for (int j = n; j >i; j--) {

                System.out.print(" ");
            }
            for (int k = 0; k <=i; k++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }
}
