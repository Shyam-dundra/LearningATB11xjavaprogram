package Practice_Programs;

public class right_starpattern {
    public static void main(String[] args) {
        int a = 5;
        // 5,4,3,2,1
//        for (int i = 1; i <=a; i++) {
//            for (int j = i; j <=a; j++) {
//                System.out.print("* ");
//            }
//            System.out.println( " ");
//       }

        for (int i = 1; i <=a; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");

        }
    }
}
