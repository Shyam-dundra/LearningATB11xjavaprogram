package ex_14_Loops.While_Loops;

public class ex_07_Sum_1_to_100 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 1;

        while (count <= 100){
            sum +=count;
            count++;
        }
        System.out.println("Sum of 1 to 100 is : "+ sum);
    }
}
