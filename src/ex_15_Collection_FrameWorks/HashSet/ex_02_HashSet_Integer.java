package ex_15_Collection_FrameWorks.HashSet;

import java.util.HashSet;

public class ex_02_HashSet_Integer {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);
        set.add(30);

        System.out.println("Set list : "+ set);

        for(int num : set){

            System.out.println(num);
        }
    }
}
