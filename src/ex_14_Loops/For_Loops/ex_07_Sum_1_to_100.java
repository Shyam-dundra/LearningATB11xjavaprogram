package ex_14_Loops.For_Loops;

public class ex_07_Sum_1_to_100 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <=100 ; i++) {

            sum += i;
        }
        System.out.println("Sum of 1 to 100 is : " + sum);

    }
}
