package Tasks.Programs_4th_April;

import java.util.Scanner;

public class Ex_02_Even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter a Number: ");
        number2 num1 = new number2(sc.nextInt());
        num1.num();
        

        sc.close();
    }

}
class number2{
    int num;
    number2 (int num){
        this.num = num;
    }
    void num (){
        if (num %2 == 0){

            System.out.println("Given Number is Even: " + num);
        }else{
            System.out.println("Given Number is Odd: "+ num);
        }

    }
}
