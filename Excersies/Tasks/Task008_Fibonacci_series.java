package Tasks;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Task008_Fibonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find Fibonacci series : ");
        int n = sc.nextInt();
        int first =0, second = 1;

        System.out.println("Fibonacci series " + n +" terms ");
        for (int i = 0; i <=n ; i++) {

            System.out.print(first + " ");

            int next = first + second;

            first = second;
            second = next;
        }

    }
}
