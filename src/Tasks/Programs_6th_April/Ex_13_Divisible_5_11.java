package Tasks.Programs_6th_April;

import java.util.Scanner;

public class Ex_13_Divisible_5_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check divisible by 5 are 11 : ");
        int num = sc.nextInt();

        if (num%5 == 0 ){
            System.out.println(num + " is divisible by 5");
        } else if (num % 11 == 0) {

            System.out.println(num + " is divisible by 11");
        }else{
            System.out.println("Given number is not divisible by 5 and 11");
        }

    }
}
