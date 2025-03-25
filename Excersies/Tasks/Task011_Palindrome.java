package Tasks;

import java.util.Scanner;

public class Task011_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a input to find palindrome : " );
        String input = sc.nextLine();
//        String input = "naman";
        input = input.toLowerCase();

//        String temp ="";
//        for (int i = input.length()-1; i>=0; i--) {
//
//            temp = temp + input.charAt(i);
//
//        }
//        if(input.equals(temp)){
//            System.out.println(input + " is a palindrome");
//        }else {
//            System.out.println(input + " Is not a palindrome");
//
//        }
        reverse(input);
    }

    static void reverse(String input ){
        String temp ="";
        for (int i = input.length()-1; i>=0; i--) {

            temp = temp + input.charAt(i);

        }
        if(input.equals(temp)){
            System.out.println(input + " is a palindrome");
        }else {
            System.out.println(input + " Is not a palindrome");

        }


    }
}
