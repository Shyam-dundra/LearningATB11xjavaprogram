package Practice_Programs;

import java.util.Scanner;

public class substring {
    public static void main(String[] args) {

        int start = 0;
        int end = 0;
       Scanner s = new Scanner(System.in);
        System.out.println("please enter start value " );
       start = s.nextInt();
       Scanner n = new Scanner(System.in);
        System.out.println("Please enter end value " );
       end = n.nextInt();
       String var = "Helloworld";

//        for (int i = 0; i < var.length(); i++) {
//
//            if( i>=start && i<end)
//            System.out.print( var.charAt(i));
//        }
//        var.substring(start, end);
        System.out.println(var.substring(start, end));

    }
}
