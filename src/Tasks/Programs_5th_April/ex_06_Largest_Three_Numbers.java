package Tasks.Programs_5th_April;

import java.util.Scanner;

public class ex_06_Largest_Three_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        System.out.println("Enter the Third number");
        int num3 = sc.nextInt();

        int largest;

        if(num1>=num2 && num1 >= num3){
            largest = num1;
        }else if(num2 >= num1 && num2>= num3) {
            largest = num2;
        }else{
            largest = num3;
        }
        System.out.println("Largest number is : " + largest);
    }
}

//class numbers{
//    int num1;
//    int num2;
//    int num3;
//
//    void numbers (int num1, int num2, int num3){
//        this.num1 = num1;
//        this.num2 = num2;
//        this.num3 = num3;
//
//        if (num1 >= num2 && num2 >= num3 && num3 >= num1){
//
//
//        }
//
//    }
//}
