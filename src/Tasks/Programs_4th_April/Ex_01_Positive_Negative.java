package Tasks.Programs_4th_April;

import java.util.Scanner;

public class Ex_01_Positive_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
    System.out.print("Please Enter a Number : ");
    number1 num1 = new number1(sc.nextInt());
    num1.num();
    sc.close();
    } 
}
class number1{
    int num;
    number1(int num){
        this.num = num;

    }
    void num (){
        if (this.num >= 0){
            System.out.println("Given number is positive: "+ num);
        }else {
            System.out.println("Given number is Negative: "+ num);
        }

    }

   
}