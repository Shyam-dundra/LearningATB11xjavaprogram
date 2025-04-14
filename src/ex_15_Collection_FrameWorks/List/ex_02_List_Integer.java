package ex_15_Collection_FrameWorks.List;

import java.util.ArrayList;

public class ex_02_List_Integer {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();

        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);

        int sum = 0;

        for(int total : num){
            sum += total;
        }
        System.out.println("Numbers list : " + num);

        System.out.println("Total sum of list : " + sum );
    }
}
