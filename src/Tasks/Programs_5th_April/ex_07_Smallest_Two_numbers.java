package Tasks.Programs_5th_April;

import java.util.Scanner;

public class ex_07_Smallest_Two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second number : ");
        int num2 = sc.nextInt();

        int smallest;

        if (num1<= num2){

            smallest = num1;
        } else {
            smallest = num2 ;
        }
        System.out.println("Smallest number : " + smallest);
    }

}
