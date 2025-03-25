package Practice_Programs;

import java.util.Scanner;


public class tables {
    public static void main(String[] args) {
        int table_ten_times;
        Scanner s = new  Scanner(System.in);

        System.out.print( "Enter a number:  ");
       table_ten_times = s.nextInt();

        for (int i = 1; i <= 10; i++) {


            System.out.println(table_ten_times+ "*" + i + " =  " + table_ten_times*i );

        }

    }
}
