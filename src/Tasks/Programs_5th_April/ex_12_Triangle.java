package Tasks.Programs_5th_April;

import java.util.Scanner;

public class ex_12_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the A length : ");
        int A = sc.nextInt();
        System.out.print("Enter the B length : ");
        int B   = sc.nextInt();
        System.out.print("Enter the C length : ");
        int C = sc.nextInt();

        if(A+B>C && A+C > B && B+C > A){
            System.out.println("The Given sides are valid Triangle");
        }else{
            System.out.println("The Given sides are not Valid Triangle");
        }
        sc.close();
    }
}
