package ex_16_Generics;

public class ex_01_Generics {
    public static void main(String[] args) {

        temp_sum(3,5);
        temp_sum(3.44,3.55);
        temp_sum("Shyam", "DUndra");

        System.out.println(temp_sum("SHyam","Dundra"));
        System.out.println(temp_sum(3,6));
        System.out.println(temp_sum(3.44,3.55));




    }
    static int temp_sum(int a, int b){
        return a+b;
    }
    static double temp_sum(double a, double b){
        return a+b;
    }
    static String temp_sum(String a, String b){
        return a+b;
    }
}


