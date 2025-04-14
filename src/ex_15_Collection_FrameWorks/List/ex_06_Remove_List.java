package ex_15_Collection_FrameWorks.List;

import java.util.ArrayList;

public class ex_06_Remove_List {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        num.add(60);
        System.out.println("Original numbers List : "+ num);
       num.removeIf(n -> n > 40);
       System.out.println("After removing Greater than 40 Num_List is : "+ num);
    }
}
