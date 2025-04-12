package ex_14_Loops.For_Loops;

import java.util.Scanner;

public class ex_10_Check_Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num < 2 ){
            isPrime = false;
        }else {
            for (int i = 2; i <= num/2; i++) {
                if (num %i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(num + " is a Prime number");
        }else {
            System.out.println(num + " is not a Prime number");
        }
        sc.close();
    }
}
