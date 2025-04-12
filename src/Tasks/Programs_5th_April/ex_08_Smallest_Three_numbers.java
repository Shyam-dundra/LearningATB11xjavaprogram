package Tasks.Programs_5th_April;

import java.util.Scanner;

public class ex_08_Smallest_Three_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the Third number : ");
        int num3 = sc.nextInt();

        int smallest;

        if(num1 <= num2 && num1<= num3){
            smallest = num1;
        } else if (num2<= num1 && num2 <= num3) {

            smallest = num2;
        }else {
            smallest = num3;
        }
        System.out.println("Smallest of Three numbers is : " + smallest );
    }
}
