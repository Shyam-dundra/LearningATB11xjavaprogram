package Practice_Programs;

public class star_pattern {
    public static void main(String[] args) {
        int n =3;

        for (int i = 0; i  <  n; i++) {
            // Print spaces
            for (int j = n - 1; j  >  i; j--) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int k = 0; k  <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i  <  n; i++) {
            // Print spaces
            for (int j = 0; j  <  i; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int k = n - 1; k  >= i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
