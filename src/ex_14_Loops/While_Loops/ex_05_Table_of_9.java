package ex_14_Loops.While_Loops;

public class ex_05_Table_of_9 {
    public static void main(String[] args) {
        int num = 9;
        int mul = 0;
        while ( mul <= 10) {
            System.out.println(num + "*" + mul + " = " + num * mul);
            mul++;
        }
    }
}
