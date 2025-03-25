package Practice_Programs;

public class starpattern {
    public static void main(String[] args) {
        int F = 5;
        for (int i = 0; i <= F; i++) {
            for (int j = i; j < F; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }


        for (int i = 0; i < 5; i++) {
            // Print spaces
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        //star pattern program
        int n = 6;
        System.out.println();
        for (int i = 1; i < n; i++) {

//            for (int j = 1; j <= n - i + 1; j++) {
                for (int j = i; j < n ; j++) {
                System.out.print("* ");
            }
            System.out.println( " ");

        }
    }
}
