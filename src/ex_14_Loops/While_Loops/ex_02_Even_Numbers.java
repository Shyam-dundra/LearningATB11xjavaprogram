package ex_14_Loops.While_Loops;

public class ex_02_Even_Numbers {
    public static void main(String[] args) {
        int num = 1;
        while(num<=20){

            if(num%2 == 0){

                System.out.println("Even Number : "+ num );
            }
            num++;
        }
    }
}
