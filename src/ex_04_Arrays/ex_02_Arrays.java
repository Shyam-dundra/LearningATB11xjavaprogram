package ex_04_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ex_02_Arrays {
    public static void main(String[] args) {
        int [] arr = new int[6];
        arr[0]=5;
        arr[1]=6;
        arr[2]=7;
        arr[3]=5;
        arr[4]=6;
        arr[5]=7;

       StringBuffer sb = new StringBuffer();

       for (int num : arr) {
           sb.append(num).append(" ");
       }
        System.out.println("Print in sequence using StringBuffer: " + sb.toString());
        System.out.println("Print in sequence by using Arrays : " + Arrays.toString(arr));


    }
}
