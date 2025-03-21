package Tasks;

import java.util.Scanner;

public class Task010_Vowels_Consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value to find vowels and consonants : " );
        String input = sc.nextLine();
        input = input.toLowerCase();
        int Vowels =0, Consonants =0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' ){
                Vowels++;
            } else if (ch>='a' && ch<='z') {
                Consonants ++;
            }
        }
        System.out.println("No.of Vowels : " +Vowels);
        System.out.println("No.of Consonants : " +Consonants);
    }
}
