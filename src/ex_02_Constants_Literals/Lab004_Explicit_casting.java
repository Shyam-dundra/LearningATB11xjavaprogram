package ex_02_Constants_Literals;

public class Lab004_Explicit_casting {
    public static void main(String[] args) {
        double num = 9.78;
        int num1 = (int) num ;// explicit casting from double to int
        int num2 = num1;
        System.out.println("double num " + num);
        System.out.println("int num1 " + num1);
    }
}
