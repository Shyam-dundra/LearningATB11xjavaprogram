package Practice_Programs;

public class traiangle {
    public static void main(String[] args) {

        int n = 5;
        int x = 1;
        int y=0;
        int s = n/2;
        int h=n/2;
//        for (int i = 0; i <n/2; i++) {
//
//            for (int j = s+1; j >= 0; j--) {
//                System.out.print(" ");
//
//            }
//            s= s-2;
//            for (int j = 0; j<x; j++) {
//                System.out.print( "Y ");
//
//                }
//            x+=2;
//            System.out.println();
//
//        }
//        for (int i = 0; i <(n/2)+1 ; i++) {
//            if(i!=0) {
//                for (int j = h- 1; j >= 0; j--) {
//                    System.out.print(" ");
//                }
//                h = h + 1;
//            }
//            for (int j = 0; j<n-y ; j++) {
//                System.out.print( "X ");
//            }
//            y+=2;
//            System.out.println();
//
//        }
//        String[] m ={"zdxc", "hjdfn"};
//        int hj = 1234567;
//        char vbn ='r';
//        Array[] hi = new Array[5];
//        float jk = '0';
//        double lk = 0.99990;
//        boolean nas = true;
//        System.out.println();
//
//        int t = 5;

//
        for (int i = 0; i < n; i++) {

            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//            // Lower half of the diamond
//            for (int i = 1; i  <  n; i++) {
//                // Print spaces
//                for (int j = 0; j  <  i; j++) {
//                    System.out.print(" ");
//                }
//                // Print asterisks
//                for (int k = n - 1; k  >= i; k--) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
//            int m = 20;
//        for (int i = 1; i <=n ; i++) {
//            for (int j =1; j <=n; j++) {
//                System.out.print(m+ " ");
//                m-=1;
//
//            }
//            m+=1;

//            System.out.println( );



//        }


    }
}
