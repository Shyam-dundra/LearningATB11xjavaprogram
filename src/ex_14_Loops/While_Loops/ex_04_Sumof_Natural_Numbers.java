package ex_14_Loops.While_Loops;

public class ex_04_Sumof_Natural_Numbers {
    public static void main(String[] args) {
        int sum = 0;
        int count = 1;

        while (count<=10){
            sum += count;

            count ++;
        }
        System.out.println("Sum of 10 natural numbers : "+ sum);
    }
}
