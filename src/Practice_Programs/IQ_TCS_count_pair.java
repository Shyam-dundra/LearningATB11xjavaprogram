package Practice_Programs;

import java.util.*;

public class IQ_TCS_count_pair {
    public static void main(String[] args) {
        int[] arr = {5, 15, 25, 35, 45};
        int x =200;
        int y = 2000;
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                String concatString = Integer.toString(arr[i])+ Integer.toString(arr[j]);
                int concatvalue = Integer.parseInt(concatString);

                if(concatvalue>=x && concatvalue<=y){
                    count++;
                }

            }
            
        }
        System.out.println("Total pairs : " + count);
    }
}
