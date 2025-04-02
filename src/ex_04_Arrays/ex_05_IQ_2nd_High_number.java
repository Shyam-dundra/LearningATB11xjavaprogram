package ex_04_Arrays;

import java.util.Arrays;

public class ex_05_IQ_2nd_High_number {
    public static void main(String[] args) {
        int [] num = {10,12,134,54,56,7,6543,};

        Arrays.sort(num);
        System.out.println(num[num.length-2]);
        System.out.println(num[num.length-1]);
        
    }

}
