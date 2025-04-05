package Tasks.Programs_4th_April;

import java.util.Scanner;

public class Ex_04_Vowels_Consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        vowels_Consonant v1 = new vowels_Consonant(sc.next().charAt(0));
        v1.Find();

        
        sc.close();

    }

}

class vowels_Consonant {
    char a;
    char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
    

    vowels_Consonant(char a) {
        this.a = a;
    }

    void Find() {

        for (int num : vowels) {
            if (a == num) {

                System.out.println("Given char is vowels :" + a);
                
                return;
            }

        }
        System.out.println("Given char is Consonant: " + a);

        System.out.println(vowels.length);

    }
}

