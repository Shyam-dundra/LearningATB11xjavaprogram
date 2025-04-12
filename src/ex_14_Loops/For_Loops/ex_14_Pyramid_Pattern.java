package ex_14_Loops.For_Loops;

public class ex_14_Pyramid_Pattern {
    public static void main(String[] args) {
        int n = 5;
        int stars = 1;
        for (int i = 0; i < n ; i++) {

            for (int j = 0; j < n-i; j++) {

                System.out.print(" ");
            }
            for (int k = 0; k < stars; k ++) {

                System.out.print("*");
            }
            stars += 2;
            System.out.println();

        }
    }
}
