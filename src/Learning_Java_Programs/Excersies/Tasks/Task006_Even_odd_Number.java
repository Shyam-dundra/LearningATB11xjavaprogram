package Tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task006_Even_odd_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        int num = sc.nextInt();

        if (num%2 == 0){

            System.out.println("The Entered number is Even number : " + num);
        }else {

            System.out.println("The Entered number is odd number : " + num);
        }
        System.out.println();

    }
}
