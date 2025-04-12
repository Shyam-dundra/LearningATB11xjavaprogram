package ex_14_Loops.For_Loops;

public class ex_13_Inverted_right_Triangle {
    public static void main(String[] args) {
        int n = 5 ;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
