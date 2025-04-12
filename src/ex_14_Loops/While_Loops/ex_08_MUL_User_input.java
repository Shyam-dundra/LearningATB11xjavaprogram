package ex_14_Loops.While_Loops;

import java.util.Scanner;

public class ex_08_MUL_User_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int count = 1;

        while (count<=10){

            System.out.println(num + "*"+ count + "=" + num*count);
            count++;
        }
    }
}
