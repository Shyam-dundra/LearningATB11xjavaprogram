package Tasks;

public class Task014_Pyramid_Traingle {
    public static void main(String[] args) {
        Pyramid_Triangle();
    }
    static void Pyramid_Triangle(){
        int n = 5;
        int star = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <star ; k++) {
                System.out.print("*");

            }
            star+=2;
            System.out.println();

        }

    }
}
